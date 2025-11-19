package com.dp.creational.a.singleton;
enum MySigleton{
	INSTANCE;
}
public class DemoEnumSingleton {

	public static void main(String[] args) {
		MySigleton mySigleton1=MySigleton.INSTANCE;
		MySigleton mySigleton2=MySigleton.INSTANCE;
		System.out.println(mySigleton1.hashCode());
		System.out.println(mySigleton2.hashCode());
		
	}
}
