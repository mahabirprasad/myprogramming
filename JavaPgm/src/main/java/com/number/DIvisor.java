package com.number;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class DIvisor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		long sum=0;
        for(long i=1;i<=n;i++) {
            
                sum += (n/i)*i;
             
        }
        System.out.println(sum);

	}

}
