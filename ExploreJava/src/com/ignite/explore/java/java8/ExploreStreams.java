package com.ignite.explore.java.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExploreStreams {

	public static void main(String[] args) {

		List<Item> items = Arrays.asList(new Item("soap", 40, 5), new Item("maggie", 75, 2),
				new Item("free - soup", 20, 2), new Item("cashews 500g", 400, 1), new Item("cake", 125, 1),
				new Item("free - cup cake", 20, 1));
		System.out.println(items);

		List<Item> itemsWithAmount = new ArrayList<>();
		for (Item item : items) {
			int itemAmount = item.quantity * item.price;
			item.setAmount(itemAmount);

			itemsWithAmount.add(item);
		}
		System.out.println(itemsWithAmount);

		List<Item> billableItems = new ArrayList<>();
		for (Item item : itemsWithAmount) {
			if (!item.name.contains("free")) {
				billableItems.add(item);
			}
		}
		System.out.println(billableItems);

		int payableBillAmount = 0;
		for (Item item : billableItems) {
			payableBillAmount = payableBillAmount + item.getAmount();
		}
		System.out.println("Total amount to pay : " + payableBillAmount);
		System.out.println("---------------------------------");

		List<Item> streamItems = items.stream().map(itm -> {
			itm.setAmount(itm.quantity * itm.price);
			return itm;
		}).filter((it) -> !it.name.contains("free")).toList();

		System.out.println(streamItems);
		int finalAmount = 0;
		for (Item item : streamItems) {
			finalAmount = finalAmount + item.getAmount();
		}
		System.out.println("Calculated amt : " + finalAmount);
	}

}

class Item {
	String name;
	int price;
	int quantity;

	int amount;

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", quantity=" + quantity + ", amount=" + amount + "]";
	}

	public Item(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
