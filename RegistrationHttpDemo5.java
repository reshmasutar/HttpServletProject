package test;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sixthlink")
public class RegistrationHttpDemo5 extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		String n1=req.getParameter("number");
		String gender1 = req.getParameter("gender");
		String branch1 = req.getParameter("branch");
		
		PrintWriter pw=resp.getWriter();
		
		pw.println("<html><body><table border='2'><tr><th>FIRSTNAME</th><th>LASTNAME</th><th>CONTACT</th><th>GENDER</th><th>BRANCH</th></tr>");
		pw.print("<tr><td>"+firstname+"</td>\t\t<td>"+lastname+"</td>\t\t<td>"+n1+"</td>\t\t<td>"+gender1+"</td>\t\t<td>"+branch1+"</td>\t\t<td></tr>");
		pw.print("</table></body></html>");
		
		}
	}


