// server component에서는 on이벤트, 리액트 훅을 지원하지 않는다.
// 이 파일에서 onSubmit()작업을 이용하므로, 
// 기본인 server component로 실행이 되기때문에 에러가 발생되므로
// client component로 변환해야 한다.

"use client"
import { useRouter } from "next/navigation";
import { useEffect, useState } from "react";

// 화면(UI)에 수정폼 출력작업
export default function Update(props) {
    //1)자바스크립트 : 수정폼에 사용할 수정내용을 가져오는 작업
    //2)return jsx구문 : 폼태그에 수정내용을 담아 화면에 뿌려주는 기능(렌더링)

    // 수정폼 작업시 
    // 1)useState 
    // 2)<input type="text" name="title" placeholder="title" onChange={e=>setTitle(e.target.value)} value={title} />
    
    
    const router = useRouter(); // 라우팅기능을 지원(주소요청작업)
    
    // 상태관리.  수정폼에 내용을 유지하기위하여.
    const [title, setTitle] = useState('');
    const [body, setBody] = useState('');
    
    const id = props.params.id; // 수정하고자 하는 id값.   http://localhost:3000/update/1

    console.log("id", id);

    // 비동기적 사용.  함수정의
    async function refresh() {
        const resp = await fetch(`${process.env.NEXT_PUBLIC_API_URL}topics/${id}`, options);
        // id에 해당하는 수정내용을 가져옴.
        const topic = await resp.json();
        console.log('topic', topic); // 브라우저-개발자도구-콘솔 확인(client component 동작)
        // 수정내용을 state함수로 변경
        setTitle(topic.title);
        setBody(topic.body);
    }

    // Update컴포넌트가 처음 렌더링 될때, 단 한번만 실행.
    // 리액트 hook
    useEffect(() => {
        refresh(); 
    }, []); // [] 빈배열

    return (
        <form onSubmit={async e=> {
            // 새로고침 현상을 제거하고, 수정된 내용을 요청하는 작업.
            e.preventDefault();
            
            // 수정된 내용.  e.target : <form>태그
            const title = e.target.title.value;
            const body = e.target.body.value;

            const options = {
                method: 'PATCH', // PUT.   수정하는 의미의 요청방식.
                headers : {
                    'Content-Type': 'application/json' // body 데이터를 설명하는 목적
                },
                body: JSON.stringify({title, body}) // {title:title, body:body}
            };
            const resp = await fetch(`http://localhost:9999/topics/${id}`,options);
            const topic = await resp.json(); // 수정한 내용을 리턴받는다.
            router.push(`/read/${topic.id}`); // 주소요청.  /read/1 (수정한 내용 보기)
            router.refresh();
        }}>

            <h2>Update</h2>  
            <p><input type="text" name="title" placeholder="title" onChange={e=>setTitle(e.target.value)} value={title} /></p>
            <p><textarea name="body" placeholder="body" onChange={e=>setBody(e.target.value)} value={body}></textarea></p>
            <p><input type="submit" value="update" /></p>
        </form>
    );
}