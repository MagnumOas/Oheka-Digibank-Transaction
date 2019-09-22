package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="customer_table")
public class CustomerEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String firstname;
	private String surname;
	private String sourcePass;
	private String destPass;
	private String destBank;
	private String destCountry;
	private String accNumber;
	private String amount;
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String transacCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSourcePass() {
		return sourcePass;
	}

	public void setSourcePass(String sourcePass) {
		this.sourcePass = sourcePass;
	}

	public String getDestPass() {
		return destPass;
	}

	public void setDestPass(String destPass) {
		this.destPass = destPass;
	}

	public String getDestBank() {
		return destBank;
	}

	public void setDestBank(String destBank) {
		this.destBank = destBank;
	}

	public String getDestCountry() {
		return destCountry;
	}

	public void setDestCountry(String destCountry) {
		this.destCountry = destCountry;
	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getTransacCode() {
		return transacCode;
	}

	public void setTransacCode(String transacCode) {
		this.transacCode = transacCode;
	}
	
	
	
	
}
