<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%-- 내장 객체 : response : sendRedirect() --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>response.jsp</h1>
	<%
		// 다른 페이지로 이동(외부 사이트도 가능)
		//response.sendRedirect("http://www.naver.com");
		response.sendRedirect("info1.html");
	%>
	<div>
		<P>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Eius dolorum enim quam dignissimos ipsa soluta porro quibusdam fuga consequatur doloremque quisquam ducimus ea velit et asperiores dicta adipisci praesentium iure.<p>
	</div>
</body>
</html>