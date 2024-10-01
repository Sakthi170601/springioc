package mywebapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Data {
	Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql:///newdatabase","root","root");	
	}
     protected int insertdata(Product p) throws SQLException, ClassNotFoundException{
		Connection con=getConnection();
		PreparedStatement pst=con.prepareStatement("insert into product values(?,?,?,?)");
		pst.setInt(1, p.getId());
		pst.setString(2,p.getBrand());
		pst.setDouble(3,p.getPrice());
		pst.setDouble(4,p.getDiscount());
		int a=pst.executeUpdate(); 
		return a;
	}
     public int deletedata(int id) throws SQLException, ClassNotFoundException{
    	Connection con=getConnection();
 		PreparedStatement pst=con.prepareStatement("delete from product where id=?");
 		pst.setInt(1, id);
 		int a=pst.executeUpdate();
    	return a;
     }
     public Product fetchdata(int id) throws ClassNotFoundException, SQLException{
    	Connection con=getConnection();
  		PreparedStatement pst=con.prepareStatement("select * from product where id=?");
  		pst.setInt(1, id);
  		ResultSet rs=pst.executeQuery();
  		rs.next();
  		Product p=new Product(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getDouble(4));
  		return p;	 
     }
     public  List<Product> fetchAll() throws ClassNotFoundException, SQLException{
    	Connection con=getConnection();
   		PreparedStatement pst=con.prepareStatement("select * from product");
   		ResultSet rs=pst.executeQuery();
    	List<Product> a=new ArrayList<>();
    	while(rs.next()){
    		 Product p=new Product(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getDouble(4));
    		 a.add(p);
    	 }
    	 return a;
     }
}

class Product{
	private int id;
	private String brand;
	private double price;
	private double discount;
	Product(int id, String brand, double price, double discount) {
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", brand=" + brand + ", price=" + price + ", discount=" + discount + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
}

