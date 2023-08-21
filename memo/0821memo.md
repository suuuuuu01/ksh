React
    - CSR : Client Side Rendering
Next.js
    - React FrameWork
    - SSR : Server Side Rendering


클라이언트(브라우저) 1) 리액트에서 주소를 서버에 Request
서버에서 리액트-자바스크립트 파일 실행해 Response하면 브라우저 내에서 자바스크립트 코드 실행
브라우저 내에서 실행
- 로딩대기시간
- SEO : 검색엔진에 수집되지 않는 특징


클라이언트 Next.js 기술 사용, 주소 Request 시 
서버에서 파일실행, 자바스크립트 코드 서버실행 HTML 결과
를 Response
서버 HTML, DOM 기술작업 불가능

Front-end (CSR)
Back-end (SSR)

<Next.js 13 폴더구조>
.next : 개발 및 빌드 시 생성된 파일정보
node_modules : 패키지 및 모듈을 관리
public : 이미지파일 관리
src/app : Next.js에서 개발하는 파일관리
layout.js : 예약파일 (파일명 정해짐) page.js파일의 실행내용을 포함
page.js : 예약파일 layout.js 파일 안에 실행내용이 삽입됨

라우팅(Routing) : URL 주소로 요청하게 되면, 그에 해당하는 페이지를 응답한다.
http://www.abc.com/board/topic
abc.com - domain
board/topic - path
board - segment
topic - segment

next 12  vs  next 13 라우팅 기술적 차이
next 12 - http://www.abc.com/create  create.js 파일명으로 라우팅이 자동 연결
next 13 - http://www.abc.com/create  create 폴더명으로 라우팅이 자동 연결
    create 폴더에 page.js 파일이 실행된다.
    create 폴더에 layout.js 파일을 찾는다.
    없으면, 루트(app)폴더의 layout.js를 찾아, /create/page.js 파일의 실행결과가 children에 삽입된다. 
    있으면, /create/layout.js 파일의 children에 /create/page.js파일의 실행결과가 상비되고
    루트 app 폴더의 layout.js에 최종 삽입된다.
    

react 컴포넌트 - client component

next.js컴포넌트
    -server component (사용자와 상호작용하지 않는 경우, 백엔드에 접근하면서 보안적으로 위험한 정보를 주고받는 경우)
    -client component (사용자와 상호작용하는 경우 = 버튼 클릭 시 반응하는 동작, 서버컴포넌트로 해결되지 않는 경우)
    -특정 작업을 하지 않으면, 기본은 server component 작업


get
post
<form method = "get">이 기본, 생략 시 <form>

id 값 유무에 따라 update delete 