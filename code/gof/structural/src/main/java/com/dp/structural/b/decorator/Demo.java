package com.dp.structural.b.decorator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//BasicCar-> SportCar-> SuperSportCar->

interface Car {
	public String assemble();
}

class BasicCar implements Car {

	@Override
	public String assemble() {
		return "basic car";
	}

}

abstract class CarDecorator implements Car {
	private Car car;

	public CarDecorator(Car car) {
		this.car = car;
	}

	@Override
	public String assemble() {
		return car.assemble();
	}
}

class SportCar extends CarDecorator {
	public SportCar(Car car) {
		super(car);
	}
	@Override
	public String assemble() {
		return super.assemble() + " with sport feature";
	}
}

class SuperSportCar extends CarDecorator {

	public SuperSportCar(Car car) {
		super(car);
	}

	@Override
	public String assemble() {
		return super.assemble() + " with extra super sport feature";
	}
}

public class Demo {

	public static void main(String[] args) throws IOException {

		// How decorator is used in io?
//		BufferedReader br = new BufferedReader(new FileReader(new File("data.txt")));
//		String line = null;
//		while ((line = br.readLine()) != null) {
//			System.out.println(line);
//		}

		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("demo.ser")));
		
		Car car =new SuperSportCar(new SportCar(new BasicCar()));
		System.out.println(car.assemble());
	}
}
