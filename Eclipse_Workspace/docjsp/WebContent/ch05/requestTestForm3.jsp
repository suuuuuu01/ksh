<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>request 예제 - 요청메소드</h2>
<form method="post" action="requestProcess3.jsp">
	좋아하는 취미 :
	야구<input type="checkbox" name="hobby" value="야구"><br>
	농구<input type="checkbox" name="hobby" value="농구"><br>
	탁구<input type="checkbox" name="hobby" value="탁구"><br>
	축구<input type="checkbox" name="hobby" value="축구"><br>
	<input type="submit" value="전송">
	
</form>
</body>
</html>