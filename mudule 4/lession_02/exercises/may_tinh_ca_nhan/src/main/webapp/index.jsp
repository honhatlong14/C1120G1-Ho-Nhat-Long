<%--
  Created by IntelliJ IDEA.
  User: win
  Date: 3/30/2021
  Time: 3:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Caculator</title>
  </head>
  <body>
<h2>Caculator</h2>
<form action="calculator">
  <input type="number" name="num1">
  <input type="number" name="num2">
  <br>
  <br>
  <button type="submit" name="calc" value="addition(+)">addition(+)</button>
  <button type="submit" name="calc" value="subtraction(-)">subtraction(-)</button>
  <button type="submit" name="calc" value="multiplication(x)">multiplication(x)</button>
  <button type="submit" name="calc" value="division(/)">division(/)</button>

</form>
  </body>
</html>
