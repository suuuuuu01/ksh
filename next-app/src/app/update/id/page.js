// server component에서는 on 이벤트, 리액트 훅을 지원하지 않는다.
// 이 파일에서 onSubmit() 작업을 이요하므로, 
// 기본인 server component로 실행이 되기 때문에 에러가 발생되므로 
// client component로 변환해야 한다.

"use client"
import { useRouter } from "next/navigation";
import { useEffect, useState } from "react";

// 화면(UI)에 수정폼 출력작업
export default function Update(props) {
    const router = useRouter();
    const [title, setTitle] = useState('');
    const [body, setBody] = useState('');
    const id = props.params.id;

    async function refresh() {
        const resp = await fetch(`http://localhost:9999/topics/${id}`);
        const topic = await resp.json(); // id에 해당하는 수정내용
        setTitle(topic.title);
        setBody(topic.body);
    }

    // Update 컴포넌트가 처음 렌더링 될 때, 단 한 번만 실행. 
    useEffect(() => {
        refresh();
    }, []);

    return (
        <form onSubmit={async e=> {
            e.preventDefault();
            const title = e.target.title.value;
            const body = e.target.body.value;

            const options = {
                method: "PATCH", // PUT
                headers: {
                    'Content-Type' : 'application/json'
                },
                body: JSON.stringify({title, body}) // {title:title, body:body}
            };
            const resp = await fetch('http://localhost:9999/topics', options);
            const topic = await resp.json()
            router.push(`/read/${topic.id}`);
            router.refresh();
        }}>

            <h2>Update</h2>
            <p><input type="text" name="title" placeholder="title" onChange={e=>setTitle(e.target.value)} value={title} /></p>
            <p><textarea name="body" placeholder="body" onChange={e=>setBody(e.target.value)} value={body} /></p>
            <p><input type="submit" value="update" /></p>
        </form>
    );
}