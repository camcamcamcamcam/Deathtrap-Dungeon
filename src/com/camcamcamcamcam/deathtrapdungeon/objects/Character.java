package com.camcamcamcamcam.deathtrapdungeon.objects;

import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;

import com.camcamcamcamcam.deathtrapdungeon.procedures.Methods;
import com.camcamcamcamcam.deathtrapdungeon.procedures.Window;

import static com.camcamcamcamcam.deathtrapdungeon.objects.Stats.*;

public class Character extends Creature {

	public int page;

	private boolean hasEaten;

	public Inventory equipment;
	public Inventory gems;
	public Inventory knowledge;
	public Inventory potions;

	public Stats potion;

	public Character() {
		int skill = Methods.rollDice(1) + 6;
		int stamina = Methods.rollDice(2) + 12;
		int luck = Methods.rollDice(1) + 6;

		stats = new int[] {skill, stamina, luck, skill, stamina, luck, 10, 0};
		page = 0;

		hasEaten = false;
		
		equipment = new Inventory("Equipment", 100);
		equipment.mnInventory.setMnemonic(KeyEvent.VK_Q);
		gems = new Inventory("Gems", 7);
		gems.mnInventory.setMnemonic(KeyEvent.VK_W);
		knowledge = new Inventory("Knowledge", 4);
		knowledge.mnInventory.setMnemonic(KeyEvent.VK_E);
		potions = new Inventory("Potions", 2);
		potions.mnInventory.setMnemonic(KeyEvent.VK_R);
		
		equipment.add("Sword");
		equipment.add("Shield");
		equipment.add("Leather Armour");
		
		// done to make sure it refreshes
		gems.add("Test");
		gems.search("Test", true);
		knowledge.add("Test");
		knowledge.search("Test", true);
		potions.add("Test");
		potions.search("Test", true);

	}

	public void alter(String message, String title) {
		if (isAlive()) {
			JOptionPane.showMessageDialog(Window.frame, message, title, JOptionPane.INFORMATION_MESSAGE);
		} else {
			die();
		}
	}

	public void die() {
		Methods.choosePath(-1, "YOU DIED");
	}

	@Override
	public String change(Stats stat, int amount) {
		int index = stat.ordinal();
		this.stats[index] += amount;
		String temp = "";
		if (index < 3 && this.stats[index] > this.stats[index + 3]) {
			this.stats[index] = this.stats[index + 3];
			temp = "However, your " + stat + " cannot go above its Initial level, so your new "
					+ stat + " is " + this.stats[index] + ". ";
		}
		String s = Math.abs(amount) == 1 ? "" : "s";
		String updatedStat = stat + ": " + this.stats[index] + (stat == GOLD ? "" : "/" + this.stats[index + 3]);
		switch (stat) {
			case SKILL -> Window.mntmSkill.setText(updatedStat);
			case STAMINA -> Window.mntmStamina.setText(updatedStat);
			case LUCK -> Window.mntmLuck.setText(updatedStat);
			case GOLD -> Window.mntmGold.setText(updatedStat);
		}
		return "Your " + stat + " has been " + (amount > 0 ? "increased" : "decreased") + " by " + Math.abs(amount)
				+ (stat == GOLD ? " piece" : " point") + s + " to a score of " + this.stats[index] + ". " + temp;
	}

	public void drinkPotion() {

		int index = potion.ordinal();
		String temp = ".";
		if (potion == LUCK) {
			this.stats[index + 3] += 1;
			temp = ", with an extra luck point bonus.";
		}
		this.stats[index] = this.stats[index + 3];

		alter("Your " + potion + " has been restored to its Initial level of " + this.stats[index] + temp, "You drank a Potion");
		String updatedStat = potion + ": " + this.stats[index] + "/" + this.stats[index + 3];
		switch (potion) {
			case SKILL -> Window.mntmSkill.setText(updatedStat);
			case STAMINA -> Window.mntmStamina.setText(updatedStat);
			case LUCK -> Window.mntmLuck.setText(updatedStat);
		}
		Window.menuBar.remove(Window.mntmDrinkPotion);
	}

	public String removeFood(int amount) {
		int food = FOOD.ordinal();
		if (amount == 0) {
			this.stats[food] = 0;
		} else {
			this.stats[food] -= amount;
		}
		Window.mntmEatFood.setText("Eat food ( " + this.stats[food] + " left)");
		return "";
	}

	public void eat() {
		int food = FOOD.ordinal();
		int stamina = STAMINA.ordinal();
		int staminaInitial = STAMINA_INITIAL.ordinal();
		if (this.stats[food] <= 0) {
			JOptionPane.showMessageDialog(Window.frame, "You may have eaten them all or you lost them somewhere.",
					"You have no provisions left", JOptionPane.ERROR_MESSAGE);
		} else if (hasEaten) {
			JOptionPane.showMessageDialog(Window.frame, "You can only eat once per turn", "You are full",
					JOptionPane.ERROR_MESSAGE);
		} else if (this.stats[stamina] == this.stats[staminaInitial]) {
			JOptionPane.showMessageDialog(Window.frame,
					"There's no point eating now - you won't gain any stamina points.", "You are at maximum stamina",
					JOptionPane.ERROR_MESSAGE);
		} else {
			this.stats[food]--;
			hasEaten = true;
			JOptionPane.showMessageDialog(Window.frame,	change(STAMINA, 4),
					"You ate some provisions", JOptionPane.PLAIN_MESSAGE);

			Window.mntmStamina.setText("Stamina: " + this.stats[stamina] + "/" + this.stats[staminaInitial]);
			Window.mntmEatFood.setText("Eat food ( " + this.stats[food] + " left)");
		}
	}

	public void hungry() {
		hasEaten = false;
	}

}
