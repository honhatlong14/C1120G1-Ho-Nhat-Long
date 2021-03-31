<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: win
  Date: 3/31/2021
  Time: 1:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Settings Information</title>
</head>
<body>
<h3>Settings</h3>
<form:form method="post" action="/updateEmail" modelAttribute="email">
    <table>
        <tr>
            <th><form:label path="languages">Languages: </form:label></th>
            <td>
                <form:select path="languages" items="${languageList}"/>
            </td>
        </tr>
        <tr>
            <th><form:label path="pageSize">Page Size: </form:label></th>
            <td>show
                <form:select path="pageSize" items="${pageSize}"/>
                email per pages
            </td>
        </tr>
        <tr>
            <th><form:label path="spamsFilter">Spams Filter: </form:label></th>
            <td><form:checkbox path="spamsFilter"/>Enable spams Filter</td>
        </tr>
        <tr>
            <th><form:label path="signature">Signature: </form:label></th>
            <td><form:textarea path="signature"/></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" value="update">

                <input type="submit" value="cancel">
            </td>

        </tr>
    </table>
</form:form>
</body>
</html>