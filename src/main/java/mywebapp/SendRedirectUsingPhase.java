package mywebapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sendredirectusingphase")
public class SendRedirectUsingPhase extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("-----------from service phase-------------");
		
		String email=req.getParameter("useremail");
		String password=req.getParameter("userpassword");
		
		if(!email.isBlank() && !password.isBlank() ) {
			resp.sendRedirect("SendRedirectHome.html");
		}
		else
			resp.sendRedirect("SendRedirectLogin.html");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("-----------from init phase-------------");
	}
	
	@Override
	public void destroy() {
		System.out.println("-----------from destory phase-------------");
	}
	
}
