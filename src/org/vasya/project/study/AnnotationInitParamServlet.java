package org.vasya.project.study;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/annotationExmpl", "/ann"}, initParams = {
	@WebInitParam(name = "emailSupport1", value = "lol@lolexample.ru"),
	@WebInitParam(name = "emailSupport2", value = "olds@qwe.com"),
})
public class AnnotationInitParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String emailSupport1;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String emailSupport2 = this.getServletConfig().getInitParameter("emailSupport2");
		
		ServletOutputStream out = resp.getOutputStream();
		
		
		
		out.println("<html>");
	   out.println("<head><title>Hello Servlet11</title></head>");
	    
	   out.println("<body>");
	   out.println("<h3>init Param</h3>");
	   out.println("<p>emailSupport1 = " + this.emailSupport1 + "</p>");
	   out.println("<p>emailSupport2 = " + emailSupport2 + "</p>");
	   out.println("</body>");
	   out.println("<html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		this.emailSupport1 = config.getInitParameter("emailSupport1");
	}
}
