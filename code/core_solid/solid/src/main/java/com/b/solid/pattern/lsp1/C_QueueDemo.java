package com.b.solid.pattern.lsp1;
//FIFO
//Create queue using LL

import java.util.LinkedList;
import java.util.List;

//bad code, collection api: Queue 1.5 how to impl queue using LL

//class Queue extends LinkedList<String> {
//	public void enque(String data) {
//		super.addLast(data);
//	}
//	
//	public void deque() {
//		super.removeFirst();
//	}
//}

//improved code
class Queue {
	private LinkedList<String> list=new LinkedList<String>();
	public void enque(String data) {
		list.addLast(data);
	}
	
	public void deque() {
		list.removeFirst();
	}
}
public class C_QueueDemo {
	
	public static void main(String[] args) {
		Queue queue=new Queue();
		queue.enque("raj");
		queue.deque();
		
		//queue.addFirst(null);
	}

}
