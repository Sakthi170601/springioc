package mywebapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sendredirect")
public class SendRedirect extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("useremail");
		String password=req.getParameter("userpassword");
		
		if(!email.isBlank() && !password.isBlank() ) {
			resp.sendRedirect("SendRedirectHome.html");
		}
		else
			resp.sendRedirect("SendRedirectLogin.html");
	}
	
}
