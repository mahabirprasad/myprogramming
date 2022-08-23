package com.java1;
/*
*@author: Mahabir Prasad Mohapatra
*/
public class Rectangle {
	int length;
	int breath;
	
	public Rectangle(int length,int breath) {
		length = this.length;
		breath= this.breath;
	}
	void calculateARea() {
		 int area = length*breath;
		 System.out.println(area);
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(10, 20);
		 r.calculateARea();

	}

}
