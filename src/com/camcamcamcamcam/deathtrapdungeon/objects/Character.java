package com.camcamcamcamcam.deathtrapdungeon.objects;

import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;

import com.camcamcamcamcam.deathtrapdungeon.procedures.Methods;
import com.camcamcamcamcam.deathtrapdungeon.procedures.Window;

public class Character extends Creature {

	private int skillInitial;
	private int staminaInitial;
	private int luck;
	private int luckInitial;

	private int food;
	private int gold;

	private int page;
	private boolean hasEaten;

	public Inventory equipment;
	public Inventory gems;
	public Inventory knowledge;
	public Inventory potions;

	public States states;

	public Character() {
		skill = Methods.rollDice(1) + 6;
		skillInitial = skill;
		stamina = Methods.rollDice(2) + 12;
		staminaInitial = stamina;
		luck = Methods.rollDice(1) + 6;
		luckInitial = luck;
		
		food = 10;
		gold = 0;
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
		
		states = new States();
	}

	public void alter(String message, String title) {
		if (isAlive()) {
			JOptionPane.showMessageDialog(Window.frame, message);
		} else {
			die(message);
		}
	}

	public void die(String message) {
		Methods.choosePath(-1, "YOU DIED");
	}

	public void die() {
		die(Window.textArea.getText());
	}

	public int getSkill() {
		return skill;
	}

	public String changeSkill(int amount) {
		skill = skill + amount;
		String temp = "";
		if (skill > skillInitial) {
			skill = skillInitial;
			temp = "However, your skill level cannot go above its Initial level, so your new skill is " + skillInitial
					+ ". ";
		}
		String s = "";
		if (amount != -1 || amount != 1) {
			s = "s";
		}
		Window.mntmSkill.setText("Skill: " + skill + "/" + skillInitial);
		if (amount < 0) {
			return "Your skill has been decreased by " + -amount + " point" + s + " to a score of " + skill + ". ";
		} else {
			if (skill > skillInitial) {
				skill = skillInitial;
			}
			return "Your skill has been increased by " + amount + " point" + s + " to a score of " + skill + ". "
					+ temp;
		}
	}

	public int getSkillInitial() {
		return skillInitial;
	}

	public int getStamina() {
		return stamina;
	}

	public String changeStamina(int amount) {
		stamina = stamina + amount;
		String temp = "";
		if (stamina > staminaInitial) {
			stamina = staminaInitial;
			temp = "However, your stamina level cannot go above its Initial level, so your new stamina is " + stamina
					+ ". ";
		}
		String s = "";
		if (amount != -1 || amount != 1) {
			s = "s";
		}
		Window.mntmStamina.setText("Stamina: " + stamina + "/" + staminaInitial);
		if (amount < 0) {
			return "Your stamina has been decreased by " + -amount + " point" + s + " to a score of " + stamina + ". ";
		} else {
			return "Your stamina has been increased by " + amount + " point" + s + " to a score of " + stamina + ". "
					+ temp;
		}
	}

	public int getStaminaInitial() {
		return staminaInitial;
	}

	public int getLuck() {
		return luck;
	}

	public String changeLuck(int amount) {
		luck = luck + amount;
		String temp = "";
		if (luck > luckInitial) {
			luck = luckInitial;
			temp = "However, your luck level cannot go above its Initial level, so your new luck is " + luck + ". ";
		}
		String s = "";
		if (amount != -1 || amount != 1) {
			s = "s";
		}
		Window.mntmLuck.setText("Luck: " + luck + "/" + luckInitial);
		if (amount < 0) {
			return "Your luck has been decreased by " + -amount + " point" + s + " to a score of " + luck + ". ";
		} else {
			return "Your luck has been increased by " + amount + " point" + s + " to a score of " + luck + ". " + temp;
		}
	}

	public int getLuckInitial() {
		return luckInitial;
	}

	public void drinkPotion() {
		if (equipment.search("Potion of Skill", true) != -1) {
			skill = skillInitial;
			alter("Your skill has been restored to its Initial level of " + skillInitial + ".", "You drank a Potion");
			Window.mntmSkill.setText("Skill: " + skill + "/" + skillInitial);
		} else if (equipment.search("Potion of Strength", true) != -1) {
			stamina = staminaInitial;
			alter("Your stamina has been restored to its Initial level of " + staminaInitial + ".",
					"You drank a Potion");
			Window.mntmStamina.setText("Stamina: " + stamina + "/" + staminaInitial);
		} else if (equipment.search("Potion of Fortune", true) != -1) {
			luckInitial++;
			luck = luckInitial;
			alter("Your luck has been restored to its Initial level of " + luckInitial
					+ ", with an extra luck point bonus.", "You drank a Potion");
			Window.mntmLuck.setText("Luck: " + luck + "/" + luckInitial);

		}
		
	}

	public int getFood() {
		return food;
	}

	public String removeFood(int amount) {
		if (amount == 0) {
			food = 0;
		} else {
			food -= amount;
		}
		Window.mntmEatFood.setText("Eat food ( " + food + " left)");
		return "";
	}

	public void eat() {
		if (food <= 0) {
			JOptionPane.showMessageDialog(Window.frame, "You may have eaten them all or you lost them somewhere.",
					"You have no provisions left", JOptionPane.ERROR_MESSAGE);
		} else if (hasEaten) {
			JOptionPane.showMessageDialog(Window.frame, "You can only eat once per turn", "You are full",
					JOptionPane.ERROR_MESSAGE);
		} else if (stamina == staminaInitial) {
			JOptionPane.showMessageDialog(Window.frame,
					"There's no point eating now - you won't gain any stamina points.", "You are at maximum stamina",
					JOptionPane.ERROR_MESSAGE);
		} else {
			stamina = stamina + 4;
			food--;
			hasEaten = true;
			String temp = "";
			if (stamina > staminaInitial) {
				temp = "However, your stamina level cannot go above its Initial level, so your new stamina is "
						+ staminaInitial + ". ";
			}
			JOptionPane
					.showMessageDialog(Window.frame,
							"Your stamina has been increased by 4 to " + stamina + ". You have " + food
									+ " provisions left. " + temp,
							"You ate some provisions", JOptionPane.PLAIN_MESSAGE);
			if (stamina > staminaInitial) {
				stamina = staminaInitial;
			}
			Window.mntmStamina.setText("Stamina: " + stamina + "/" + staminaInitial);
			Window.mntmEatFood.setText("Eat food ( " + food + " left)");
		}
	}

	public void hungry() {
		hasEaten = false;
	}

	public int getGold() {
		return gold;
	}

	public String changeGold(int amount) {
		gold = gold + amount;
		String s = "";
		if (amount != -1 || amount != 1) {
			s = "s";
		}
		Window.mntmGold.setText("Gold: " + gold);
		if (amount < 0) {
			return "You lost " + -amount + " piece" + s + " of gold. You now have " + gold + " gold left. ";
		} else {
			return "You gained " + amount + " piece" + s + " of gold. You now have " + gold + " gold. ";
		}
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

}
