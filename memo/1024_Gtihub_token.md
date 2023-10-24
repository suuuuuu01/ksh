https://thebook.io/080212/ 더북 Git 교과서 

Git : 버전관리 형상관리 파일에서 작업한 정보를 시간을 기준으로 저장. 후에 다시 돌아갈 수 있도록 함.

Git 다운로드, 설치, 초기설정

프로그램 내 .git 로컬 레포지토리 폴더 존재

우측 상단 JAVA, GIT 메뉴 (없으면 perspective - open perspective - other - git, spring)

package explorer 내 프로젝트 우클릭 - team - share project (git에 적용) - GIT - next - 체크박스 클릭(use or create repository in parent folder of project) - create - 하단 create repository 클릭하면 프로젝트 체크박스 클릭된다. - finish       => 프로젝트명[프로젝트명 master] : master 깃과 연동된 것 확인 가능.
    연결 해제 : 프로젝트명 우클릭 - team - disconnect   (git 적용 해제)

우측 상단 Git 메뉴 -  unstaged changes(0) 프로젝트 담겨있는 것 확인 - commit message 입력 - commit and push - 레포지토리 주소 복붙 (user id, 토큰 입력) - prieview - push       ((노란 원통형 아래 화살표 : 프로젝트 변경)) 

프로젝트 우클릭 - team - add to index - (프로젝트 내 폴더모양 ?에서 *모양으로 변경됨)

smsu0010 깃허브 토큰 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
su0105hyun 깃허브 토큰 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

repo만 체크하고 토큰 생성

https://m.blog.naver.com/syunjae21/222487385094  : 이클립스에서 깃허브 push 에러 시 해결방법

commit : 프로젝트 생성해 로컬 레포지토리에 넣기
깃허브 원격 레포지토리 pull(내려받기) push(올리기)

https://velog.io/@1000oki/eclipse-GITHUB-%EC%9D%B4%ED%81%B4%EB%A6%BD%EC%8A%A4%EC%97%90%EC%84%9C-%EA%B9%83%ED%97%88%EB%B8%8C-%ED%81%B4%EB%A1%A0-import-%EB%B0%A9%EB%B2%95
: 이클립스에서 깃허브 클론

의존성 주입방식 setter, field, constructor https://dev-coco.tistory.com/70