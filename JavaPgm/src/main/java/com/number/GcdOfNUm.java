package com.number;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class GcdOfNUm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = gcd(a,b);
		System.out.println(c);
	}

	private static int gcd(int m, int n) {
		if(m<n)
			return gcd(n,m);
		if(n==0)
			return m;
		return gcd(n,m%n);
	}

}
