package com.number;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		boolean r = isArmstrong(n);
		if (r) {
			System.out.println("Armstrong");
		} else {
			System.out.println("not an Armstrong");
		}
	}

	private static boolean isArmstrong(int n) {
		int nd = countNum(n);
		int t = n;
		int sum = 0;
		while (t > 0) {
			int r = t % 10;
			sum = sum + power(r, nd);
			t = t / 10;
		}
		if (sum == n) {
			return true;
		} else {
			return false;
		}
	}

	static int countNum(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n = n / 10;
		}
		return count;
	}

	static int power(int n, int p) {
		int pw = 1;
		while (p > 0) {
			pw = pw * n;
			p--;
		}
		return pw;
	}

}
