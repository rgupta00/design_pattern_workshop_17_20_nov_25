package com.demo;

import org.springframework.stereotype.Service;

//Cross cutting concern
@Service
 public class Magician {
	public String doMagic() {	
		System.out.println("abara ka dabra...");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "rabbit from the hat";
	}
}
