package com.night.org;

public class ArmstrongNum {

	// 0, 1, 153, 370, 371, 407, 1634

	public static void ArmStrong(int num) {

		int r = 0, sum = 0, temp = num;
		int order = getOrderofNum(num);
		while (num > 0) {
			r = num % 10;
			// sum += r*r*r;
			sum += Math.pow(r, order);
			num = num / 10;
		}
		if (temp == sum)
			System.out.println(temp + " is Armstrong");
		else
			System.out.println(temp + " is not Armstrong");

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
		// TODO Auto-generated method stub

		ArmStrong(1634);
	}

}
