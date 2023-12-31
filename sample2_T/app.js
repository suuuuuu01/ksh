const express = require('express')
const session = require('express-session')
const multer = require('multer')
const path = require('path')

// 변수에 업로드 관련설정정보 저장
var storage = multer.diskStorage({
    // 업로드 폴더설정
    destination(req, file, cb) {
        cb(null, 'upload/');
    },
    // 파일명 설정 : 중복이름 해결
    filename(req, file, cb) {
        const ext = path.extname(file.originalname);
        const baseName = path.basename(file.originalname, ext);
        //현재 시간정보를 이용하여, 중복되지 않는 파일명 이름생성.
        const fileName = baseName + "_" + Date.now() + ext;
        console.log("파일명", fileName);
        cb(null, fileName);

    },
    limits : {fileSize: 5 * 1024 * 1024} // 5mb제한
});

// 업로드 관련설정작업
var upload = multer({storage : storage})


const app = express()

const ejs = require('ejs')  // jsp와 유사한 뷰템플릿
const moment = require('moment')
const port = 3000


// const mysql = require('mysql2')
// const dbconfig = require('./config/db.js')
// const conn = mysql.createConnection(dbconfig)   // mysql연결객체 생성

const conn = require('./config/dbconn.js')
console.log('데이타베이스 연결 성공')


// req.body 속성을 사용해서 클라이언트 정보를 확인할 때 사용.
// middleware인 body-parser 패키지가 설치되어야 한다.
const bodyparser = require('body-parser')

// 설정
app.set("view engine", "ejs");
app.set('views', './views')


// 클라이언트에서 전송한 json정보를 parsing하기위하여 설정
app.use(express.json())

app.use(bodyparser.urlencoded({extended: false}))

// 클라이언트 파일(*.css, 이미지파일, *.js 등)
app.use(express.static(__dirname + '/public'))

// 업로드 폴더 경로
app.use('/upload', express.static(__dirname + '/upload'));

//세션 설정
app.use(session({ secret: 'sdfasfasdfa', cookie: { maxAge: 60000}, resave:true, saveUninitialized:true,}))

// nodejs 경로가 요청시 매번 동작이 된다.
app.use((req, res, next) => {
    
    // nodejs에서 ejs사용시 전역변수 선언.
    res.locals.m_id = "";
    res.locals.m_name = "";

    if(req.session.meminfo) {
        res.locals.m_id = req.session.meminfo.m_id;
        res.locals.m_name = req.session.meminfo.m_name;
    }
    next();
})




// 라우팅(경로) 설정.  설명>스프링에서 Controller클래스에서 매핑주소
// req : request객체. 클라이언트에서 전송된 정보를 담당하는 객체.
// res : response객체. 서버에서 클라이언트로 응답하기위한 정보를 담당하는 객체.
app.get('/', (req, res) => {
//   res.send('<h1>Hello World!</h1>') // Hello World! 문자열을 클라이언트(브라우저)로 보내는 작업.
    res.render('index')  // 파일명 : ./views/index.ejs
})

// 매핑주소와 파일명은 일치하지 않아도 된다.
app.get('/testA', (req, res) => {
    // res.send('<h1>testA</h1>')
    res.render('demo')
})

// 주소: testB 파일명: testB.ejs
app.get('/testB', (req, res) => {
    res.render('testB')
})


// 게시판글쓰기
app.get('/write', (req, res) => {
    res.render('write') // write.ejs
})

//게시판글쓰기 저장
app.post('/writePro', (req, res) => {
    // console.log("writePro");
    // console.log(req.body);

    const title = req.body.title;
    const writer = req.body.writer;
    const content = req.body.content;

    var sql = `insert into board(title, content, writer) values(?, ?, ?)`
    var values = [title, writer, content]

    conn.query(sql, values, function(err, result) {
        if(err) throw err;
        console.log("데이타 삽입")
        // res.send("<script>alert('게시물이 등록됨');location.href='/list';</script>")
        res.redirect('/list');
    })
}) 

//게시판 목록
app.get("/list", (req, res) => {
    var sql = `select bno, title, content, writer, regdate from board order by bno desc`
    conn.query(sql, function(err, results, field) {
        if(err) throw err; // 예외처리
        res.render('list', {lists : results})    // list.ejs
    })
})

//게시판 조회
app.get("/get", (req, res) => {
    var bno = req.query.bno;
    var sql = `select bno, title, content, writer, regdate from board where bno = ${bno}`
    conn.query(sql, function(err, result) {
        if(err) throw err;
        res.render("get", {data: result[0]})
    })
})

