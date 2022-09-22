package com.recursion;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class PrintNto1Backtrack {

	public static void main(String[] args) {
		/*
		 * we can't use f(i-1,n), we can use f(i+1,n)
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		function(1,n);
	}

	private static void function(int i, int n) {
		if (i>n) {
			return;
		}
		function(i+1,n);
		System.out.print(i+" ");
	}

}
