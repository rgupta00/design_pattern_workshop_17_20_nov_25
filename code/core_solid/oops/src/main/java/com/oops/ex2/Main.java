package com.oops.ex2;
import java.util.*;
/*
 * design principle of seprating interface(agent) from implementation 
	so that client only concern with interface
 */
public class Main {

	//raj
	public static void main(String[] args) {
		Stack stack=new StackOpLinkedListImpl(10);
		stack.push(22);
		stack.push(21);
		
		System.out.println(stack.pop());
		
		System.out.println(stack.pop());
		
	}
}
