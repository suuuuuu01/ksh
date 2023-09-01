import './App.css';
import { useState } from 'react';

function Header(props) {
  return (
    <header>
    <h1>
    <a href='/' onClick={(event) => {
      event.preventDefault();
      event.onChangeMode();
    }}>
    {props.title}
      </a>
    </h1>
  </header>
  );
}

function Nav(props) {

  const lis=[];
  for(let i=0; i<props.topics.length; i++) {
    let t=props.topic[i];
    lis.push(<li key={t.id}>
      <a id={t.id} href={'/read/' + t.id} onClick={event => {
        event.preventDefault();
        props.onChange(Number(event.target.id));
      }}>
          {t.title}
      </a>
    </li>);
  }
  return(
    <nav>
      <ol>
        {lis}
      </ol>
    </nav>
  );
}

function Article (props) {
  
  return (
    <article>
      <h2>
        {props.title}
      </h2>
        {props.body}
    </article>
  );
}

// 함수형 컴포넌트
function Create(props) {
  return (
    <article>
    <h2>Create</h2>
    <form onSubmit = {event => {
      event.preventDefault();  // form태그의 전송(submit)기능을 취소시킨다.
      const title = event.target.title.value;
      const body = event.target.body.value;
      props.onCreate(title, body);
    }}>
      <p><input type="text" name='title' placeholder='title' /></p>
      <p><textarea name='body' placeholder='body '/></p>
      <p><input type="submit" value={"Create"} /></p>
    </form>
  </article>
  );
}

// props.title, props.body, props.onCreate() 함수.
function Update(props) {
  // <p><input type="text" name='title' placeholder='title' value={props.title}/></p>
  // <p><textarea name='body' placeholder='body ' value={props.body}/></p>
  // props.title를 수정폼의 값으로 직접 사용하면, 편집이 되지 않는다. (중요)
  const [title, setTitle] = useState(props.title);
  const [body, setBody] = useState(props.body);



  return (
    <article>
      <h2>Update</h2>
      <form onSubmit={event => {
        event.preventDefault();  // form태그의 전송(submit)기능을 취소시킨다.
        const title = event.target.title.value;
        const body = event.target.body.value;
        props.onUpdate(title, body);
        }}>
          <p><input type="text" name='title' placeholder='title' value={title} 
                  onChange = {event=> {
                  setTitle(event.target.value);
                    }}/>
          </p>
          <p><textarea name='body' placeholder='body ' value={body}
                  onChange = {event=> {
                    setBody(event.target.value) ;
                    }}/>
          </p>
          <p>
            <input type="submit" value={"Update"} />
          </p>
      </form>
    </article>
  );
}

function App() {

  const [mode, setMode] = useState("Welcome");

  const [id, setId] = useState(null); // 처음에 보여줄 것이 없으므로 null
  const [nextId, setNextId] = useState(4); // id 값에 해당하는 세부 내용 출력
  const [topics, setTopics] = useState([
    {id: 1, title: 'html', body: 'html is....'},
    {id: 2, title: 'css', body: 'css is...'},
    {id: 3, title: 'javascript', body: 'javascript is...'}
  ]);

  let content = null;
  let contextControl = null;

  if(mode === 'Welcome') {
    content = <Article title="Welcome" body="Hello.Web!"></Article>
  } else if (mode=== "Read") {
    let title, body = null;

    for(let i=0; i<topics.length; i++) {
      if(topics[i].id === id) { 
        title = topics[i].title;
        body = topics[i].body;
      }
    };
    
    content = <Article title={title} body={body}></Article>

    contextControl = <>
    <li>
      <a href={'/update' + id} onClick={event=>{
      event.preventDefault();
      setMode('Update');
    }}>Update</a>

      
      <br /><input type='button' value='Delete' onClick={() => {
      if (!window.confirm('삭제 하시겠습니까?')) return;
      const newTopics = [];
      // 삭제하고자 하는 id에 해당하는 것을 제외한 나머지
      for(let i=0; i<topics.length; i++) {
        if(topics[i].id !== id) {
          newTopics.push(topics[i]);
          }
      }
      setTopics(newTopics);
      setMode("Welcome");
    }}/>
    </li>
    </>


  }else if (mode === "Create") {
    // 폼 작업
    content = <Create onCreate={(title, body) => {
      const newTopic = {id :nextId, title: title, body: body};
      // topics.push(newTopic);
      // // 추가 데이터
      // setTopics(topics); // 기존 주소를 그대로 사용. 사용 불가.
      const newTopics = [...topics]; // 데이터 복제
      newTopics.push(newTopic);
      setTopics(newTopics); // 주소가 변경된다.
      setMode('Read') // mode 변경
      // 추가된 데이터의 세부 내용을 보여주기 위한 id값 제공
      setId(nextId); 
      setNextId(nextId+1);
    }}></Create>
  }  
    else if (mode === "Update") {
    // id가 일치 되는 데이터를 통하여 수정폼에 사용할 title, body 변수작업. 
    let title, body = null;
    for(let i=0; i<topics.length; i++) {
      if(topics[i].id === id){
      title= topics[i].title;
      body= topics[i].body;
      break;
    }
  }
    content = <Update  title={title} body={body} onUpdate={(title, body) => {
      //  내용 수정 작업.
      console.log(title, body);
      // 기존의 내용
      const newTopics = [...topics];
      // 수정 된 내용
      const updatedTopic = {id:id, title:title, body:body};
      // 수정 id는 mode가 Read 에서 선택한 id를 사용.
      for(let i=0; i<newTopics.length; i++) {
        if(topics[i].id === id) {
          newTopics[i] = updatedTopic;
          break;
          }
        } 
        setTopics(newTopics);
        setMode("Read");
    }}></Update>
  }
    
  return (
    <div className="App">
      {/*  1) <Header /> */}
      <Header title="RE4CT" onChangeMode={function() {
        // mode = "Welcome"; = 읽기전용 변수로 사용해야함
        setMode("Welcome"); // setter함수로 값 변경 목적으로 사용 할 것.
      }}>
      </Header>


      {/* <Nav /> */}
      <Nav topics={topics} onChange={(id) => {
        // alert(id);
        // mode = "Read"; = 일기전용 변수로 사용해야함
        setMode("Read"); // setter함수로 값 변경 목적으로 사용 할 것.
        setId(id); // 선택한 id 값을 변경함. 
      }}>
      </Nav>


      {/* 3) <Article /> */}
      {content}

      {/* 4)  속성 생성 버튼 */} 
      <li><a href="/create"  onClick={event => {
      event.preventDefault(); // a태그의 동작을 제거한다. 링크기능 동작이 제거되고, 새로고침이 발생하지않는다.
      setMode("Create"); // App() 함수 컴포넌트가 재 실행 된다.
      }}>Create</a></li>
      {contextControl}
    </div>
  );
}

export default App;
