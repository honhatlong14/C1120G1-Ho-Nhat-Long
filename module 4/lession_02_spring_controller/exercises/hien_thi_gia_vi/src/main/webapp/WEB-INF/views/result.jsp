<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: win
  Date: 3/30/2021
  Time: 1:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich Condiments</title>
</head>
<body>
<form action="/save">
</form>
<h2>Sandwich Condiments:</h2>
<c:forEach var="element" items="${condiment}">
    <p>${element}</p>
</c:forEach>
</body>
</html>
