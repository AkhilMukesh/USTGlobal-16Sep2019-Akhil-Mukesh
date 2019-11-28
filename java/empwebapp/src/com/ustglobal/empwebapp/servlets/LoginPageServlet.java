package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginPageServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		PrintWriter out = resp.getWriter();
		
		String id = "";
		Cookie[] cookies = req.getCookies();
		for(Cookie cookie:cookies) {
			if(cookie.getName().equals("alwaysRemember")) {
				id= cookie.getValue();
			}
		}
		out.println("<form action='./login' method='post'>");
		out.println("<tr>");
		out.println("<td>Id:</td>");
		out.println("<td><input type='text' name='id' value='"+id+"'></td>");
		out.println("	</tr>");
		out.println("<tr>\r\n" + 
				"					<td>Password:</td>\r\n" + 
				"					<td><input type='password' name='password'></td>\r\n" + 
				"				</tr>");
		out.println("<tr>\r\n" + 
				"				<td>Remeber Me</td>\r\n" + 
				"					<td><input type='checkbox' name='rememberme' value='checked'></td>\r\n" + 
				"					\r\n" + 
				"\r\n" + 
				"				</tr>");
		out.println("<td><input type='reset' name='reset'></td>\r\n" + 
				"				<td><input type='submit' name='login'></td>\r\n" + 
				"");
		out.println("<tr>\r\n" + 
				"\r\n" + 
				"					<a href='./register.html'>Register</a>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"				</tr>");
		out.println("</table>");
		out.println("	</form>");
		out.println("</fieldset>");
		
		
		
		
	}
}
