package com.recursion;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class SumNum2 {

	//recurrsive 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		System.out.println(sum(n));
	}

	private static int sum(int n) {
		if (n == 0) {
			return 0;
		}
		return n + sum(n - 1);
	}

}
