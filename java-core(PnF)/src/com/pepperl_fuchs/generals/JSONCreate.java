package com.pepperl_fuchs.generals;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class JSONCreate {
	public static void main(String[] args) throws IOException {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("fName", "Lucky");
		
//		FileWriter file = new FileWriter("json\\emp.json");
//		file.write(jsonObject.toJSONString());
//		System.out.println("File created");
		
		FileReader reader = new FileReader("json\\emp.json");
		int read = reader.read();
		System.out.println(read);
	}
}
