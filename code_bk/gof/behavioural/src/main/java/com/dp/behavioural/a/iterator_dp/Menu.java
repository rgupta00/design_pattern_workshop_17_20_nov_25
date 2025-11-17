package com.dp.behavioural.a.iterator_dp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu{

	private List<Item> items = null;

	public Menu() {
		items = new ArrayList<>();
	}

	public void addItem(Item item) {
		items.add(item);
	}

}
