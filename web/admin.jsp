<%@ page import="model.Category" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="model.CategoryManager" %>
<%@ page import="model.PictureManager" %>
<%@ page import="model.Picture" %>
<%@ page import="static model.PictureManager.loadPictureByCatId" %><%--
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

        <%
            if (request.getAttribute("message") != null ){
        %>
            <div class="alert alert-info mt-2"><h6>${requestScope["message"]}</h6></div>
        <%
            }
        %>
        <div class="jumbotron mt-3">
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
                        <option value="<%=cat.getId()%>"><%=cat.getName()%>
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
    <div class="container">
        <div class="accordion">
            <%
                for (Category cat : categories) {
            %>
            <div class="card">
                <div class="card-header text-center">
                    <a class="card-link" data-toggle="collapse" data-parent="#accordion" href="#<%=cat.getName()%>">
                        <%=cat.getName()%> Pictures
                    </a>
                    <div id="<%=cat.getName()%>" class="collapse">
                        <%
                            ArrayList<Picture> pictures =  PictureManager.loadPictureByCatId(cat.getId());
                            for (Picture pic : pictures){
                        %>
                            <form action="/RemovePicture" method="post">
                            <div class="card float-left m-1" style="width: 80px;">
                                <img class="card-img-top mb-1" src="assets/img/<%=pic.getAddress()%>">
                                <input type="hidden" name="pic_id" value="<%=pic.getId()%>">
                                <input type="submit" class="btn btn-danger" value="DELETE">
                            </div>
                            </form>
                        <%
                            }
                        %>

                    </div>
                </div>
            </div>
            <%
                }
            %>
        </div>
    </div>
</main>
</body>
</html>
