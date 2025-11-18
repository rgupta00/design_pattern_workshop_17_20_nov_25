package com.oops.ex3;
//Kid is jump like a monkey
interface Jumpable{
	public void jump();
}
class Monkey implements Jumpable{
	void stayOnTree() {
		System.out.println("stay on tree");
	}

	void biteAnyBody() {
		System.out.println("biteAnyBody");
	}

	@Override
	public void jump() {
		System.out.println("jump monkey jump...");
	}
}
//LSP?
class Kid implements Jumpable{
	void goingToSchool() {
		System.out.println("goingToSchool");
	}

	void play() {
		System.out.println("play");
	}
	
	void biteAnyBody() {
		throw new RuntimeException();
	}

	@Override
	public void jump() {
		System.out.println("better then monkey u see");
	}
}

public class DemoWhenWhat {

	public static void main(String[] args) {
		Kid k=new Kid();
		k.biteAnyBody();
	}
}
