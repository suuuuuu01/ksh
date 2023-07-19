onsubmit="return validateForm()" method="post">
  Name: <input type="text" name="fname">
  <input type="submit" value="Submit">
</form>
-> type="submit" 으로 쓰면 onsubmit 사용해야 함


<<<이벤트>>>

유형1) 태그 속성
<button onclick="자바스크립트 코드">버튼</button>

유형2) HTML DOM 이용
<button id="btn">버튼</button>

document.getElementById("btn").onclick = 자바스크립트 코드;

유형3) HTML DOM EventListener 익명함수 이용
    document.getElementById("myBtn").addEventListener("click", function () {
            document.getElementById("demo").innerHTML = Date();
        });

<이벤트 실행순서>
Bubbling: 실행- 자식 >부모, useCapture부분 - false
Capturing: 실행- 부모 > 자식, useCapture부분 - true
addEventListener(event, function, useCapture);

Dom 단위 : Node
태그 참조 시에 parentNode를 쓰면 
HTML DOM에서 태그와 내용을 부모와 자식으로 봄
<h1>My First child</h1>  -> <h1>태그 = 부모, My Fist child = 자식

<<<.childNodes[0] 텍스트도 child에 포함>>>

1) <p><b>자바는</b> 객체지향언어이다.</p>
childNodes 2개
childNodes[0]: <b>자바는</b>
childNodes[1]: 객체지향언어이다.

2) childNodes[0]: 자바는 객체지향언어이다

3) <p><b>자바는</b><span>객체지향언어</span>이다.</p> childNodes 3개

nodeName: read-only (nodeName= 으로 좌측에 사용 불가능, 우측 변경 가능)