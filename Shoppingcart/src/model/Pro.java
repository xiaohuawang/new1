package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the PRO database table.
 * 
 */
@Entity
@NamedQuery(name="Pro.findAll", query="SELECT p FROM Pro p")
public class Pro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long productid;

	private int amount;

	private String description;

	private String pname;

	private double price;

	public Pro() {
	}

	public long getProductid() {
		return this.productid;
	}

	public void setProductid(long productid) {
		this.productid = productid;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}