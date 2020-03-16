package com.mycomparable.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableDemo  {

	
	public static void main(String[] args) {
			
		List<Laptop> list= new ArrayList<Laptop>();
		list.add(new Laptop(8, 35000, "dell"));
		list.add(new Laptop(4, 55000, "hp"));
		list.add(new Laptop(16, 80000, "lenovo"));
		
		// Using Comparable //
		
		//Collections.sort(list);
		
		// Using Comparator //
		
		Comparator<Laptop> com = (l1, l2) -> {
			
				if (l1.getRam() > l2.getRam())
					return 1;
				return -1;
		};
		
		Collections.sort(list,com);
		
		for (Laptop laptop : list) {
			System.out.println(laptop);
		}
	}

	
}
