<%@ page import="model.User" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: ShahMohammadi
  Date: 11/19/2017
  Time: 2:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form name="forgetpass2" action="/ForgetPass2" method="post">
    <table>
        <%


            response.getWriter().print();%>
    </table>
    <table>
        <tr>
            <td>ANSWER1</td>
            <td><input type="text" name="fans1"></td>
        </tr>
    </table>
    <table>
        <tr>
            <td>ANSWER2</td>
            <td><input type="text" name="fans2"></td>
        </tr>
    </table>
    <table>
        <tr>
            <td><input type="submit"   name="ok"></td>
        </tr>
    </table>
</form>

</body>
</html>
