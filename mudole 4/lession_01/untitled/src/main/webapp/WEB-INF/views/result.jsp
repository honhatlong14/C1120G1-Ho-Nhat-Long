<%--
  Created by IntelliJ IDEA.
  User: win
  Date: 3/27/2021
  Time: 2:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Convert Money</title>
</head>
<body>
<form action="/convert">
    <table>
        <tr>
            <th>USD to VietNamDong</th>
        </tr>
        <tr>
            <th>USD<input type="number" name="number" value="${number}"></th>
        </tr>
        <tr>
            <th>VietNamDong: ${result}</th>
        </tr>
    </table>
</form>


</body>
</html>
