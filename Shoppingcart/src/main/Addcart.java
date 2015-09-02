package main;

import java.io.IOException;

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
 * Servlet implementation class Addcart
 */
@WebServlet("/Addcart")
public class Addcart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Addcart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doget addtoCart");
		
		String productIdStr = request.getParameter("productId");
		
		//System.out.println("1");
		
		long productId = Long.parseLong(productIdStr);
		
		//System.out.println("2");
		
		Product product = ProductDB.getProduct(productId);
		
		//System.out.println("3");
		
		request.setAttribute("product", product);
		
		
		//System.out.println("4");
		
		getServletContext().getRequestDispatcher("/addcart.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
System.out.println("dopost");
	/*	
		String quantityStr = request.getParameter("quantity");
		String productIdStr = request.getParameter("productId");
		
		System.out.println(quantityStr + " " + productIdStr);
		int quantity = Integer.parseInt(quantityStr);
		long productId = Long.parseLong(productIdStr);
		
		Product product = new Product();
		product.setAmount(quantity);
		Cart cart=new Cart();
		cart.setQuantity(quantity);
		//lineItem.setQuantity(quantity);
		
		//lineItem.setShopproduct(DBProduct.getProduct(productId));
		CartDB.insert(cart);
		//DBLineItem.insert(lineItem);
		long numItems= CartDB.getCount(); 
		//long numItems = DBLineItem.getCount();
		HttpSession session = request.getSession();
		session.setAttribute("numItems", numItems);
		getServletContext().getRequestDispatcher("/ShoppingCart").forward(request, response);
	*/	
		
		// TODO Auto-generated method stub
		
		
		
	}

}
