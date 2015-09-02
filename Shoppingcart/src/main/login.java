package main;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;
import customTools.DBUtil;

/**
 * Servlet implementation class login
 */
@WebServlet("/Login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("login doget");
		
		String message="";
		String uname=request.getParameter("uname");
		//String upassword =request.getParameter("upassword");
		
		  User user = new User();
	if(uname != null)
    {
		  
		if(!uname.isEmpty()) 
		
       {
			
		     EntityManager em = DBUtil.getEmFactory().createEntityManager();
		     EntityTransaction trans = em.getTransaction();
		
	      
		    String qString = "SELECT u FROM User u where u.uname = '" +uname + "'   ";
		   // String qString1 = "SELECT u FROM User u where u.upassword = '" +upassword + "'   ";
	     	TypedQuery<User> q =  em.createQuery(qString, User.class);
		    try{
			    user = q.getSingleResult();
		       }
		    
		    
		    catch(Exception e){
		       }
	
			
			if(user.getUname()!= null)
			{
				
				HttpSession session = request.getSession();
				session.setAttribute("currentuser", user);
				message="correct";
				response.setContentType("text/html");
				request.setAttribute("message", message);
				getServletContext().getRequestDispatcher("/Productlist.jsp")
				.forward(request, response);
				
				
			}
			
			else
			{
				message ="incorrect username";
				response.setContentType("text/html");
				request.setAttribute("message", message);
				getServletContext().getRequestDispatcher("/login.jsp")
				.forward(request, response);
				
			}
			
			 
       
        }
		
		else
		{
			message ="please  input message";
			response.setContentType("text/html");
			request.setAttribute("message", message);
			getServletContext().getRequestDispatcher("/login.jsp")
			.forward(request, response);
			
		}
	
    }		

		
		
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("login doPost");
		doGet(request, response);
	}

}
