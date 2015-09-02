package main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import DB.UserDB;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doget");
		
		String userid1 = request.getParameter("userid");
		long userid= Long.parseLong(userid1);
				
		String uname= request.getParameter("uname");
		String upassword1=request.getParameter("upassword");
		long upassword = Long.parseLong(upassword1);
		
		User user=new User();
		user.setUname(uname);
		user.setUpassword(upassword);
		user.setUserid(userid);
		
		UserDB.insert(user);
		System.out.println("end");
		
		//request.setAttribute("product", product);
		getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
		
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("dopost");
		doGet(request, response);
	}

}
