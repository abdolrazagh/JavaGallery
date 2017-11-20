package controller;

import model.User;
import model.UserManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Register extends HttpServlet{
    

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String family = request.getParameter("family");
        String password= request.getParameter("password");
        String username = request.getParameter("username");
        int sq1 =Integer.parseInt(request.getParameter("sq1"));
        String ans1 = request.getParameter("ans1");
        int sq2 =Integer.parseInt(request.getParameter("sq2"));
        String ans2= request.getParameter("ans2");
        String role = request.getParameter("role");
        HttpSession session=request.getSession();
        session.setAttribute(password,password);
        session.setAttribute(username,username);
        session.setAttribute(ans1,ans1);
        session.setAttribute(ans2,ans2);
        if(name.isEmpty()||family.isEmpty()||password.isEmpty()||ans1.isEmpty()||ans2.isEmpty()||role.isEmpty()){
            request.getRequestDispatcher("register.jsp").include(request,response);
        }
        User user=new User(name,family,password,username,sq1,ans1,sq2,ans2,role);
        UserManager userManager=new UserManager();
        userManager.saveUser(user);


    }
}
