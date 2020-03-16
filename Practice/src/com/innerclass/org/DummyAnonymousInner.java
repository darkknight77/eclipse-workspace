package com.innerclass.org;

public class DummyAnonymousInner {
	
	
	static Demo d= new Demo() {
		
		void psv() {
			super.psv();
			System.out.println("Heyaa");
			
		}
		
	};
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		d.psv();
		
		
	}

}
