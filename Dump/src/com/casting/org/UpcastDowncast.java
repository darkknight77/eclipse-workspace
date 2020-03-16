package com.casting.org;

class Animal {
	public void sound() {
		System.out.println("Animal sound");
	}

}

class Dog extends Animal {
	public void sound() {
		System.out.println("Boow");
	}
}

class Labrador extends Dog {
	public void sound() {
		System.out.println("Lab Boww");
	}
}

public class UpcastDowncast extends Labrador {

	public static void main(String[] args) {
		
Animal an = new Dog(); //upcast
an.sound();
Labrador lb= (Labrador) new Dog(); //downcast (throws classCastException during runtime)
lb.sound();
		
	}
	
}
