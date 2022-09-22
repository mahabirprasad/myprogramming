package com.recursion;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		System.out.println(fact(n));
	}

	private static int fact(int n) {
		// TODO Auto-generated method stub
		if (n == 1) {
			return 1;
		}
		return n * fact(n - 1);

	}

}
