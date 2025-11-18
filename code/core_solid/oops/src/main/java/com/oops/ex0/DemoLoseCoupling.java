package com.oops.ex0;
//OOAD
//OO: interaction bw the objects: miser
	//IS A: inheritance
	//HAS A: COMPOSTION AND AGGigration
	//USE A: 

//A passanger named raj is using metro to travel from BTM to Banargatta
interface Vehicle{
	public void move(String s, String d);
}
class Metro implements Vehicle{
	public void move(String s, String d) {
		System.out.println("passanger is moving from "+ s + " to "+ d +" using metro");
	}
}

class Car  implements Vehicle{
	public void move(String s, String d) {
		System.out.println("passanger is moving from "+ s + " to "+ d +" using car");
	}
}
class Bike  implements Vehicle{
	public void move(String s, String d) {
		System.out.println("passanger is moving from "+ s + " to "+ d +" using Bike");
	}
}

//OCP*
class Passanger {
	private String name;

	public Passanger(String name) {
		this.name = name;
	}
	
	public void travel(Vehicle vehicle,String s, String d) {
		System.out.println("name of passanger : "+ name);
		vehicle.move(s, d);
	}
}
public class DemoLoseCoupling {
	public static void main(String[] args) {
		Vehicle vehicle=new Bike();
		Passanger passanger=new Passanger("ekta");
		passanger.travel(vehicle, "BTM", "Banargatta");
		
	}
}
