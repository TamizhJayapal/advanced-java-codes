package com.demo;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DemoServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    public DemoServlet() {
        super();
    }
    
    public void init() {
    	System.out.println("servlet started");
    }
    
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("username");
		
		out.println("<html><head><title>GenericServlet</title></head><body>");
        out.println("<h1>Hello, " +  name + "!</h1>");
        out.println("</body></html>");
	}
	
	public void destroy() {
		System.out.println("servlet ended");
	}

}
