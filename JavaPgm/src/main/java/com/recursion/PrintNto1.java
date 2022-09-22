package com.recursion;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class PrintNto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		function(n,n);
	}

	private static void function(int i, int n) {
		// TODO Auto-generated method stub
		if (i<1) {
			return;
		}
		System.out.println(i);
		function(i-1, n);
		
	}

}
