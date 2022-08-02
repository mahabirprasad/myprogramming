package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class A {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Delhi");
		l.add("Bangalore");
		l.add("100");
		l.add("200");
		List<Integer> l1 = new ArrayList<>();
		l1.add(100);
		l1.add(200);
		l1.add(300);
		l1.add(400);
		List l2 = l1.stream().map(s -> String.valueOf(s)).collect(Collectors.toList());
		System.out.println(l2);
		l2.retainAll(l);
		l.removeAll(l2);
		System.out.println(l2);
		

	}

}
