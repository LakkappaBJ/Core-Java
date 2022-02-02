package com.xworkz.programs;

import java.util.Scanner;

public class UserInputString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println(name);
		System.out.println("Enter your Gender");
		String gender = sc.next();
		System.out.println(gender);

	}

}
