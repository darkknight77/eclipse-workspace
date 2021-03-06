package com.testing.org;

import java.util.HashMap;
import java.util.Map;

public class FindNumOfDupInArr {

	
	private static Map<Integer, Integer> findDups(int arr[]) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			
			int numCount = 1;
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i]==arr[j]) 
					{
					++numCount; 
					}
				
			}
			if(!map.containsKey(arr[i]))
            map.put(arr[i], numCount);			
		}
		
		return map;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 10, 22, 10, 70, 44, 70, 22, 66, 70 };
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map = findDups(arr);
		for (Map.Entry<Integer,Integer> entry : map.entrySet())  
	            System.out.println( entry.getKey() + 
	                             " : " + entry.getValue()); 
	    } 
	}


