package com.recursion;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class SumNum1 {

	//parameterized
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		fun(n, 0);

	}

	private static void fun(int i, int sum) {
		if (i < 1) {
			System.out.println(sum);
			return;
		}
		fun(i - 1, sum + i);
	}

}
