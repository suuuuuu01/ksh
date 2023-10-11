<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>글쓰기</h3>
<form method="post" action="./write">
	작성자 : <input type="text" name="writer"><br>
	글제목 : <input type="text" name="title"><br>
	내용 : <input type="text" name="content"><br>
	<input type="submit" value="게시판글저장">
</form>
</body>
</html>