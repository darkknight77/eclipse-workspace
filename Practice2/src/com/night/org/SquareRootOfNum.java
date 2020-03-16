package com.night.org;

public class SquareRootOfNum {
	
	private static int sqrt(int num) {
		int start=1, end=num, mid=0, result=0;
		while(start<=end) {
			System.out.println("While----");
			System.out.println(start+" ---- "+end);
		mid = (start+end)/2;
		System.out.println(mid);
		System.out.println(mid*mid);
	
		
			
		if(mid*mid == num ) return mid;
		if(mid*mid < num) {
		start = mid+1;	
		result = mid;
		System.out.println("start: "+start);
		}
		else { 
			
			end=mid-1;
			System.out.println("end: "+end);
		}
		System.out.println("------------");
		}
		
		
		return result;
		
		//s1 -- 1 to 25 
		//s2 -- 1 to 12
		//s3 -- 1 to 5
		//s4 -- 4 to 5
		//s5 -- 5 to 5
		//s6 -- returns 5
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sqrt(625);
	}

}
