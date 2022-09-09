package com.pepperl_fuchs.generals.string;

import java.util.Arrays;
import java.util.Iterator;

public class FormatStr {

	public static void main(String[] args) {
		int age = 25;
		String name1="Lucky";
		boolean isWeekend=false;
		//%s, and %d characters are format specifiers
		String formattedString = String.format("My name is %s and I'm %d years old.",name1,age,isWeekend);
		System.out.println(formattedString);
		
		//----------------------------------------------------
		String name="Lakkappa Bhajantri";
	System.out.println(Arrays.toString(name.split("")));
		
		String[] split = name.split(" ");
		for (String str : split) {
			System.out.print(""+str+", ");
		}
		System.out.println();
		//---------------------------------------------------------------------------------
		String value = "Lakkappa,-Bhjantri";
		String[] split2 = value.split(",-");
		for (String a : split2) {
			System.out.print(a);			
		}
		System.out.println();
	}

}
/*
SPECIFIER	DATA TYPE
%b, %B	Boolean
%s, %S	String
%c, %C	Unicode Character
%d	Decimal Integer
%f	Floating Point Numbers
*/