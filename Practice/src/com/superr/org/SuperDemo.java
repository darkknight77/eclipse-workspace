package com.superr.org;

class Animal{
	
	public Animal() {
		System.out.println("Animal Constructor");
	}
	
public void sound() {
	System.out.println("boww in ANimal");
}	
	
}
public class SuperDemo extends Animal {
	
	public SuperDemo() {
		super();
		System.out.println("Child Constructor");
		super.sound();
		sound();
		
	}
	public void sound() {
		System.out.println("boww in child");
	}	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperDemo d = new SuperDemo();
		
	}

}
