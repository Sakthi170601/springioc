package mywebapp;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/formdata")
public class FormInput extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("username");
		String stringcontact=req.getParameter("usercontact");
		long contact =Long.parseLong(stringcontact);
		res.getWriter().println("Hello"+" "+name+" "+"Contact Number is"+contact);
	}
	
}
