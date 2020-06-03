<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//인코딩
    	request.setCharacterEncoding("utf-8");
 		//info.jsp에서 넘긴 값 가져오기
   		String userid = request.getParameter("userid");
   		out.print(userid);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--  <h2>userid : <%=request.getParameter("userid") %></h2> -->
	<h1>session값 가져오기 : <%=session.getAttribute("userid") %></h1>
</body>
</html>

