package org.o7planning.tutorial.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String emailSupport1;

	public InitParamServlet() {
		// TODO Auto-generated constructor stub
		System.out.println("test1");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("test2");
		super.init(config);
		this.emailSupport1 = config.getInitParameter("emailSupport1");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("test3");
		// Lấy ra giá trị của tham số khởi tạo (initialization parameter) theo một cách
        // khác.
		String emailSupport2 = this.getServletConfig().getInitParameter("emailSupport2");
		ServletOutputStream out = resp.getOutputStream();
		 
	        out.println("<html>");
	        out.println("<head><title>Init Param</title></head>");
	 
	        out.println("<body>");
	        out.println("<h3>Init Param</h3>");
	        out.println("<p>emailSupport1 = " + this.emailSupport1 + "</p>");
	        out.println("<p>emailSupport2 = " + emailSupport2 + "</p>");
	        out.println("</body>");
	        out.println("<html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
}
