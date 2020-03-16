class A{
	
	static void m1() {
		System.out.println("Parent");
	}	
}

public class StaticMethodHiding extends A{
	
	static void m1() {
		System.out.println("Child");
	}
	
	public static void main(String[] args) {
			 
		A obj = new StaticMethodHiding();
		obj.m1();	
	}

}
