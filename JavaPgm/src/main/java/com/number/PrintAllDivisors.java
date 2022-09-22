package com.number;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class PrintAllDivisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n%i==0) {
				System.out.println(i+" is  a divisor of "+n);
			}

		}

	}

}
