package com.sqrt.org;

public class SqrtOfNum {

	private static int sqrt(int num) {
	
		int start = 1,end=num,result = 0,mid =0;
		
		while(start<=end) {
			
			 mid = (start+end)/2;
			
			if(mid*mid==num) return mid;
			
			if(mid*mid < num) {
				start=mid+1;
				result= mid;
				
			}else {
				end=mid-1;
			}
			
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sqrt(625));
		
	}

}
