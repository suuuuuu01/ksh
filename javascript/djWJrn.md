7/11
Dom 요소
1) id="intro": 중복되지 않게 부여
2) const element = document.getElementsByTagName("p");
모든 p태그 (복수)
3) const element.length -p태그 갯수
4) const x = document.querySelectorAll("p.intro"); all이 없으면 첫 번째

<a></a> an
document.image[0]

<<<자바스크립트 양식 유효성 검사>>>
<form name="myForm" action="/action_page.php" onsubmit="return validateForm()" method="post">
  Name: <input type="text" name="fname">
  <input type="submit" value="Submit">
</form>
type 버튼 클릭됐을 때 onsubmit이 인식해 동작시킴

함수 내에 존재하면 코드 실행


애니메이션
#container {
  width: 400px;
  height: 400px;
  position: relative; /* position: static; 기본값 */
}
/* 
1) 부모 #container가 position: static; 기본값인 경우는 top, left 기준이 body태그가 된다. 
2) 부모 #container가 position: relative;이면 top, left 기준 <div id="container">가 된다.
*/

이벤트: 웹브라우저 화면에서 마우스나 키보드에 의한 행위를 이벤트라고 명칭한다.
<이벤트 설정>
1) 태그의 속성으로 이벤트 설정
<input type="button" onclick="함수();">
2)HTML DOM을 이용한 이벤트 설정

<스타일 설정>
-태그의 속성으로 스타일 설정
<p style="color:red;">자바</p>
-선택자
-css파일