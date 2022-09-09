package com.pepperl_fuchs.generals;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONRead {

	public static void main(String[] args) {
		JSONParser parser = new JSONParser();
		try {
			Object object = parser.parse(new FileReader("C:\\J2eeDev\\eclipse-2019\\emp.json"));
			//if you want to entire JSON file  
			JSONArray jObj= (JSONArray) object; 
			for (Object object2 : jObj) {
				System.out.println(object2);
			}
			//----------------------OR----------------------
			
			Iterator iterator = jObj.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
//			 String s1 = jObj.toJSONString(); 
//			 System.out.println(s1+"\n");

		//--------------------------only keys--------------------
		/*	JSONObject jObj = (JSONObject) object;
			String s1 = (String) jObj.get("EmployeeID");
			String s2 = (String) jObj.get("EmployeeName");
			String s3 = (String) jObj.get("salary");
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);    */
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
