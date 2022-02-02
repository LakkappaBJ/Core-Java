//Trainee deatails using user input 
package com.xworkz.programs;
import java.util.Scanner;
public class TraineeDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter your id");
		int id = sc.nextInt();
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("Enter your mobile number");
		long number = sc.nextLong();
		System.out.println("Enter your highest degre percentage");
		double per = sc.nextDouble();
		System.out.println("grade");
		char ch = sc.next().charAt(0);
		System.out.println("are you currently pursuing Java Enterprise Course at X-workz?");
		boolean bl = sc.nextBoolean();

		System.out.println("name: "+name);
		System.out.println("id: "+id);
		System.out.println("age: "+age);
		System.out.println("mobile number: "+number);
		System.out.println("percentage: "+per);
		System.out.println("grade: "+ch);
		System.out.println(bl);
		
	}

}
