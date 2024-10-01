package mywebapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookieone")
public class CookieOne extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("username");
		String pass=req.getParameter("userpassword");
		
		Cookie c1Cookie=new Cookie("k1",name);
		Cookie c2Cookie=new Cookie("k2",pass);
		
		resp.addCookie(c1Cookie);
		resp.addCookie(c2Cookie);
		
		req.getRequestDispatcher("cookietwo").forward(req, resp);
	}
	
}
