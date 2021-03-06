package com.testing.org;

import java.util.ArrayList;

public class ArmstrongNum {

	// 0, 1, 153, 370, 371, 407, 1634

	public static ArrayList<Integer> getArmstrongNums(int count) {

		ArrayList<Integer> armstrongNums = new ArrayList<>();
		int r = 0, out = 0, temp = 0;
		for (int i = 0; i < count; i++) {
			
			temp = i;
			out = 0;
			int order = getOrderofNum(i);
			while (temp > 0) {

				r = temp % 10;
				temp = temp / 10;
				out += Math.pow(r, order);

			}

			if (out == i) {

				armstrongNums.add(i);
			}
		}
		return armstrongNums;

	}

	public static String isArmstrongNum(int num) {

		int temp = num, r = 0, out = 0;
		int order = getOrderofNum(num);
		while (temp > 0) {
			r = temp % 10;
			temp = temp / 10;
			out += Math.pow(r, order);
		}

		if (out == num)
			return num + " is a Armstrong Number";
		else
			return num + " is not a Armstrong Number";

	}

	public static int getOrderofNum(int num) {
		int order = 0;
		while (num > 0) {
			order++;
			num = num / 10;
		}

		return order;

	}

	public static void main(String[] args) {

		System.out.println(isArmstrongNum(5));
		System.out.println(getArmstrongNums(10000));

	}

}
