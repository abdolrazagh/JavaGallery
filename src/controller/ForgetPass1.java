package controller;

import model.User;
import model.UserManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class ForgetPass1 extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

       String username2=req.getParameter("username2");
      User user= UserManager.loadUserByUsername(username2);
        if(user==null){

        }
        else {
            req.setAttribute("user",user);
            req.getRequestDispatcher("forgetpass2.jsp").forward(req,res);
        }

    }
}
