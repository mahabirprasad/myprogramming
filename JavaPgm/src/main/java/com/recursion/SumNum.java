package com.recursion;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class SumNum {
	
	//parameterized

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		fun(1,n);
		System.out.println(sum);
	}

	static int sum =0;
	private static void fun(int i, int n) {
		if (i>n) {
			return;
		}
		sum = sum +i;
		fun(i+1, n);
	}
}
