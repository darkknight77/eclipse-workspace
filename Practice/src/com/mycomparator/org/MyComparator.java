package com.mycomparator.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class MyComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();

		list.add(568);
		list.add(723);
		list.add(945);
		list.add(197);
		list.add(874);
		list.add(333);

		// Collections.sort(list);

		// Comparator<Integer> com = new CompImp();
		// Collections.sort(list, com);

		/*
		 * Comparator<Integer> com = new Comparator<Integer>() {
		 * 
		 * @Override public int compare(Integer o1, Integer o2) { if(o1>o2)return 1;
		 * return -1; } };
		 */

		Comparator<Integer> com = (o1, o2) -> {
			//o1%10 > o2%10 -----> sorting based upon last digit of the number
				if (o1%10 > o2%10)
					return 1;
				return -1;
		};

		Collections.sort(list, com);

		for (Integer integer : list) {
			System.out.println(integer);
		}

	}

}
