<%--
  Created by IntelliJ IDEA.
  User: mabdo
  Date: 11/18/2017
  Time: 11:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ADMIN</title>
    <jsp:include page="bootstrap.jsp"></jsp:include>
</head>
<body>

    <jsp:include page="header.jsp"></jsp:include>

<main>
<div class="container" >
    <div class="jumbotron mt-5">
        <label for="cat">Category</label>
        <select class="form-control" name="category" id="cat">
            <option>Winter</option>
            <option>Summer</option>

        </select>
    </div>
</div>
</main>
</body>
</html>
