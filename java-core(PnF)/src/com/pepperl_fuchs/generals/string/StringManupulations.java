package com.pepperl_fuchs.generals.string;

public class StringManupulations {

	public static void main(String[] args) {
		String s1 = new String("Lucky");
		String s2 = new String("Lucky");
		String s3 = "Lucky";
		String s4 = "Lucky";
		System.out.println(s1 == s2); // F
		System.out.println(s1.equals(s2)); // T
		System.out.println(s1 == s3); // F
		System.out.println(s1.equals(s3)); // T
		System.out.println(s3 == s4); // T

		String s5 = s1.intern();
		System.out.println(s3 == s5); // T

	}

}
