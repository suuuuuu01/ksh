import Link from 'next/link';
import './globals.css';
import { Control } from './read/[id]/Control';

// html의 head 태그안의 내용을 생성하는 부분이다.

/*
<title>WEB tutorial</title>
<meta name="description" content="Generated by Synthwave84">
*/
export const metadata = {
  title: 'WEB tutorial',
  description: 'Generated by Synthwave84',
}

// children 속성에 page.js의 값이 대입된다.
// <a>태그를 <Link>태그로 변환하게 되면, 다음 같은 기능이 제공된다.
/*
  - 링크 클릭 시 새로고침이 발생되지 않는다. 필요한 컨텐츠만 로딩된다.
  - 이미 방문한 페이지는 캐시가 지원되어, 다시 다운로드되지 않는다.
  - 미리 페이지를 로드했다가, 실제 요청이 있을 때 클라이언트측에서 응답한다.

  결과적으로 next.js에서는 외부주소로 요청 시 하는 작업은 <a>태그를 사용하고,
  운영서버 요청(내부주소)은 <Link>태그를 사용한다.
  그래서 SPA를 매우 쉽게 구현
*/
export default async function RootLayout({ children }) {
  
  // 서버 측의 캐시가 작동되어 새로 추가, 변경된 내용이 반영되지 않으므로
  // 매번 요청 시 캐시가 작동괴 캐시가 나온다. 새로운 작업진행이 되도록 한다
  const resp = await fetch(`${process.env.NEXT_PUBLIC_API_URL}topics`, {cache:'no-cache'});

  const topics = await resp.json();

  // 개발자의 콘솔에서는 나타나지 않고, 터미널에서 출력된다.
  // 클라이언트(브라우저)에서 확인하는 것이 아니라, 서버(터미널)에서 확인.
  // 기본은 서버컴포넌트로 동작은 서버에서 실행되고, html 코드만 클라이언트에서 전송된다.
  // 참고로, 클라이언트 컴포넌트로 작업도 가능하다.
  // 서버 쪽에서 브라우저에 보여주는 내용이 생성된다는 의미로 server side rendering
  // console.log('topics', topics);

  return (
    <html>
      <body>
        <h1><Link href='/'>WEB</Link></h1>
          <ol>
            {
              topics.map(topic => {
                return <li key={topic.id}><Link href={`/read/${topic.id}`}>{topic.title}</Link></li>
              })
            }
          </ol>
        
        {children}{/* page.js가 들어간다. */} 
        <Control />
        </body>
    </html>
  )
}
