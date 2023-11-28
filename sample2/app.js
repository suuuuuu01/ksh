// 라이브러리 설정.
const session = require('session')
const express = require('express')
const multer = require('multer')
const path = require('path')

var storage = multer.diskStorage({
    // 폴더경로 관련 설정
    destination(req,file,cb) {
        cb(null, 'upload/');
    },
    // 파일명 설정 : 중복이름 해결
    filename(req, file, cb) {
        const ext = path.extname(file.originalname);
        const baseName = path.basename(file.originalname, ext);
        // 중복되지 않는 파일명 이름 생성.
        const fileName = baseName + "_" + Date.now() + ext;
        console.log("파일정보 : ", fileName)
            cb(null, fileName);
    },
    // 5MB 제한.
    limits : {fileSize: 5*1024 *1024}
});

// 업로드 관련 설정
var upload = multer({storage: storage})


const app = express()

const ejs = require('ejs') // jsp와 유사한 뷰 템플릿
const moment = require('moment')
const port = 3000

// const mysql = require('mysql2')
// const dbconfig = require('./config/db.js')
// const conn = mysql.createConnection(dbconfig) // mysql 연결객체 생성.

console.log('데이터베이스 연결 성공')

// req.body 속성을 사용하여 클라이언트의 정보를 확인할때 사용.
// middleware인 body-parser 패키지가 설치되어 있어야 한다.
const bodyparser = require('body-parser')

// 설정.
app.set("view engine", "ejs");
app.set('views', './views');

// 클라이언트에서 전송한 json정보를 parsing하기 위하여 설정
app.use(express.json());

app.use(bodyparser.urlencoded({extended: false}))

// 클라이언트 파일(*.css, 이미지파일, *.js(유효성검사 같은 것) 등)
app.use(express.static(__dirname + '/public'))

// 업로드 폴더 경로 설정
app.use('/upload', express.static(__dirname + '/upload'));

// 세션 설정
app.use(session({secret: 'ads', cookie: {maxAge:60000}, resave: true, saveUninitialized:true}))

// node.js 경로 요청 시 매번 동작이 된다.
app.use((req, res, next) => {
    // nodejs에서 ejs 사용 시 전역변수 선언.
    res.locals.m_id = "";
    res.locals.m_name = "";

    if(req.session.meminfo) {
        req.session.meminfo.m_id;
        req.sessioin.meminfo.m_name;
    }
})

// 라우팅(경로) 설정. 설명> 스프링에서 Controller 클래스에서의 매핑주소.
// req : requsest객체. 클라이언트에서 전송된 정보를 담당하는 객체.
// res : response객체. 서버에서 클라이언트로 응답하기 위한 정보를 담당하는 객체.
app.get('/', (req, res) => {
// res.send('<h1>Hello World!</h1>') // Hello World! 문자열을 클라이언트(브라우저)로 보내는 작업.
res.render('index') // 파일명 : ./views/index.ejs
})

// 매핑주소와 파일명은 일치하지 않아도 된다.
app.get('/testA', (req, res) => {
// res.send('<h1>testA</h1>')
res.render('demo')
})

app.get('/testB', (req, res) => {
res.render('testB')
})

// 게시판 글쓰기
app.get('/write', (req, res) => {
res.render('write')
})

// 게시판 글쓰기 저장
app.post('/writePro', (req, res) => {
    console.log("writePro");
    console.log(req.body);

    const title = req.body.title;
    const writer = req.body.writer;
    const content = req.body.content;

    var sql = `insert into board(title, content, writer) values(?, ?, ?)`;
    var values = [title, content, writer];

    conn.query(sql, values, function(err, result){
        if(err) throw err;
        console.log("데이터 삽입" + result.length);
        // res.send("<script>alert('게시물이 등록됨');location.href='/list';</script>")
        res.redirect('/list');
    })
})

// 게시판 목록
app.get('/list', (req,res) => {
var sql = `select bno, title, writer, regdate from board order by bno desc;`
conn.query(sql, function(err,results, field) {
    if(err) throw err;
  // 파일명 (list.ejs)
  // {lists = ejs내에서 사용할 데이터명 (model.addAttributes와 비슷함)}
    res.render('list' ,{lists : results}) 

    })
})

// 게시글 조회
app.get("/get", (req,res) => {
var bno = req.query.bno;
var sql = `select bno, content, title, writer, regdate from board where bno = ${bno}`
conn.query(sql, function(err, result) {
    if(err) throw err;
    res.render("get",{data: result[0]})
    })
})

// 게시글 수정폼
app.get("/modify", (req,res) => {
var bno = req.query.bno;
var sql = `select bno, content, title, writer, regdate from board where bno = ${bno}`
conn.query(sql, function(err, result) {
    if(err) throw err;
    res.render("modify",{data: result[0]})
    })
})

// 게시글 수정
app.post("/modifyPro", (req, res) => {
// console.log("수정하기", req.body);

const bno = req.body.bno;
const title = req.body.title;
const content = req.body.content;

var sql = `update board set title=?, content=? where bno=?`
var values = [title, content, bno]

conn.query(sql, values, function(err, result) {
    if(err) throw err;
    res.send("<script>alert('게시물이 수정됨'); location.href='/list';</script>")
    })
})

