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
	public void sound() {
		System.out.println("Meoww");
	}
}

public class RuntimePolymorphism extends Cat{

	
	public static void main(String[] args) {
		
		/*
		 * Dog dog = new RuntimePolymorphism(); dog.sound();
		 */
		Cat cat = new RuntimePolymorphism(); 
		cat.sound();
		Animal animal = new RuntimePolymorphism();
		animal.sound();
	}

}
