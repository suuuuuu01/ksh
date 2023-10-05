<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h2>request 예제</h2>
<%
// request객체 : 클라이언트에서 요청한 모든 정보를 가지고 있는 객체.
// 클라이언트에서 method=post방식으로 한글데이터 전송 시 깨짐.
request.setCharacterEncoding("UTF-8"); // 한글깨짐 복구시킴. 꼭 해야 할 작업.

// 하나의 파라미터명으로 여러 개의 값이 전송 시
// 선택된 체크박스 정보만 전송.
String[] hobby = request.getParameterValues("hobby");

String result = "";
for(int i=0; i<hobby.length; i++) {
	result += hobby[i] + ",";
}

%>    
항목 갯수? <%=hobby.length %><br>
취미는? <%=result %>















