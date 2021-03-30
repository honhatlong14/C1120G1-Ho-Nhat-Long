<%--
  Created by IntelliJ IDEA.
  User: win
  Date: 3/30/2021
  Time: 1:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Sandwich</title>
</head>
<body>
<h2>Sandwich Condiments</h2>
<form action="/save">
  <input type="checkbox" name="condiments" value="Lettuce">
  <label>Lettuce</label>
  <input type="checkbox" name="condiments" value="Tomato">
  <label>Tomato</label>
  <input type="checkbox" name="condiments" value="Mustard">
  <label>Mustard</label>
  <input type="checkbox" name="condiments" value="Sprouts">
  <label>Sprouts</label>
  <br>
  <input type="submit" value="add">
</form>
</body>
</html>
