package com.mycomparable.org;

public class Laptop implements Comparable<Laptop> {

	int ram;
	int price;
	String brand;
	
	public Laptop(int ram, int price, String brand) {
		super();
		this.ram = ram;
		this.price = price;
		this.brand = brand;
	}

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
		return "Laptop [ram=" + ram + ", price=" + price + ", brand=" + brand + "]";
	}

	@Override
	public int compareTo(Laptop l2) {
		
		if(this.getRam()>l2.getRam()) return 1;
		
		return -1;
	}

}
