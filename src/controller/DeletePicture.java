package controller;


import model.PictureManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeletePicture extends HttpServlet {

    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("pic_id"));
        if (PictureManager.removePictureById(id)){
            req.setAttribute("message","Picture removed successfully");
        }else{
            req.setAttribute("message","Picture does not removed successfully");
        }
        req.getRequestDispatcher("/admin.jsp").forward(req, resp);
    }
}
