package com.ustglobal.practiceservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpRetryException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	
	
	public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
			
		
			int i = Integer.parseInt(req.getParameter("num1"));
			int j = Integer.parseInt(req.getParameter("num2"));
			
			
			int k = i+j;
			PrintWriter out = resp.getWriter();
			out.println(k);
			
		
	}
	
}