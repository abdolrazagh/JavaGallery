<%@ page import="model.User" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="model.SequrityQuestionManager" %>
<%--
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
<main>
    <%
        SequrityQuestionManager sq = new SequrityQuestionManager();
        User user = (User) request.getAttribute("user");
    %>
    <div class="container">
        <div class="jumbotron">
            <form action="/ForgetPass2" method="post">
                <div class="form-group">
                    <label for="sq1">Sequrity Question 1</label>
                    <input type="text" name="sq1" id="sq1" class="disabled"
                           placeholder="<%=sq.loadOneQuestion(user.getSq1()).getQuestion()%>">
                </div>

                <div class="form-group">
                    <label for="ans1">ANSWER 1</label>
                    <input type="text" name="ans1" id="ans1">
                </div>
                <div class="form-group">
                    <label for="sq2">Sequrity Question 2</label>
                    <input type="text" name="sq2" id="sq2" class="disabled"
                           placeholder="<%=sq.loadOneQuestion(user.getSq2()).getQuestion()%>">
                </div>
                <div class="form-group">
                    <label for="ans2">ANSWER2</label>
                    <input type="text" name="ans2" id="ans2">
                </div>
                <button type="submit" class="btn btn-primary">SUBMIT</button>
            </form>
        </div>
    </div>
</main>
</body>
</html>
