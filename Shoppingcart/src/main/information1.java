package main;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Information;
import model.Product;
import DB.InformationDB;
import DB.ProductDB;

/**
 * Servlet implementation class information1
 */
@WebServlet("/information1")
public class information1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public information1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doget info1");	
		
		String accountid1 = request.getParameter("accountid");
		long accountid = Long.parseLong(accountid1);
		
		List<Information> informations = InformationDB.getAllProducts(accountid);
		
		String productData = "<table class='table table-bordered table-striped'>";
		productData += "<thead>";
		productData += "<tr>";
		productData += "<th>";
		productData +=  "Accountid";
		productData += "</th>";
		productData += "<th>";
		productData += "Cardnum";
		productData += "</th>";
		productData += "<th>";
		productData += "Cardowner";
		productData += "</th>";
		productData += "<th>";
		productData += "Action";
		productData += "</th>";

		productData += "</tr>";
		productData += "</thead>";
		
		for(Information information: informations)
		{
			System.out.println(information.getAccountid());
			productData += "<tr>";
				productData += "<td>";
				productData +=  information.getAccountid();
				productData += "</td>";
				productData += "<td>";
				productData += information.getCardnum();
				productData += "</td>";
				productData += "<td>";
				productData += information.getCardowner();
				productData += "</td>";
				productData += "<td>";
		
				productData += "</td>";
				productData += "</tr>";
			}
			productData += "</table>";
			
			request.setAttribute("productData", productData);
			getServletContext().getRequestDispatcher("/opinfo.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("dopost info1");		
		doGet(request,response);
		
	}

}
