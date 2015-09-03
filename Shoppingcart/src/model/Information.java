package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the INFORMATION database table.
 * 
 */
@Entity
@NamedQuery(name="Information.findAll", query="SELECT i FROM Information i")
public class Information implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long accountid;

	private long cardnum;

	private String cardowner;

	public Information() {
	}

	
	public long getAccountid() {
		return this.accountid;
	}

	public void setAccountid(long accountid) {
		this.accountid = accountid;
	}

	public long getCardnum() {
		return this.cardnum;
	}

	public void setCardnum(long cardnum) {
		this.cardnum = cardnum;
	}

	public String getCardowner() {
		return this.cardowner;
	}

	public void setCardowner(String cardowner) {
		this.cardowner = cardowner;
	}

}