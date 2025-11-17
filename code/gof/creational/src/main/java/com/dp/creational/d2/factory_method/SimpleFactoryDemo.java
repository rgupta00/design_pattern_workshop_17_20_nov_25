package com.dp.creational.d2.factory_method;

interface Transport {
	void deliver();
}

// Concrete Products
class Truck implements Transport {
	public void deliver() {
		System.out.println("Deliver by land in a box");
	}
}

class Ship implements Transport {
	public void deliver() {
		System.out.println("Deliver by sea in a container");
	}
}

// Simple Factory
class TransportFactory {
	public static Transport createTransport(String type) {
		if (type.equalsIgnoreCase("truck")) {
			return new Truck();
		} else if (type.equalsIgnoreCase("ship")) {
			return new Ship();
		}
		throw new IllegalArgumentException("Unknown transport type");
	}
}

public class SimpleFactoryDemo {
	public static void main(String[] args) {

	}
}
