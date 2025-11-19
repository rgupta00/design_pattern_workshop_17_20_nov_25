package com.dp.structural.a1.adaptor.ex2;
import java.util.*;

class RoundPeg {
	public void insertTohole(String str) {
		System.out.println("roundpeg insertTohole(): " + str);
	}
}

class SquarePeg {
	public void insert(String str) {
		System.out.println("SquarePeg insert(): " + str);
	}
	public void insertV2(String str) {
		System.out.println("SquarePeg insert(): V2 " + str);
	}
	
}
//making round peg adaptable to square peg
class PegAdaptor extends SquarePeg {
	private RoundPeg peg;
	public PegAdaptor(RoundPeg peg) {
		this.peg = peg;
	}
	
	@Override
	public void insert(String str) {
		peg.insertTohole(str);
	}
}

public class Demo {

	public static void main(String[] args) {

		String data[]= {"java","is","cool"};
		List<String> list=Arrays.asList(data);
		

		RoundPeg peg = new RoundPeg();
		
		PegAdaptor adaptor=new PegAdaptor(peg);
		
		useSquarePeg(adaptor);
	}
	
	public static void useSquarePeg(SquarePeg peg) {
		//do some operation
		peg.insert("some random shape");
	}
}
