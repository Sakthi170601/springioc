package mywebapp;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/s2")
public class ServletTwo extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String name=(String)req.getAttribute("name");
		String pass=(String)req.getAttribute("pass");
		
		res.getWriter().println("Name is "+name+" Password is "+pass);
	}

}
