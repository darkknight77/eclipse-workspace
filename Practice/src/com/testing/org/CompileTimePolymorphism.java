package com.testing.org;

public class CompileTimePolymorphism {

	
	public static int add(int a,int b) {
		return a+b;
	}
	
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	
	public double add(double a,double b,double c) {
		return a+b+c;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CompileTimePolymorphism obj=new CompileTimePolymorphism();
		System.out.println(CompileTimePolymorphism.add(10,5));
		System.out.println(obj.add(10, 12,37));
		System.out.println(obj.add(58.12, 4.04,8.96));
		
	}

}