package com.java;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		System.out.println(a);
		for (int i = 0; i < n; i++) {
			int c = a + b;
			a = b;
			b = c;
			System.out.println(a);
		}
	}

}
