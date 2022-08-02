package com.java1;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class NoOfCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a String");
		int count=0;
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]>=65&&ch[i]<=90||ch[i]>=97&&ch[i]<=122||ch[i]>=48&&ch[i]<=57||ch[i]!=32||ch[i]!=','||ch[i]!='.') {
				count++;
			}
		}
		System.out.println("count"+count);
	}

}
