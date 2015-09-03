package main;



import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Cart;
import model.Product;
import DB.CartDB;
import DB.ProductDB;

/**
 * Servlet implementation class AddToCart
 */
@WebServlet("/Shoppingcart")
public class Shoppingcart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Shoppingcart() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	
	
    	System.out.println("doget shoppingcart");
    	
    	Cart cart =new Cart();
    	
    	HttpSession session = request.getSession();
		//int quantity = (int) session.getAttribute("quantity");
    	
		//System.out.println(quantity);
		//String name = (String) session.getAttribute("cname");
		
    	//cart.setQuantity(quantity);
		
    	
    	//List<Cart> carts = CartDB.getCarts();
    	String lineData = "<table class='table table-bordered table-striped'>";
    	lineData += "<thead>";
		lineData += "<tr>";
		lineData += "<th>";
		lineData += "Product Name";
		lineData += "</th>";
		lineData += "<th>";
		lineData += "Price";
		lineData += "</th>";
		lineData += "<th>";
		lineData += "UserName";
		lineData += "</th>";
		lineData += "<th>";
		lineData += "Description";
		lineData += "</th>";
		lineData += "</tr>";
		lineData += "</thead>";
		
		String uname = (String) session.getAttribute("uname");
		List<Product> products =  ProductDB.getuserProducts(uname);
		//List<Cart> carts =  CartDB.getCarts();
		session.setAttribute("products",products);
		
		
		// session.setAttribute("quantity", quantity);
		double total = 0;
		for(Product product : products)
		{
			
			lineData += "<tr>";
			lineData += "<td>";
			
			//lineData += cart.getProduct().getPname();
			lineData += product.getPname();
			lineData += "</td>";
			lineData += "<td>";
			//lineData += cart.getProduct().getPrice();
			lineData += product.getPrice();
			lineData += "</td>";
			lineData += "<td>";
			lineData += product.getUname();
			
			lineData += "</td>";
			lineData += "<td>";
			lineData += product.getDescription();
			lineData += "</td>";
			lineData += "</tr>";
			//total += lineItem.getLineTotal();
			
		}
		//lineData +="<tr>";
		//lineData +="<td colspan='3'>" + "Total" + "</td>";
		//lineData +="<td>" + total + "</td>";
		//lineData +="</tr>";
		lineData +="</table>";
		request.setAttribute("lineData", lineData);
		
		
		//long NumItems=ProductDB.getCount();
		//HttpSession session = request.getSession();
		//session.setAttribute("NumItems", NumItems);
		getServletContext().getRequestDispatcher("/ShoppingCart.jsp").forward(request, response);
		
		
		
		
    }
		
    
    
		
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}
		
		


}   
    
    
    