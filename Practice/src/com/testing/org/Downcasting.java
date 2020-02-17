package com.testing.org;

 class Phone1{
	
	public void call() {
		// TODO Auto-generated method stub
System.out.println("calling from phone");
	}
	
}
class Iphone1 extends Phone1{
	
	  public void call() { // TODO Auto-generated method stub
	  System.out.println("calling from Iphone"); }
	 
	
}
class Redmi1 extends Phone1{
	public void call() {
		// TODO Auto-generated method stub
System.out.println("calling from Redmi phone");
	}
	
}


public class Downcasting {
	
	private static String getString() {
		// TODO Auto-generated method stub
		return "Hola";
	}
	private static int getString1() {
		// TODO Auto-generated method stub
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone1 p=new Phone1();
		p.call();
		Iphone1 ip=new Iphone1();
		ip.call();
		Redmi1 rp=new Redmi1();
		rp.call();
		
		System.out.println("------------------");
		System.out.println("Downcasting");
		System.out.println("------------------");
		
		Object o= getString(); // getString1(); --> Class Cast Exception
		String s= (String) o;
		System.out.println(s);
		
		// Class Cast Exception
		Object obj = new Phone1();
		Iphone1 ip1 = (Iphone1) obj;
		ip1.call();
		
		Iphone1 ip2= (Iphone1) p;
		ip2.call();
		
		
	}

	

}
