package com.tns.inheritance;

public class Citizen {
	protected String name;
	protected long aadharNo;
	protected String address;
	protected long phoneNo;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadharNo=" + aadharNo + ", address=" + address + ", phoneNo=" + phoneNo
				+ "]";
	}

	public Citizen() {
		super();
	}

	public Citizen(String name, long aadharNo, String address, long phoneNo) {
		super();
		this.name = name;
		this.aadharNo = aadharNo;
		this.address = address;
		this.phoneNo = phoneNo;
	}
	
}
