package DB;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Pro;
import customTools.DBUtil;



public class ProDB {

	public static List<Pro> getAllProducts()
	{
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		String queryStr = "SELECT p FROM Pro p ORDER BY p.productid";
		List<Pro> pros = null;
		try
		{
			Query query = em.createQuery(queryStr);
			pros =  query.getResultList();
			System.out.println("size = " + pros.size());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			em.close();
		}
		return pros;
	}
	
	
	public static Pro getProduct(long productId)
	{
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try
		{
			Pro pro = em.find(Pro.class, productId);
			
			return pro;
		}
		finally
		{
			em.close();
		}
	}
	
	
}
