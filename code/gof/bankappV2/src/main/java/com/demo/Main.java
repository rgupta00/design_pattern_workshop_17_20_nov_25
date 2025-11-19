package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		Magician magician2=new Magician();
		System.out.println(magician2);
		ApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);
		Magician magician=(Magician) ctx.getBean("magician");
		System.out.println(magician.getClass());
		magician.doMagic();
	}
}
