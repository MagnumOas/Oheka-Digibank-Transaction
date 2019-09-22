package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "customer")
@SessionScoped
public class Customer {
	
	private String firstname;
	private String surname;
	private String sourcePass;
	private String destPass;
	private String destBank;
	private String destCountry;
	private String accNumber;
	private String amount;
	
	
	
	
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
	
	
	public CustomerEntity getEntity()
	{
		CustomerEntity customerentity = new CustomerEntity();
		customerentity.setFirstname(firstname);
		customerentity.setSurname(surname);
		customerentity.setSourcePass(sourcePass);
		customerentity.setDestPass(destPass);
		customerentity.setDestBank(destBank);
		customerentity.setDestCountry(destCountry);
		customerentity.setAccNumber(accNumber);
		customerentity.setAmount(amount);
		//customerentity.setTransacCode(transacCode);
		
		
		
		return customerentity;
		
	}
	


}
