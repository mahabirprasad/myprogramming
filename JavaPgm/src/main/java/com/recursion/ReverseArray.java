package com.recursion;

import java.util.ArrayList;
import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int n = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for (int j = i; j <=  n; j++) {
			al.add(j);
		}
		System.out.println(al);
		Integer[] ar = al.stream().toArray(Integer[]::new);
		for (Integer integer : ar) {
			System.out.print(integer+" ");
		}
	}

}
