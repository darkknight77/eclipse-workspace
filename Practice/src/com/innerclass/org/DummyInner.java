package com.innerclass.org;

import java.io.ObjectInputStream.GetField;

public class DummyInner {

	int x= 5;
	static int y = 15;
	
	public int getX(){
		 
		  return x;
	  }
	public static  int getY(){
		 
		  return y;
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DummyInner.inner i = new DummyInner().new inner();
		System.out.println(i.k);
		System.out.println(i.j);
		System.out.println();
	}
	
	
	class inner{
		int a=3;
		DummyInner d= new DummyInner();
		int  b=y;
		
		int k=d.getX();
		int j=DummyInner.getY();
		
		public int getY(){
			 
			  return y;
		  }
		
	}

}
