package DB;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import model.Cart;
import customTools.DBUtil;

public class CartDB
{
	public static long getCount()
	{
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		String queryStr = "SELECT COUNT(l.cartid) FROM Cart l";
		long count = 0;
		try
		{
			Query query = em.createQuery(queryStr);
			count = (long) query.getSingleResult();
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			em.close();
		}
		return count;
	}
	
	public static List<Cart> getCarts()
	{
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		String queryStr = "SELECT l FROM Cart l";
		List<Cart> carts = null;
		try
		{
			Query query = em.createQuery(queryStr);
			carts =  query.getResultList();
			System.out.println("size = " + carts.size());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			em.close();
		}
		return carts;
	}
	
	public static void insert(Cart carts) 
	{
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin(); 
		try 
		{
			em.persist(carts);
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
	
	
	
	
	
	
	
	
	