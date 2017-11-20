<%@ page import="java.util.ArrayList" %>
<%@ page import="model.SequrityQuestion" %>
<%@ page import="model.SequrityQuestionManager" %><%--
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
<jsp:include page="header.jsp"></jsp:include>
<form name="form" action="/Register" method="post">

    <table>
        <tr>
            <td>NAME</td>
            <td><input type="text" name="name"></td>
        </tr>
    </table>
    <table>
        <tr>
            <td>FAMILY</td>
            <td><input type="text" name="family"></td>
        </tr>
    </table>
    <table>
        <tr>
            <td>USERNAME</td>
            <td><input type="text" name="username"></td>
        </tr>
    </table>
    <table>
        <tr>
            <td>PASSWORD</td>
            <td><input type="text" name="password"></td>
        </tr>
    </table>

    <table>
        <tr>
            <td>QUESTION1</td>
            <td>
                <select name="sq1" >
                <%
                    ArrayList<SequrityQuestion> sqs = SequrityQuestionManager.loadAllQuestions();
                    for (SequrityQuestion sq : sqs){
                %>
                    <option value="<%=sq.getId()%>"><%=sq.getQuestion()%></option>
                <%
                    }
                %>
                </select>
            </td>
        </tr>
    </table>
    <table>
        <tr>
            <td>ANSWER1</td>
            <td><input type="text" name="ans1"></td>
        </tr>
    </table>

    <table>
        <tr>
            <td>QUESTION2</td>

            <td>
                <select name="sq2" >
                    <%
                        ArrayList<SequrityQuestion> sqs2 = SequrityQuestionManager.loadAllQuestions();
                        for (SequrityQuestion sq : sqs2){
                    %>
                    <option value="<%=sq.getId()%>"><%=sq.getQuestion()%></option>
                    <%
                        }
                    %>
                </select>
            </td>
        </tr>
    </table>
    <table>
        <tr>
            <td>ANSWER2</td>
            <td><input type="text" name="ans2"></td>
        </tr>
    </table>
    <table>
        <tr>
            <td>ROLE</td>
            <td><input TYPE="text" NAME="role"></td>
        </tr>
    </table>
    <table>
        <tr>
            <td><input type="submit" value="register"></td>
        </tr>
    </table>
</form>
</body>
</html>
