package com.dp.creational.a.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, 
	IllegalAccessException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException, FileNotFoundException, IOException {
		
		//singleton in jdk Runtime, finding avalilable processor
		//System.out.println(Runtime.getRuntime().availableProcessors());
		
		Singleton singleton=Singleton.getSingleton();
		System.out.println(singleton.hashCode());
		
		//java serlization-de-serlization?
		ObjectOutputStream oos=new ObjectOutputStream( new FileOutputStream(new File("demo.ser")));
		oos.writeObject(singleton);
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("demo.ser")));
		Singleton singleton2=(Singleton) ois.readObject();
		System.out.println(singleton2.hashCode());
		//clonning? 
//		Singleton singleton2=(Singleton) singleton.clone();
//		System.out.println(singleton2.hashCode());
		
		//java reflection...
//		Class<?> clazz=Class.forName("com.dp.creational.a.singleton.Singleton");
//		Constructor[]constructors=clazz.getDeclaredConstructors();
//		
//		constructors[0].setAccessible(true);
//	
//	
//		Singleton singleton2=(Singleton) constructors[0].newInstance();
//		System.out.println(singleton2.hashCode());
		
		//System.out.println(singleton.hashCode());
		//System.out.println(singleton2.hashCode());
		
	}
}
