package com.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "car")
@Scope("singleton")//singleton
public class Car {

	private Tyre tyre;
	
	@Autowired
	public Car(Tyre tyre) {
		this.tyre=tyre;
	}
	
	public void move() {
		System.out.println("moving in car");
		tyre.rotate();
	}
	
	
}
