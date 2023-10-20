<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userid = request.getParameter("userid");

	Connection conn = null; // 데이터베이스 연결
	PreparedStatement pstmt = null; // SQL구문을 실행
	
	try{
		// 데이터베이스 연결정보
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String id = "ora_user";
				String pw = "1234";
				
				 Class.forName("oracle.jdbc.OracleDriver");
				 conn = DriverManager.getConnection(url, id, pw); // 객체생성. = DB연결.
						 
				String sql = "DELETE FROM USERINFO WHERE USERID = ?";
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, userid);
				
				pstmt.executeUpdate();
				
	}catch(Exception ex) {
		ex.printStackTrace();
	}finally {
		if(pstmt != null){try{pstmt.close();}catch(Exception ex){}}
		if(pstmt != null){try{conn.close();}catch(Exception ex){}}
	}
	
	response.sendRedirect("selectList.jsp");
%>