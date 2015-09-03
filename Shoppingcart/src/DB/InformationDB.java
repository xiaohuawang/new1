package DB;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import model.Information;
import model.Product;
import customTools.DBUtil;



public class InformationDB {

	public static void insert(Information information) 
	{
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin(); 
		try 
		{
			em.persist(information);
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

	
	public static List<Information> getAllProducts(long accountid)
	{
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		String queryStr = "SELECT p FROM Information p  where p.accountid= "  + accountid;
		List<Information> informations= null;
		try
		{
			Query query = em.createQuery(queryStr);
			informations =  query.getResultList();
			System.out.println("size = " + informations.size());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			em.close();
		}
		return informations;
	}
	
	
	
}
