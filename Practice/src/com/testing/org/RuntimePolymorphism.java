package com.testing.org;


class Animal{
	public void sound() {
		System.out.println("Ooww");
	}
}
class Dog extends Animal{
	public void sound() {
		System.out.println("BOOOOOwwwwwwwww");
	}
}
class Cat extends Animal{
	
}

public class RuntimePolymorphism extends Cat{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Dog dog = new RuntimePolymorphism(); dog.sound();
		 */
		Cat cat = new RuntimePolymorphism(); 
		cat.sound();
		Animal animal =new RuntimePolymorphism();
		animal.sound();
	}

}