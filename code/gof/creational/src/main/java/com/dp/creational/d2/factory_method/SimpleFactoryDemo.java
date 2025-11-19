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

//factory method ?
/*
 * Defind an interface(abstraction) for creating an object, but let subclass
 * decide which object to instantiate, Factory method let a class defer
 * instantiation to subclass using inheritance
 */
abstract class LogisticAbstraction {
	public void delivery() {
		Transport transport = createTransport();
		transport.deliver();
	}

	public abstract Transport createTransport();
}
class RoadLogistic extends LogisticAbstraction{
	@Override
	public Transport createTransport() {
		return new Truck();
	}
}
class SeaLogistic extends LogisticAbstraction{
	@Override
	public Transport createTransport() {
		return new Ship();
	}
}
// Simple Factory
//class TransportFactory {
//	public static Transport createTransport(String type) {
//		if (type.equalsIgnoreCase("truck")) {
//			return new Truck();
//		} else if (type.equalsIgnoreCase("ship")) {
//			return new Ship();
//		}
//		throw new IllegalArgumentException("Unknown transport type");
//	}
//}

public class SimpleFactoryDemo {
	public static void main(String[] args) {
		LogisticAbstraction logistic= new SeaLogistic();
		logistic.createTransport().deliver();;
	}
}
