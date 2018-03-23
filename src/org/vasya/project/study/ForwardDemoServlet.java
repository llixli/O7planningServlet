package org.vasya.project.study;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.vasya.project.beans.Constants;

/**
 * Servlet implementation class ForwardDemoServlet
 */
@WebServlet("/other/forwardDemo")
public class ForwardDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForwardDemoServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forward = request.getParameter("forward");
		
		ServletOutputStream out = response.getOutputStream();
		
		out.println("<h1>ForwardDemoPage</h1>");
		
		String requestURL = request.getRequestURL().toString();
		out.println("<br><br>requestURL:");
		out.println(requestURL);
		
		if ("true".equals(forward)) {
			System.out.println("Forward to ShowMeServlet");
			
			request.setAttribute(Constants.ATTRIBUTE_USER_NAME_KEY, 
					"Hi!, I'm Tom come from Walt Disney!");
			
			RequestDispatcher dispatcher 
				= request.getServletContext().getRequestDispatcher("/showMe");
			dispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
