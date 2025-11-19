package com.dp.creational.d2.abs_factory;

//Product A: Transport
interface Transport {
	void deliver();
}

//Product B: Packaging
interface Packaging {
	void pack();
}

//Road Products
class Truck implements Transport {
	public void deliver() {
		System.out.println("Delivering by truck.");
	}
}

class CardboardBox implements Packaging {
	public void pack() {
		System.out.println("Packing with cardboard box.");
	}
}

//Sea Products
class Ship implements Transport {
	public void deliver() {
		System.out.println("Delivering by ship.");
	}
}

class ContainerBox implements Packaging {
	public void pack() {
		System.out.println("Packing with container box.");
	}
}

interface LogisticsFactory {
	Transport createTransport();

	Packaging createPackaging();
}

class RoadLogisticsFactory implements LogisticsFactory {
	@Override
	public Transport createTransport() {
		return new Truck();
	}

	@Override
	public Packaging createPackaging() {
		return new CardboardBox();
	}
}

class SeaLogisticsFactory implements LogisticsFactory {
	@Override
	public Transport createTransport() {
		return new Ship();
	}

	@Override
	public Packaging createPackaging() {
		return new ContainerBox();
	}
}

class AbsFactory {
	private Transport transport;
	private Packaging packaging;

	public AbsFactory(LogisticsFactory factory) {
		this.transport = factory.createTransport();
		this.packaging = factory.createPackaging();
	}

	public void planShipment() {
		packaging.pack();
		transport.deliver();
	}
}

public class DemoAbsFactory {
	public static void main(String[] args) {

		AbsFactory absFactory=new AbsFactory(new SeaLogisticsFactory());
		absFactory.planShipment();
	}

}
