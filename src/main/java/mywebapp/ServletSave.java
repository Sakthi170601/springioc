package mywebapp;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/save")
public class ServletSave extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("pid"));
		String brand=req.getParameter("pbrand");
		double price=Double.parseDouble(req.getParameter("pprice"));
		double discount=Double.parseDouble(req.getParameter("pdiscount"));
		
		Product p=new Product(id,brand,price,discount);
		Data d=new Data();
		int a = 0;
		try {
			a = d.insertdata(p);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(a+" Rows inserted");
		
	}

}
