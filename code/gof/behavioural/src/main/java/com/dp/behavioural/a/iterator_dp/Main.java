package com.dp.behavioural.a.iterator_dp;

import java.util.*;
public class Main {
	public static void main(String[] args) {

		//Iterator and Iterable
		
		Item i1 = new Item("mouse", 7.50f);
		Item i2 = new Item("laptop", 6.00f);
		Item i3 = new Item("DVD", 6.50f);

//		List<Item> itemsList=new ArrayList<>();
//		itemsList.add(i1);
//		itemsList.add(i2);
//		itemsList.add(i3);
////		
//		Iterator<Item> iterator=itemsList.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
		
		Menu menu = new Menu();
		menu.addItem(i1);
		menu.addItem(i2);
		menu.addItem(i3);

		System.out.println("Displaying Menu:");
	
		Iterator<Item> it=menu.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
		
//
		
		
		
		
//		System.out.println("\nRemoving last item returned");
//		iterator.remove();
//
//		System.out.println("\nDisplaying Menu:");
//		iterator = menu.iterator();
//		while (iterator.hasNext()) {
//			Item item = iterator.next();
//			System.out.println(item);
//		}

	}

}
