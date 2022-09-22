package com.number;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class Pallindrum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int rev =0;
		int t = n;
		while (n>0) {
			rev = rev*10+(n%10);
			n = n/10;
		}
		if(rev==t) {
			System.out.println("pallindrum");
		}else {
			System.out.println("not pallindrum");
		}
	}

}
