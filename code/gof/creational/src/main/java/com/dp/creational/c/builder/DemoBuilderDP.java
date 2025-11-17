package com.dp.creational.c.builder;

public class DemoBuilderDP {
	
	public static void main(String[] args) {
		// compiler optimizes it using StringBuilder internally
		//StringBuilder
		String info="java";
		String a=info+ "foo"+"bar"+"jar"+"car";
		
		
		
		//how to reverse a string 
//		String hello="i love java";

		
		//fluent api design : mockito, mock testing
		//java 8 
		
//		 String s = "";
//
//	        // BAD CODE — every iteration creates a new String object
//	        for (int i = 0; i < 1000; i++) {
//	            s = s + i;
//	        }
//
//	        System.out.println(s);
		
		
//		StringBuilder sb = new StringBuilder();
//
//        // GOOD CODE — no extra String objects, very fast
//        for (int i = 0; i < 1000; i++) {
//            sb.append(i);
//        }
//
//        String result = sb.toString();
//        System.out.println(result);
		
	}

}
