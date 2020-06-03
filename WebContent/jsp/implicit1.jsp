<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- jsp를 통해 현재 페이지에 표현되는 문자에 대한 캐릭터 셋 : contentType="text/html; charset=UTF-8" --%>    
<%-- 내장 객체 : request --%>
<%
	// jsp로 가져오는 정보에 대한 한글 인코딩
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"> <!-- html 자체에 들어가는 캐릭터 셋 -->
<title>Insert title here</title>
</head>
<body>
	<h2>userid : <%=request.getParameter("userid") %></h2>
	<h2>password : <%=request.getParameter("password") %></h2>
</body>
</html>
