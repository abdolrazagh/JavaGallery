<%--
  Created by IntelliJ IDEA.
  User: ShahMohammadi
  Date: 11/19/2017
  Time: 3:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form name=fp3 action="/ForgetPass3" method="post">


<table>
    <tr>
        <td>NEW PASSWORD</td>
        <td><input type="text" name="newpass"></td>
    </tr>
</table>
<table>
    <tr>
        <td>CONFIRM PASSWORD</td>
        <td><input type="text" name="conpass"></td>
    </tr>
</table>
<table>
    <tr>
        <td><input type="submit" name="ok"></td>
    </tr>
</table>
</form>
</body>
</html>
