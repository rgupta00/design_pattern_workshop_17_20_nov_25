package com.dp.creational.a.singleton;

import java.io.Serializable;

/*
 	" one object per application" ex logging , db connection etc

	=> lazy vs eager
	=> threading issue, double locking
	=> What if clonned
	=> What if deserilized?
	=> What if used java reflection?
	=> what if 2 class loader load that class twice
	=> best practices, effective java
	=> using enum
 */
final public class Singleton implements Cloneable, Serializable {

	
	private volatile static Singleton singleton;

	private Singleton() {
		if(singleton!=null) {
			throw new IllegalStateException();
		}
	}

	private Object readResolve() {
		return getSingleton();
	}
	public static Singleton getSingleton() {
		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null)
					singleton = new Singleton();
			}
		}
		return singleton;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return singleton;
	}

	
}

//int i=5;
//long i=5;read in two step
