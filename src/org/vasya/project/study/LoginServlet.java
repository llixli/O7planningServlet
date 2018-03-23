package org.vasya.project.study;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.vasya.project.beans.Constants;
import org.vasya.project.beans.UserInfo;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletOutputStream out = response.getOutputStream();
		
		HttpSession session = request.getSession();
		
		UserInfo loginedInfo = new UserInfo("Tom", "USA", 5);
		
		session.setAttribute(Constants.SESSION_USER_KEY, loginedInfo);
		
		out.println("<html>");
		out.println("<head><title>Session example</title></head>");

		out.println("<body>");

		out.println("<h3>Are you loggined. Info stored in session</h3>");

		out.println("<a href='userInfo'>View User Info");
		
		out.println("</body>");
		out.println("</html>");
	}

}
