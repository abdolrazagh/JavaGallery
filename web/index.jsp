<%--
  Created by IntelliJ IDEA.
  User: mabdo
  Date: 11/16/2017
  Time: 5:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Gallery Project </title>
    <jsp:include page="bootstrap.jsp"></jsp:include>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<main>
    <div class="container">

        <div class="row mt-5">
            <div class="col-md-6">
                <div class="jumbotron">
                    <h5>LOGIN HERE</h5>
                    <form action="userLogin.jsp" method="post">
                        <div class="form-group">
                            <label for="username">Username</label>
                            <input type="text" name="username" class="form-control" id="username">
                        </div>
                        <div class="form-group">
                            <label for="pwd">Password:</label>
                            <input type="password" name="password" class="form-control" id="pwd">
                        </div>
                        <div class="form-check">
                            <label class="form-check-label">
                                <input class="form-check-input" name="remember" type="checkbox"> Remember me
                            </label>
                        </div>
                        <button type="submit" class="btn btn-primary">LOGIN</button>
                    </form>
                </div>
            </div>
            <div class="col-md-6 ">
                <div class="jumbotron">
                    <br>
                    <h5>New User?</h5>
                    <button class="btn btn-success btn-block">REGISTER</button>
                    <br><br><br>
                    <h5>Forget Password?</h5>
                    <button class="btn btn-danger btn-block">REST PASSWORD</button>
                    <br><br>
                </div>
            </div>
        </div>
    </div>
</main>
</body>
</html>
