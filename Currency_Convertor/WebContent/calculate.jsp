<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%@ page import="java.io.PrintWriter" %>
        <% String country1= (String)request.getParameter("ak");
        String country2= (String)request.getParameter("2"); %>
        You have selected <%=country1 %><%=country2 %>

</body>
</html>