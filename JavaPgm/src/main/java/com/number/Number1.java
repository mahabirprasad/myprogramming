package com.number;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class Number1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int t = n;
		int count = 0;
		while (t > 0) {
			int d = t%10;
			t= t/10;
			if (n%d==0) {
				count++;
			}
		}
		System.out.println(count);

	}

}
