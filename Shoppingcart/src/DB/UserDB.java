package DB;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import model.User;
import customTools.DBUtil;



public class UserDB {

	public static void insert(User user) 
	{
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin(); 
		try 
		{
			em.persist(user);
			trans.commit();
		} 
		catch (Exception e) 
		{
			System.out.println(e);
			trans.rollback();
		} 
		finally 
		{
			em.close();
		}
	}

	
	
	
	
	
}
