<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JSP file</h1>
	
	<form action="Signup.jsp">
		A:<input type="text" name="a"> <br>
		B:<input type="text" name="b"> <br>
		<input type="submit">
	</form>
	
	<% 
		String a=request.getParameter("a");
		String b=request.getParameter("b");
		int sum=0;
		if(a!=null && b!=null){
			sum=Integer.parseInt(a)+Integer.parseInt(b);
		}
	%>
	
	<h2>The sum of A and B is <%=sum %></h2>
</body>
</html>