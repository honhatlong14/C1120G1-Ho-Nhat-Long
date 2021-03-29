<%--
  Created by IntelliJ IDEA.
  User: win
  Date: 3/29/2021
  Time: 11:25 AM
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
            <td>USD that you wanna convert to VND</td>
        </tr>
        <tr>
            <th>USD <input value="${number}"></th>
        </tr>
        <tr>
            <th>Convert to VND</th>
        </tr>
        <tr>
            <th>VND <input value="${result}"></th>
        </tr>
    </table>
</form>
</body>
</html>
