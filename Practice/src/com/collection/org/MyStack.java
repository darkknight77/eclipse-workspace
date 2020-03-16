package com.collection.org;

import java.util.Iterator;
import java.util.Stack;

public class MyStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Stack<String> movies = new Stack<String>();
	String arr[]= {"Dil","Avengers","Joker","Thor","Predator","Fast and Furious","Into the wild"};
	
	for (int i = 0; i < arr.length; i++) {
		
		 movies.push(arr[i]);
	}
	
	movies.pop();
	
	Iterator<String> itr = movies.iterator();
	
	while (itr.hasNext()) {
		System.out.println(itr.next());
		
	}
		
	}

}
