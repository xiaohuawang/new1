package main;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Pro;
import model.Product;
import DB.ProDB;


/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/Productlist")
public class Productlist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Productlist() {
        super();
        // TODO Auto-generated constructor stub
    }

    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Product post");
		
		
		
		
		List<Pro> pros = ProDB.getAllProducts();
		String productData = "<table class='table table-bordered table-striped'>";
		productData += "<thead>";
		productData += "<tr>";
		productData += "<th>";
		productData +=  "Product Name";
		productData += "</th>";
		productData += "<th>";
		productData += "Description";
		productData += "</th>";
		productData += "<th>";
		productData += "Price";
		productData += "</th>";
		productData += "<th>";
		productData += "Action";
		productData += "</th>";

		productData += "</tr>";
		productData += "</thead>";
		for(Pro pro : pros)
		{
			System.out.println(pro.getDescription());
			productData += "<tr>";
				productData += "<td>";
				productData += pro.getPname();
				productData += "</td>";
				productData += "<td>";
				productData += pro.getAmount();
				productData += "</td>";
				productData += "<td>";
				productData += pro.getPrice();
				productData += "</td>";
				productData += "<td>";
				productData += "<a class='btn btn-info glyphicon glyphicon-eye-open' href='/Shoppingcart/Detail?productId=" + pro.getProductid() +"'> View</a>  ";
				productData += "<a class='btn btn-primary glyphicon glyphicon-plus' href='/Shoppingcart/Addcart?productId=" + pro.getProductid() +"'> Add</a>";
				productData += "</td>";
			productData += "</tr>";
		}
		productData += "</table>";
		
		
		
		//Product product=new Product();
	    //ProductDB.insert(product);
		
		
		request.setAttribute("productData", productData);
		getServletContext().getRequestDispatcher("/OutputProduct.jsp").forward(request, response);
	
	
		
			
		
		
		
		
		
		
	
		
		
		
		
		
		
		
	}

}