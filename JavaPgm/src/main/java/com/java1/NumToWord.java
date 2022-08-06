package com.java1;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class NumToWord {

	static String[] one = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
			"tweleve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
	static String[] two = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty" };

	static void pw(int n, String st) {
		if (n <= 19) {
			System.out.print(one[n] + " ");
		} else {
			System.out.print(two[n / 10] + one[n % 10] + " ");
		}
		if (n != 0) {
			System.out.print(st + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		pw(n / 10000000, "crores");
		pw((n / 100000) % 100, "lakhs");
		pw((n / 1000) % 100, "thousand");
		pw((n / 100) % 10, "hundred");
		pw((n % 100), " ");
	}

}
