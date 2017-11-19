package Controller;

import model.User;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ForgetPass3  extends HttpServlet{

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String newpass=req.getParameter("newpass");
        String conpass=req.getParameter("conpass");
        if(!newpass.equals(conpass)){
            res.getWriter().print("Password dos not match");
            req.getRequestDispatcher("forgetpass3.jsp");
        }
        else {

        }
    }
}
