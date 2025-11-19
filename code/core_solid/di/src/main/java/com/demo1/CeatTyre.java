package com.demo1;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("qa")
public class CeatTyre implements Tyre{

	public void rotate() {
		System.out.println("ceat tyre is rotating");
	}
}
