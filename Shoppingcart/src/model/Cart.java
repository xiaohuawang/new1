package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CART database table.
 * 
 */
@Entity
@NamedQuery(name="Cart.findAll", query="SELECT c FROM Cart c")
public class Cart implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long cartid;

	private BigDecimal productid;

	private double quantity;

	public Cart() {
	}

	public long getCartid() {
		return this.cartid;
	}

	public void setCartid(long cartid) {
		this.cartid = cartid;
	}

	public BigDecimal getProductid() {
		return this.productid;
	}

	public void setProductid(BigDecimal productid) {
		this.productid = productid;
	}
 
	public double getQuantity() {
		return this.quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

}