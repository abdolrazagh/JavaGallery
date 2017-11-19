package Controller;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class ForgetPass2 extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        HttpSession session=req.getSession();
        String Ans1=req.getParameter("Ans1");
        String Ans2=req.getParameter("Ans2");
        String ans1= (String) session.getAttribute("ans1");
        String ans2= (String) session.getAttribute("ans2");
        if (ans1.equalsIgnoreCase(Ans1)&&ans2.equalsIgnoreCase(Ans2)){
            req.getRequestDispatcher("forgetpass3").forward(req,res);
        }
        else {
            req.getRequestDispatcher("forgetpass1.jsp").forward(req,res);
        }
    }
}