// 게시글 삭제
app.get("/delete", (req,res) => {
var bno = req.query.bno;
var sql = `delete from board where bno = ${bno}`
var sql = 'delete from board where bno =' + bno
conn.query(sql, function(err,result) {
    if(err) throw err;

    res.send("<script>alert('삭제함');location.href='list';</script>")
    })
})

// 파일 업로드
app.get("/up_write", (req,res) => {
res.render("up_write")
})

// 파일 업로드 저장
app.get("/up_writePro" ,upload.single('p_img') ,(req,res) => {
// 업로드 된 파일 정보
    console.log(req.file); // 업로드된 파일정보 확인
    console.log(req.body); // 일반 입력텍스트정보 확인

    const name = req.body.p_name;
    const savefname = req.file.filename;
    const originfname = req.file.originfname;

    var sql = `insert into product(p_name, p_s_img, p_o_img) values(?, ?, ?)`
    var values = [name, savefname, originfname]

    conn.query(wql, values, function(err, result) {
        if(err) throw err;
        res.send("<script>alert('상품 등록됨'); location.href='/pro_list';</script>")
    })
})

// 상품리스트
app.get('/pro_list', (req,res) => {
    var sql = `select p_code, p_name, p_s_img, p_o_img, regdate from product order by p_code desc;`
    conn.query(sql, function(err,results, field) {
        if(err) throw err; // 예외처리
      // 파일명 (list.ejs)
      // {lists = ejs내에서 사용할 데이터명 (model.addAttributes와 비슷함)}
        res.render('pro_list' ,{lists : results}) // list.ejs    
        })
    })

// nodejs기반으로 서버를 실행시켜주는 구문.
app.listen(port, () => {
    console.log(`Example app listening on port ${port}`)
})

// 회원가입 폼
app.get('/join', (req,res) => {
    res.render('join')
})

// 암호화 모듈 읽기.
const bcrypt = require('bcrypt');

// 회원정보 저장
app.post('/join_ok', (req, res) => {

    const m_id = req.body.m_id;
    const m_name = req.body.m_name;
    const m_pwd = req.body.m_pwd;
    const m_zipcode = req.body.m_zipcode;
    const m_addr = req.body.m_addr;
    const m_addrdetail = req.body.m_addrdetail;

    // 비밀번호 암호화
    const saltrounds = 10;
    bcrypt.hash(m_pwd, saltrounds, (err, hashedPw) => {
        if(err) {
            res.status(500).json({msg : 'hashedfail'})
        }else {
            var sql = `insert into m_info(m_id, m_name, m_pwd, m_zipcode, m_addr, m_addrdetail) values(?, ?, ?, ?, ?, ?)`;
            var values = [m_id, m_name, m_pwd, m_zipcode, m_addr, m_addrdetail];

            conn.query(sql, values, function(err, result){
                if(err) {
                    res.status(500).json({msg : 'fail'})                
                }else {
                    res.status(200).json({msg : 'success'})
                }
            })
        }
    })

    // 아이디 중복체크
    app.post('/idcheck', (req, res) => {
        const m_id = req.body.m_id;

        var sql = `select m_id from meminfo where m_id = '${m_id}'`

        conn.query(sql, function(err, result) {
            if(err) throw err;

            if(result.length == 0) {
                res.status(200).json({msg : 'yes'})
            }else {
                res.status(200).json({msg : 'no'})
            }
        })
    })

    // 로그인 폼
    app.get("/modify", (req,res) => {

        res.render('login') // login.ejs
    })

    // 로그인 인증 : 세션 정보를 저장하는 방식(1.메모리, 2.파일 3.db(mysql 에 세션테이블 생성))
    app.post('/login_pro', (req, res) => {
        // const m_id = req.body.m_id;
        // const m_pwd = req.body.m_pwd;

        const {m_id, m_pwd} = req.body;

        var sql = `select m_id from meminfo where m_id='${m_id}'`;

        conn.query(sql, function(err, result) {
            if(result.length == 0) {
                res.send("<script>alert('아이디 확인요망'); location.href='/login';</script>")
            }else {
                // 아이디가 일치된 경우

                // 비밃너호 일치여부 확인
                bcrypt.compare(m_pwd, results[0].m_pwd, (bcryptErr, bcryptResult) => {
                    if(bcrypter || bcryptResult ) {
                        res.send("<script>alert('비밀번호 확인요망'); location.href='/login';</script>")
                    }else {
                        console.info('meminfo', result[0]); // 회원정보 출력
                        req.session.meminfo = result[0]; // 회원정보를 세션 meminfo 이름으로 저장.
                    }                    
                }
                ) // 값 여러 개 ->  for문
            }
        })
    })

    // node.js 경로 요청 시 매번 동작이 된다.
    app.use((req, res, next) => {
        // nodejs에서 ejs 사용 시 전역변수 선언.
        res.locals.m_id = "";
        res.locals.m_name = "";

        if(req.session.meminfo) {
            req.session.meminfo.m_id;
            req.sessioin.meminfo.m_name;
        }
    })
})

// 로그아웃
app.get('/logout', (req, res) => {
    req.session.meminfo = null;
    res.send("<script>alert('로그아웃 완료'); location.href='/login';</script>")
})
// nodejs기반으로 서버를 실행시켜주는 구문.
app.listen(port, () => {
    console.log(`Example app listening on port ${port}`)
})
