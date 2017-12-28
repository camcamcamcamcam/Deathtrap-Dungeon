package com.camcamcamcamcam.deathtrapdungeon.objects;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import com.camcamcamcamcam.deathtrapdungeon.procedures.Window;

public class Inventory {
	
	// TODO Check all algorithms to see if all items are searched for correctly
	
	public JMenu mnInventory;
	public JMenuItem mntmInventory[];
	
	private String[] items;
	private int numberOfItems;
	
	public Inventory(String name, int capacity) {
		mnInventory = new JMenu(name);
		Window.menuBar.add(mnInventory);
		mntmInventory = new JMenuItem[capacity];
		items = new String[capacity];
		for (int i = 0; i < capacity; i++) {
			mntmInventory[i] = new JMenuItem();
			mnInventory.add(mntmInventory[i]);
		}
	}
	
	public int getNumberOfItems() {
		return numberOfItems;
	}
	
	public int search(String equipment, boolean remove) {
		int position = -1;
		int count = 0;
		for (int i = 0; i < numberOfItems; i++) {
			if (items[i].equals(equipment)) {
				position = i;
				count++;
			}

		}
		if (remove && (position != -1)) {
			for (int j = position; j < numberOfItems - 1; j++) {
				items[j] = items[j + 1];

			}
			items[numberOfItems - 1] = "";
			refresh(-1);
			count--;
		}
		if (equipment.startsWith("Potion") && count > 0) {
			Window.mntmDrinkPotion.setText("Drink a " + equipment + ": " + count + " left.");
			Window.menuBar.add(Window.mntmDrinkPotion);
		} else if (equipment.startsWith("Potion") && count <= 0) {
			Window.menuBar.remove(Window.mntmDrinkPotion);
		}
		return position;
	}

	public void add(String equipment) {
		items[numberOfItems] = equipment;
		refresh(1);
	}
	
	public void refresh(int number) {
		numberOfItems = numberOfItems + number;
		mnInventory.removeAll();
		for (int i = 0; i < numberOfItems; i++) {
			mntmInventory[i].setText(items[i]);
			mnInventory.add(mntmInventory[i]);
		}
	}
	
	public void clearAll() {
		while (numberOfItems > 0) {
			items[numberOfItems] = "";
		}
		items[0] = "";
	}
}
