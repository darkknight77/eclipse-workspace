package com.collection.org;

import java.util.Iterator;
import java.util.LinkedList;


public class MyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		LinkedList implements the Collection interface. It uses a doubly linked list internally to store the elements. It can store the duplicate elements. It maintains the insertion order and is not synchronized. In LinkedList, the manipulation is fast because no shifting is required.	
		
		
LinkedList<String> movies = new LinkedList<String>();
		
		String arr[]= {"Dil","Avengers","Joker","Thor","Predator","Fast and Furious","Into the wild"};
		
		for (int i = 0; i < arr.length; i++) {
			
			movies.add(arr[i]);
		}
		
Iterator<String> itr = movies.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		
	}
}