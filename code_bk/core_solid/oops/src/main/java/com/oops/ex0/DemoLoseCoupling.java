package com.oops.ex0;

//A passanger named raj is using metro to travel from BTM to Banargatta



class Metro{
	public void move(String s, String d) {
		System.out.println("passanger is moving from "+ s + " to "+ d +" using metro");
	}
}

//OCP*
class Passanger {
	private String name;

	public Passanger(String name) {
		this.name = name;
	}
	
	public void travel() {
		
	}
	
}
public class DemoLoseCoupling {

	public static void main(String[] args) {
		
		
	}
}
