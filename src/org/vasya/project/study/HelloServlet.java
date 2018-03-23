package org.vasya.project.study;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public HelloServlet() {
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 ServletOutputStream out = resp.getOutputStream();
	        
	       out.println("<html>");
	       out.println("<head><title>Hello Servlet11</title></head>");
	        
	       out.println("<body>");
	       out.println("<h3>Hello Worl23d</h3>");
	       out.println("This is my firs2222t Servlet");
	       out.println("</body>");
	       out.println("<html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}
	
}
