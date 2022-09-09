package com.pepperl_fuchs.generals;

import java.util.Scanner;

public class JavaLoginPrg {

	private void login(String username, String password) {
//		String username, password;
		int totalattempts = 3;

		while (totalattempts != 0) {
			if (username.equals("temp") && password.equals("pass")) { // username=="temp" && password=="pass"
				System.out.println("Login Success");
				return;
			} else {
				System.out.println("Login Failed!!");
				totalattempts--;
				System.out.println(totalattempts);
			}
		}
	}

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);) {
			JavaLoginPrg loginPrg = new JavaLoginPrg();
			System.out.println("Enter username");
			String username = sc.nextLine();
			System.out.println("Enter password");
			String password = sc.nextLine();
			loginPrg.login(username, password);
		}
	}

}
