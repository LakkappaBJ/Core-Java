package com.xworkz.programs;

import java.util.Scanner;

public class ArrayUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter your array size");
		n = sc.nextInt();

		int array[] = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Array Elements are");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}

	}

}
