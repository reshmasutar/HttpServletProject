package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/seventhlink")
public class EmpHttpDemo6 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("ename");
		String sal = req.getParameter("salary");
		//parsing of salary
		double income = Double.parseDouble(sal);
		String desg = req.getParameter("Designation");
		if(desg.equals("HR")){
			income = income+(income*0.20);
		}else if(desg.equals("Manager")){
			income = income + (income*0.30);
		}
		
		PrintWriter pw = resp.getWriter();
		pw.print("<h1>UPDATED SALARY</h1>");
				
		pw.println("<html><body><table border='2'><tr><th>Emp Name</th><th>Current Salary</th><th>Designation</th><th>Updated Salary</th></tr>");
		pw.print("<tr><td>"+name+"</td>\t\t<td>"+sal+"</td>\t\t<td>"+desg+"</td>\t\t<td>"+income+"</td></tr>");
		pw.print("</table></body></html>");
		
	}

	}


