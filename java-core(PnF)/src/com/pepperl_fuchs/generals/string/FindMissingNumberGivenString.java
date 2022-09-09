package com.pepperl_fuchs.generals.string;

public class FindMissingNumberGivenString {

	public static void main(String[] args) {
		String numbers="56,57,58,60";
		String[] split = numbers.split(",");

		for (int i = 0; i < split.length; i++) {
			int int1= Integer.parseInt(split[i]);
			System.out.println(int1);
		}
		
	}

}