//게시판 수정페이지
app.get("/modify", (req, res) => {
    var bno = req.query.bno;
    var sql = `select bno, title, content, writer, regdate from board where bno = ${bno}`
    conn.query(sql, function(err, result) {
        if(err) throw err;
        res.render("modify", {data: result[0]})
    })
})

//게시판 수정하기
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



//게시판 삭제
app.get("/delete", (req, res) => {
    var bno = req.query.bno;
    var sql = `delete from board where bno = ${bno}`  // 백틱안에 변수를 사용
    // var sql = 'delete from board where bno =' +  bno
    conn.query(sql, function(err, result) {
        if(err) throw err;

        res.send("<script>alert('게시물이 삭제됨');location.href='/list';</script>")
    })
})


//상품정보 등록페이지 -파일업로드 폼
app.get('/up_write', (req, res) => {
    res.render('up_write')
})

// 상품정보저장 - 파일업로드 저장
app.post('/up_writePro', upload.single('p_img') ,(req, res) => {
    console.log(req.file); // 업로된 파일정보 확인
    console.log(req.body); // 일반 입력텍스트정보 확인

    const name = req.body.p_name;
    const savefname = req.file.filename;
    const originfname = req.file.originalname;

    var sql = `insert into product(p_name, p_s_img, p_o_img) values(?,?,?)`
    var values = [name, savefname, originfname]

    conn.query(sql, values, function(err, result) {
        if(err) throw err;
        res.send("<script>alert('상품 등록됨'); location.href='/pro_list';</script>")
    })
})

//상품리스트
app.get("/pro_list", (req, res) => {
    var sql = ` select p_code, p_name, p_s_img, p_o_img, regdate from product order by p_code desc`
    conn.query(sql, function(err, results, field) {
        if(err) throw err; // 예외처리
        res.render('pro_list', {lists : results})    // pro_list.ejs
    })
})


//회원가입 폼
app.get("/join", (req, res) => {
    
    res.render('join')    // join.ejs
    
})

//암호화 모듈 읽기.
const bcrypt = require('bcrypt');

//회원정보 저장
app.post('/join_ok', (req, res) => {

    console.log("회원정보", req.body);
    const m_id = req.body.m_id;
    const m_name = req.body.m_name;
    const m_pwd = req.body.m_pwd;
    const m_zipcode = req.body.m_zipcode;
    const m_addr = req.body.m_addr;
    const m_addrdetail = req.body.m_addrdetail;

    console.log("비밀번호", m_pwd);

    //비밀번호 암호화
    const saltrounds = 10;
    bcrypt.hash(m_pwd, saltrounds, (err, hashedPw) => {
        if(err) {
            res.status(500).json({msg : 'hashfail'});
        }else {
            var sql = `insert into meminfo(m_id, m_name, m_pwd, m_zipcode, m_addr, m_addrdetail) values(?, ?, ?, ?, ?, ?)`
            var values = [m_id, m_name, hashedPw, m_zipcode, m_addr, m_addrdetail]

            conn.query(sql, values, function(err, result) {
                if(err) {
                    res.status(500).json({msg : 'fail'});
                }else {
                    res.status(200).json({msg: 'success'});
                }
            })
        }
    })
   
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
            res.status(200).json({msg: 'no'})
        }
    })
})

//로그인 폼
app.get("/login", (req, res) => {
    
    res.render('login')    // login.ejs  
})

//로그인 인증 : 세션정보를 저장하는 방식(1.메모리 2.파일 3.db(mysql에 세션테이블생성))
app.post('/login_pro', (req, res) => {
    // const m_id = req.body.m_id;
    // const m_pw = req.body.m_pwd;

    const {m_id, m_pwd } = req.body;

    var sql = `select * from meminfo where m_id='${m_id}'`;

    conn.query(sql, function(err, result) {
        if(err) throw err;

        if(result.length == 0) {
            res.send("<script>alert('아이디 확인요망');location.href='/login';</script>")
        }else {
            // 아이디가 일치된 경우

            // 비밀번호 일치여부 확인
            bcrypt.compare(m_pwd, result[0].m_pwd, (bcryptErr, bcryptResult) => {
                if(bcryptErr || !bcryptResult) {
                    res.send("<script>alert('비밀번호 확인요망');location.href='/login';</script>")
                }else {
                    console.log('meminfo', result[0]); // 회원정보 출력
                    req.session.meminfo = result[0]; // 회원정보를 세션 meminfo 이름으로 저장.
                    res.send("<script>alert('로그인 성공');location.href='/';</script>")
                }
            })
        }
    })
})

//로그아웃
app.get('/logout', (req, res) => {
    req.session.meminfo = null;
    res.send("<script>alert('로그아웃 됨');location.href='/';</script>")
})



// nodejs기반으로 서버기능을 생성해주는 코드
app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})