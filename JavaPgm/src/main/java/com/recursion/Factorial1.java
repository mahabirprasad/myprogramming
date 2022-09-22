package com.recursion;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class Factorial1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		fun(n, 1);
	}

	private static void fun(int i, int fact) {
		// TODO Auto-generated method stub
		if (i < 1) {
			System.out.println(fact);
			return;
		}
		fun(i - 1, fact * i);
	}

}
