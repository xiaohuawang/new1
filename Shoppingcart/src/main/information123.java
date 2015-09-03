package main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Information;
import DB.InformationDB;

/**
 * Servlet implementation class information123
 */
@WebServlet("/information123")
public class information123 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public information123() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doget info");		
		String accountid1 = request.getParameter("accountid");
		long accountid = Long.parseLong(accountid1);
		
		String cardnum1 = request.getParameter("cardnum");
		long cardnum = Long.parseLong(cardnum1);
		
		String cardowner = request.getParameter("cardowner");
		
		Information information =new Information();
		
		 information.setAccountid(accountid);
		 information.setCardnum(cardnum);
		 information.setCardowner(cardowner);
		
		InformationDB.insert(information);
		 
		getServletContext().getRequestDispatcher("/Productlist.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("dopost info");		
		doGet(request,response);
	}

}
