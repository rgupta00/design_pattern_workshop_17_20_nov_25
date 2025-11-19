package com.dp.creational.c.builder;

public class BuilderDemoNeed {

	public static void main(String[] args) {
		//what parameter stand for what?
//		Food1 food=new Food1();
//		food.setName("cold drink");
//		food.setUnit(400);
//		food.setVitB12(0);
//		food.setVitB5(300);
//		
//		
//		
//		System.out.println(food);
		
		Food food=new Food.Builder("PG B", 70).vitA(30).vitB12(300).build();
		
	}
}
