package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class ForgetPass1 extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        HttpSession session=req.getSession();
       String username2=req.getParameter("username2");
       String Uname=(String) session.getAttribute("username");
       if(!Uname.equals(username2)){
        req.getRequestDispatcher("forgetpass.jsp").forward(req,res);

    }
    else req.getRequestDispatcher("fotgetpass2.jsp");
}}
