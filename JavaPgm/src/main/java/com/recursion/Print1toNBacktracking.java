package com.recursion;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class Print1toNBacktracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print 1 to n by backtracking
		// we can't use f(i+1,n)
		// we can use f(i-1,n)
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		function(n, n);
	}

	private static void function(int i, int n) {
		if (i < 1) {
			return;
		}
	    function(i-1, n);
	    System.out.print(i+" ");
	}

}
