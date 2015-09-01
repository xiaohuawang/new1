package DB;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import model.Product;
import oracle.jdbc.proxy.annotation.Post;
import customTools.DBUtil;



public class ProductDB
{
	
	
	public static Product getProduct(long id)
	{
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try
		{
			Product products = em.find(Product.class, id);
			return products;
		}
		finally
		{
			em.close();
		}
	}
	

	
	
	
	
	public static List<Product> getAllProducts()
	{
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		String queryStr = "SELECT p FROM Product p ORDER BY p.productid";
		List<Product> products = null;
		try
		{
			Query query = em.createQuery(queryStr);
			products =  query.getResultList();
			System.out.println("size = " + products.size());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			em.close();
		}
		return products;
	}
	


	
	public static void insert(Product product) 
	{
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin(); 
		try 
		{
			em.persist(product);
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

	public static void update(Product product) 
	{
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin(); 
		try 
		{
			em.merge(product);
			trans.commit();
		} catch (Exception e) 
		{
			System.out.println(e);
			trans.rollback();
		} 
		finally 
		{
			em.close();
		}
	}

	public static void delete(Product product) 
	{
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin(); 
		try 
		{
			em.remove(em.merge(product));
			trans.commit();
		} 
		catch (Exception e) 
		{
			System.out.println(e);
			trans.rollback();
		} finally 
		{
			em.close();
		} 
	}
}
