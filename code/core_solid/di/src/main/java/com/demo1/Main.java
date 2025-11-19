package com.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		//it can be called manual DI vs automized 
		//? spring framework IOC container DI: 
		//annotation processing and java reflection(what metadata of classes)
		//byte code manipulation (can create a new code on the fly)-cglib aop
//		
//		Tyre tyre=new MrfTyre();
//		Car car=new Car(tyre);
//		car.move();
		
		ApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);
		Car car=(Car) ctx.getBean("car");
		Car car2=(Car) ctx.getBean("car");
		
		car.move();
		System.out.println(car.hashCode());
		System.out.println(car2.hashCode());
		
	}
}
