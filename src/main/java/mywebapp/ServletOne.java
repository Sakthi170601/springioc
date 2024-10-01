package mywebapp;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/s1")
public class ServletOne extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("username");
		String password=req.getParameter("userpassword");
		
		req.setAttribute("name", name);
		req.setAttribute("pass", password);
		
		req.getRequestDispatcher("s2").forward(req, res);
	}

}
