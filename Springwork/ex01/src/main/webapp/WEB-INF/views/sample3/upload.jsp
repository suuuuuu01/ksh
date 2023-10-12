<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>파일 업로드 예제</h3> <!-- 파일 업로드 시에는 반드시 method="post" enctype="multipart/form-data" -->
<form method="post" action="/sample3/upload" enctype="multipart/form-data"> <!-- ./action="./upload"도 허용 -->
	<input type="file" name="files"><br>
	<input type="file" name="files"><br>
	<input type="file" name="files"><br>
	<input type="file" name="files"><br>
	<input type="submit" value="파일업로드">
</form>
</body>
</html>