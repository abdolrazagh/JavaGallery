<%@ page import="model.Category" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="model.CategoryManager" %><%--
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
    <div class="container">
        <div class="jumbotron mt-5">
            <form action="/upload" method="post" enctype="multipart/form-data">
                <div class="form-group">
                    <label for="cat">Category</label>
                    <%
                        ArrayList<Category> categories = CategoryManager.loadAllCategories();
                    %>
                    <select class="form-control" name="category" id="cat">
                        <%
                            for (Category cat : categories) {
                        %>
                        <option><%=cat.getName()%>
                        </option>
                        <%
                            }
                        %>

                    </select>
                </div>
                <div class="form-group">
                    <label for="file">Select Picture</label>
                    <input class="form-control-file" type="file" name="file" id="file">
                </div>
                <button type="submit" class="btn btn-primary">Upload</button>
            </form>
        </div>
    </div>
</main>
</body>
</html>
