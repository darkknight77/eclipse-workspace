package com.testing.org;

class Phone{
	
	public void call() {
		// TODO Auto-generated method stub
System.out.println("calling from phone");
	}
	
}
class Iphone extends Phone{
	/*
	 * public void call() { // TODO Auto-generated method stub
	 * System.out.println("calling from Iphone"); }
	 */
	
}
class Redmi extends Phone{
	public void call() {
		// TODO Auto-generated method stub
System.out.println("calling from Redmi phone");
	}
	
}


public class Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone p=new Phone();
		p.call();
		Iphone ip=new Iphone();
		ip.call();
		Redmi rp=new Redmi();
		rp.call();
		
		System.out.println("------------------");
		System.out.println("Upcasting");
		System.out.println("------------------");
		
		Phone p1 =(Phone) ip; 
		p1.call();
		Phone p2=new Redmi();
		p2.call();
		
	}

}
