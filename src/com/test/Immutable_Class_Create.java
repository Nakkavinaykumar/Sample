package com.test;

import java.util.HashMap;
import java.util.Map;

public class Immutable_Class_Create {

	public static void main(String[] args) {
	
		 Map<String, String> map = new HashMap<>();
		
		   map.put("1", "first");
	        map.put("2", "second");
	        Student2 s= new Student2("ABC", 101, map);  
	        
	        System.out.println(s.getName());
	        System.out.println(s.getRegNo());
	        System.out.println(s.getMetadata());
//	      )
	}	

}

 final class Student2{
	private final String name;
	private final int regNo;
	private final Map<String,String> metadata;
	public Student2(String name, int regNo, Map<String, String> metadata) {
		super();
		this.name = name;
		this.regNo = regNo;
		this.metadata = metadata;
	}
	public String getName() {
		 return name;
}
	public int getRegNo() {
		return regNo; }
	
 public Map<String, String> getMetadata(){
	 Map<String, String> tempMap = new HashMap<>();
	 for(Map.Entry<String, String> entry: this.metadata.entrySet()){
		 tempMap.put(entry.getKey(), entry.getValue());
	 }
	 return tempMap;
 }
 
 }   
