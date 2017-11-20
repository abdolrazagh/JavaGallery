<%--
  Created by IntelliJ IDEA.
  User: ShahMohammadi
  Date: 11/19/2017
  Time: 1:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>

<title>Forget Password</title>
<jsp:include page="bootstrap.jsp"></jsp:include>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<main>
    <div class="container">
        <div class="jumbotron">
            <form action="/ForgetPass1" method="post">
            <div class="form-group">
                <label for="username">UserName</label>
                <input type="text" name="username" id="username">
            </div>
            <button type="submit" class="btn btn-primary">submit</button>
        </div>
    </div>
</main>
</body>

</body>
</html>
