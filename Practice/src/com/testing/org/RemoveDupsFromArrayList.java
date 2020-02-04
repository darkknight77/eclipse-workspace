package com.testing.org;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDupsFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
	    
		for (int i = 1; i < 15; i++) {
			list .add(i);
		}
		
		list.add(5);
		list.add(10);
		list.add(2);

		System.out.println(list);
		
		Set<Integer> set= new LinkedHashSet<Integer>(list);
		list.clear();
		list.addAll(set);
		System.out.println(list);
	}

}
