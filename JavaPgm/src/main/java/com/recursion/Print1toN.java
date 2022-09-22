package com.recursion;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class Print1toN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		f(1,n);
	}

	private static void f(int i, int n) {
		// TODO Auto-generated method stub
		if (i>n) {
			return;
		}
		System.out.print(i+" ");
		f(i+1, n);
	}

}
