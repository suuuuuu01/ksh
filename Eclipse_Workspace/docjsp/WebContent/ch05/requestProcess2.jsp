<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h2>request 예제</h2>
<%
// request객체 : 클라이언트에서 요청한 모든 정보를 가지고 있는 객체.
// 클라이언트에서 method=post방식으로 한글데이터 전송 시 깨짐.
request.setCharacterEncoding("UTF-8"); // 한글깨짐 복구시킴. 꼭 해야 할 작업.


String name = request.getParameter("name");
String age = request.getParameter("age");
String gender = request.getParameter("gender");
String hobby = request.getParameter("hobby");
%>    

<!-- 오라클 DB에 저장하는 코드 -->

<%= name%> 님의 입력정보는 <br>
나이 : <%= age%><br>
성별 : <%= gender%><br>
취미 : <%= hobby%>
















