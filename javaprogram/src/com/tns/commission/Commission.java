package com.tns.commission;

public class Commission {

	private String Name;
	private String Address;
	private long Phone;
	private int Sales_amount;
	private int Commission;
	public int getCommission() {
		return Commission;
	}
	public void setCommission(int commission) {
		Commission = commission;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getPhone() {
		return Phone;
	}
	public void setPhone(long phone) {
		Phone = phone;
	}
	public int getSales_amount() {
		return Sales_amount;
	}
	public void setSales_amount(int sales_amount) {
		Sales_amount = sales_amount;
	}
	@Override
	public String toString() {
		return "Commission [Name=" + Name + ", Address=" + Address + ", Phone=" + Phone + ", Sales_amount="
				+ Sales_amount + ",Commission="+Commission+"]";
	
}
	}
