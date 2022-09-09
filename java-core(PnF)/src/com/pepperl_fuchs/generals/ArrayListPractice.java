package com.pepperl_fuchs.generals;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		list.add(10);
		list.add(10);
		list.add("Lucky");
		list.add(false);
		list.add(10.05);
		list.add('L');
		list.add(null);
		System.out.println(list);
		list.add(1, 11);         //inserting
		System.out.println(list);
		list.remove(2);
		System.out.println(list); //deleting
		
		for (Object object : list) {
			System.out.print(" "+object);
		}
		
	}

}
