package com.oops.ex0;
/*
 * in interface we can not hv instance variable only have static variable
 * ie no need of ctr
 * 
 * abs class is very similer to nornal class , inst, static , method ..but u can not create object directly
 */
interface Foo{
	void foo();
	default void foo2() {
		System.out.println("some default imp");
	}
	static void fooStatic() {
		System.out.println("some static method ");
	}
}
class FooImpl implements Foo{

	@Override
	public void foo() {
		System.out.println("foo method is overrden");
	}
	
}

public class DemoInterfaceInJava8 {
	
	public static void main(String[] args) {
		Foo f=new FooImpl();
		f.foo2();
	}

}
