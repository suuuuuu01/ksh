// create 클릭 시 동작되는 컴포넌트. 쓰기(등록) 작업.
'use client'
// import { useRouter } from "next/router"; // 버전 12
import { useRouter } from "next/router";  // 버전 13 

 // 이 구문을 사용하면, client component에서 지원하는 문법을 사용 가능해진다.

export default function Create() {
    const router = useRouter()
    return (
        <>
            <form onSubmit={async e => {
                e.preventDefault(); // 전송버튼 클릭 시 새로고침 현상이 발생 X
                const title = e.target.title.value;
                const body = e.target.body.value;
                const options = {
                    method: "POST",
                    headers: {
                        'Content-Type' : 'application/json'
                    },
                    body: JSON.stringify({title, body}) // {title:title, body:body}
                };
                const resp = await fetch('http://localhost:9999/topics', options);
                const topic = await resp.json(); //새 글 등록 (create)시 작업결과.
                // 클라이언트 컴포넌트로 동작되기 때문에 개발자도구 콘솔에서 확인하기.
                // console.log('topic', topic);
                router.push(`/read/${topic.id}`);
                // 서버쪽에서 다시 렌더링해서 새로고침을 하는 기능.
                router.refresh(); 
            }}>
            <h2>Create</h2>
            <p><input type="text" name="title" placeholder="title" /></p>
            <p><textarea name="body" placeholder="body" /></p>
            <p><input type="submit" value="create" /></p>
            </form>    
        </>
    );
}