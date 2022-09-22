package com.number;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int i;
		if (n == 1)
			System.out.println("prime number starts from 2");
		for ( i = 2; i < n; i++) {
			if (n % i == 0) {
				System.out.println("not a prime number");
				break;
			}
		}
		if (n == i) {
			System.out.println("prime number");
		}

	}

}
