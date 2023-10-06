package com.tns.collectioncom;

import java.util.Comparator;

public class LaptopClass implements Comparable<LaptopClass> {
	private String brand;
	private int ram;
	private int price;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}
	public LaptopClass(String brand, int ram, int price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}
	
	
	@Override
	public int compareTo(LaptopClass o) {
		// TODO Auto-generated method 
    if(this.getPrice()>o.getPrice())
    	return 1;
    else
		return 0;
	}
//    public  int compareTo(LaptopClass ob)
//    {
//    	if(this.getPrice()>ob.getPrice()) {
//    		return 1;
//    	}
//    	else return -1;
//    }
//}


}
