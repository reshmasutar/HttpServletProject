package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/thirdlink")
public class LoginHttpDemo3 extends HttpServlet {
static String user1="reshma";
static String pass1="Reshma@123";

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("user");
		String password = req.getParameter("pass");
		PrintWriter pw = resp.getWriter();
		if(username.equals(user1) && password.equals(pass1)){
		pw.print("<h1 style='color:green'>Login Successfull</h1>");
		}
		else{
			pw.print("<h1 style='color:red'>Login Failed</h1>");
		}
		
	}
	

}
