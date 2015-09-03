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
	
	
	public static long getCount()
	{
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		String queryStr = "SELECT COUNT(l.PRODUCTID) FROM product l";
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
	
	
	
	public static Product getProduct(long id)
	{
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try
		{
			
			Product products = em.find(Product.class, id);
			//System.out.println(products);
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
	


	
	public static List<Product> getuserProducts(String uname)
	{
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		String queryStr = "SELECT p FROM Product p where p.uname='" + uname + "'";
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
		System.out.println("2.1");
		trans.begin(); 
		try 
		{
			System.out.println("2.2");
			em.persist(product);
			trans.commit();
			System.out.println("2.3");
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
