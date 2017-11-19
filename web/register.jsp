<%--
  Created by IntelliJ IDEA.
  User: mabdo
  Date: 11/18/2017
  Time: 10:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>REGISTER</title>
    <jsp:include page="bootstrap.jsp"></jsp:include>

</head>
<body>
<form name="form" action="Register" method="post">
<jsp:include page="header.jsp"></jsp:include>
<table>
    <tr>
        <td>NAME</td>
        <td><input type="text" name="NAME"></td>
    </tr>
</table>
<table>
    <tr>
        <td>FAMILY</td>
        <td><input type="text" name="FAMILY"></td>
    </tr>
</table>
<table>
    <tr>
        <td>USERNAME</td>
        <td><input type="text" name="USRENAME"></td>
    </tr>
</table>
<table>
    <tr>
        <td>PASSWORD</td>
        <td><input type="text" name="PASSWORD"></td>
    </tr>
</table>
    <table>
        <tr>
            <td>USER-ID</td>
            <td><input type="text" name="USER-ID"></td>
        </tr>
    </table>
    <table>
    <tr>
            <td>QUESTION1</td>
        <td><input type="text" name="SQ-ID1"></td>
    </tr>
    </table>
    <table>
        <tr>
            <td>ANSWER1</td>
            <td><input type="text" name="ANS1"></td>
        </tr>
    </table>

    <table>
        <tr>
        <td>QUESTION2</td>

        <td><input type="text" name="SQ-ID2"></td>
        </tr>
    </table>
    <table>
        <tr>
            <td>ANSWER2</td>
            <td><input type="text" name="ANS2"></td>
        </tr>
    </table>
    <table>
        <tr>
            <td>ROLE</td>
            <td><input TYPE="text" NAME="ROLE"></td>
        </tr>
    </table>
</form>
</body>
</html>
