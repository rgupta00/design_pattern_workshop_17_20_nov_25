package com.demo1;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class MrfTyre implements Tyre {

	public void rotate() {
		System.out.println("mrf tyre is rotating");
	}
}
