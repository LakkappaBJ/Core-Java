//to providing user input by using Scanner class
package com.xworkz.programs;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter byte value");
		byte b = sc.nextByte();
		System.out.println(b);
		System.out.println("Enter the short value");
		short sh = sc.nextShort();
		System.out.println(sh);
		System.out.println("Enter the integer value");
		int number = sc.nextInt();
		System.out.println(number);
		System.out.println("Enter the Long value");
		long l = sc.nextLong();
		System.out.println(l);
		System.out.println("Enter your float value");
		float f = sc.nextFloat();
		System.out.println(f);
		System.out.println("Enter your double value");
		double d = sc.nextDouble();
		System.out.println(d);
		System.out.println("Ente your boolean value");
		boolean bl = sc.nextBoolean();
		System.out.println(bl);
		System.out.println("Enter your character");
		char ch = sc.next().charAt(0);
		System.out.println(ch);
	}

}
