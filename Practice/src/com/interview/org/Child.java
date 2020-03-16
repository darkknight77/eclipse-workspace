package com.interview.org;

public class Child  extends Base{

	public Child() {
	System.out.println("Child constructor");
	}
	{
		System.out.println("child empty block");
	}
	static {
		System.out.println("static child block  ");
	}
	
	public static void main(String[] args)
	{
	      Child c = new Child(); 
		  System.out.println(c.a);
		  float f=  5.6f;
		  int i=5;
		  float f1 = (float) i;  
		
	}

}
