package com.camcamcamcamcam.deathtrapdungeon.objects;
import com.camcamcamcamcam.deathtrapdungeon.procedures.Window;

public class Inventory {
	
	// TODO Check all algorithms to see if all items are searched for correctly
	
	private String[] items;
	private int numberOfItems;
	public Inventory(int capacity) {
		items = new String[capacity];
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
			Window.mnCharacter.add(Window.mntmDrinkPotion);
		} else if (equipment.startsWith("Potion") && count <= 0) {
			Window.mnCharacter.remove(Window.mntmDrinkPotion);
		}
		return position;
	}

	public void add(String equipment) {
		items[numberOfItems] = equipment;
		refresh(1);
	}
	
	public void refresh(int number) {
		numberOfItems = numberOfItems + number;
		Window.mnInventory.removeAll();
		Window.mnGems.removeAll(); // TODO Add gems window too
		for (int i = 0; i < numberOfItems; i++) {
			Window.mntmEquipment[i].setText(items[i]);
			Window.mnInventory.add(Window.mntmEquipment[i]);
		}
	}
	
	public void clearAll() {
		while (numberOfItems > 0) {
			items[numberOfItems] = "";
		}
		items[0] = "";
	}
}
