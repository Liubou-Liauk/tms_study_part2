<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%!
    int a = 10;
    String b = "string";
%>

<h1><%= "Hello World!!!" %>
</h1>
<br/>
<%@include file="list.jsp"%>
<a href="hello">Hello Servlet!!!</a>
</body>
</html>