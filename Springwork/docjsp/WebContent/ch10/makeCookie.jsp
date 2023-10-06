<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	 // 쿠키 생성구문
	 Cookie cookie = new Cookie("id", "doccomca");
	cookie.setMaxAge(10); //단위는 초.브라우저에 쿠키가 2분 유지.
	//cookie.setDomain("주소");
	//cookie.setPath("경로");  //전체 cookie.setPath("/");
	response.addCookie(cookie); // response객체에 쿠키를 추가.
	
	out.println("쿠키가 생성됨.");
%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="useCookie.jsp">
	<input type="submit" value="생성된 쿠키 확인">
</form>
</body>
</html>