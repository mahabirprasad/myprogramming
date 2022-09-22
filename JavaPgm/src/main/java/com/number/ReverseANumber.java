package com.number;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class ReverseANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int rev = 0;
		while (n != 0) {
			int pop = n % 10;
			n = n / 10;
			if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
				System.out.println(0);
			if(rev<Integer.MIN_VALUE/10 ||(rev==Integer.MIN_VALUE/10 && pop<-8))
				System.out.println(0);
			rev = rev*10+pop;
		}
		System.out.println(rev);
	}

}
