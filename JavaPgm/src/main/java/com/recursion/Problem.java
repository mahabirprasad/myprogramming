package com.recursion;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * if input =5; output=225; explanation=1^3+2^3+3^3+4^3+5^3;
		 * 
		 * if input =7; output=784; explanation=1^3+2^3+3^3+4^3+5^3+6^3+7^3
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a numer ");
		int n = sc.nextInt();
		/*approach -1
		 * int sum = 0; for (int i = 1; i <= n; i++) { sum = sum + i * i * i; }
		 * System.out.println(sum);
		 */
		//approach -2
		/*
		 * int sum=((n*(n+1)/2)*(n*(n+1)/2)); System.out.println(sum);
		 */
	}

}
