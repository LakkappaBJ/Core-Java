package com.xworkz.programs.aptitude;

public class AptiPrograms {
	// factorial given number
	static int fact = 1;

	public static void factorial(int n) {
		System.out.println("factorial series of " + n);
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
			System.out.println(i + "!= " + fact);
		}
		System.out.println();
		System.out.println("factorial of " + n + "= " + fact);
	}

	// fibonacci series
	public static void fibonacci(int n) {
		int num1 = 0, num2 = 1;
		System.out.println("fibonacci numbers of " + n);
		for (int i = 1; i <= n; i++) {
			int total = num1 + num2;
			System.out.println(num1);
			num1 = num2;
			num2 = total;
		}
	}

	// swapping two numbers without using third variable
	static public void swap(int a, int b) {
		System.out.println("Before swapping");
		System.out.println("a=" + a + " b=" + b);
		b = a + b - (a = b);
		System.out.println("After swaping");
		System.out.println("a=" + a + " b=" + b);

	}

	// reverse given number
	public static void reverseNumber(int n) {
		System.out.println("Reverse number " + n + " is");
		for (; n > 0;) {
			int rem = n % 10;
			System.out.print(rem);
			n = n / 10;
		}
	}

	// given number is odd or even
	public static void evenOdd(int n) {
		if (n % 2 == 0) {
			System.out.println("given number " + n + " is even");
		} else {
			System.out.println("given number" + n + " is odd");
		}
	}

	// to check given number is prime or not
	public static void primeNumber() {
		int n = 3, count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("The given number is prime");
		} else {
			System.out.println("The given number is not prime");
		}
	}

	// given year is leap year or not
	public static void leapYear(int year) {
		if (((year % 4 == 0) || (year % 100 == 0)) || (year % 400 == 0)) {
			System.out.println(year + " Leap year");
		} else {
			System.out.println(year + " Not lear year");
		}
	}

}
