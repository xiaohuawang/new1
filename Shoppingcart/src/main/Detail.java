package main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Pro;
import DB.CartDB;
import DB.ProDB;
/**
 * Servlet implementation class Detail
 */
@WebServlet("/Detail")
public class Detail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Detail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		System.out.println("doget in detail");
		
		//should have validated it first
          String a= request.getParameter("productId");
          System.out.println(a);

         long productId = Long.parseLong(request.getParameter("productId").toString());
		
        
        Pro pro = ProDB.getProduct(productId);
		String productData = "<div class='panel panel-info col-sm-6 col-sm-offset-3'>";
		productData += "<p>";
		productData += pro.getPname();
		productData += "</p>";
		productData += "<p>";
		productData += pro.getDescription();
		productData += "/<p>";
		productData += "<p>";
		productData += pro.getAmount();
		productData += "</p>";
		productData += "<p>";
		productData += pro.getPrice();
		//productData += "</p>";
		//productData += "<img src='"+ product.getImageLink() +"'/>";
		//productData += "</div>";
		
		request.setAttribute("productData", productData);
		long numItems = CartDB.getCount();
		HttpSession session = request.getSession();
		session.setAttribute("numItems", numItems);
		getServletContext().getRequestDispatcher("/Detail.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
