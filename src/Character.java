import java.util.Random;

import javax.swing.JOptionPane;

public class Character {

	private int skill;
	private int skillInitial;
	private int stamina;
	private int staminaInitial;
	private int luck;
	private int luckInitial;

	private int food;
	private int gold;

	private int page;
	private boolean hasEaten;

	private String[] inventory;
	private int items;

	public Character() {
		Random random = new Random();
		skill = random.nextInt(6) + 7;
		skillInitial = skill;
		stamina = random.nextInt(6) + random.nextInt(6) + 14;
		staminaInitial = stamina;
		luck = random.nextInt(6) + 7;
		luckInitial = luck;
		food = 10;
		gold = 0;
		page = 0;
		hasEaten = false;
		inventory = new String[100];
		addToInventory("Sword");
		addToInventory("Shield");
		addToInventory("Leather Armour");
	}

	public void alter(String message, String title) {
		if (stamina > 0) {
			JOptionPane.showMessageDialog(Window.frame, message);
		} else {
			die(message);
		}
		Window.lblSkill.setText("Skill: " + Window.character.getSkill() + "/" + Window.character.getSkillInitial());
		Window.lblStamina
				.setText("Stamina: " + Window.character.getStamina() + "/" + Window.character.getStaminaInitial());
		Window.lblLuck.setText("Luck: " + Window.character.getLuck() + "/" + Window.character.getLuckInitial());
	}

	public void die(String message) {
		JOptionPane.showMessageDialog(Window.frame, message, "You died", JOptionPane.ERROR_MESSAGE);
		System.exit(0);
	}

	public int getSkill() {
		return skill;
	}

	public String changeSkill(int amount) {
		skill = skill + amount;
		String temp = "";
		if (skill > skillInitial) {
			temp = "However, your skill level cannot go above its Initial level, so your new skill is " + skillInitial
					+ ". ";
		}
		String s = "";
		if (amount == -1 || amount == 1) {
			s = "s";
		}
		if (amount < 0) {
			return "Your skill has been decreased by " + -amount + "point" + s + " to a score of " + skill + ". ";
		} else {
			if (skill > skillInitial) {
				skill = skillInitial;
			}
			return "Your skill has been increased by " + amount + "point" + s + " to a score of " + skill + ". "
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
			temp = "However, your stamina level cannot go above its Initial level, so your new stamina is "
					+ stamina + ". ";
		}
		String s = "s";
		if (amount == -1 || amount == 1) {
			s = "";
		}
		if (amount < 0) {
			return "Your stamina has been decreased by " + -amount + "point" + s + " to a score of " + stamina
					+ ". ";
		} else {
			return "Your stamina has been increased by " + amount + "point" + s + " to a score of " + stamina
					+ ". " + temp;
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
			temp = "However, your luck level cannot go above its Initial level, so your new luck is " + luck
					+ ". ";
		}
		String s = "";
		if (amount == -1 || amount == 1) {
			s = "s";
		}
		if (amount < 0) {
			return "Your luck has been decreased by " + -amount + "point" + s + " to a score of " + luck + ". ";
		} else {
			return "Your luck has been increased by " + amount + "point" + s + " to a score of " + luck + ". "
					+ temp;
		}
	}

	public int getLuckInitial() {
		return luckInitial;
	}

	public void drinkPotion() {
		if (searchInventory("Potion of Skill", true) != -1) {
			skill = skillInitial;
			alter("Your skill has been restored to its Initial level of " + skillInitial + ".", "You drank a Potion");
		} else if (searchInventory("Potion of Strength", true) != -1) {
			stamina = staminaInitial;
			alter("Your stamina has been restored to its Initial level of " + staminaInitial + ".",
					"You drank a Potion");
		} else if (searchInventory("Potion of Fortune", true) != -1) {
			luckInitial++;
			luck = luckInitial;
			alter("Your luck has been restored to its Initial level of " + luckInitial
					+ ", with an extra luck point bonus.", "You drank a Potion");
		}
	}

	public int getFood() {
		return food;
	}

	public void setFood(int food) {
		this.food = food;
	}

	public void eat() {
		if (food <= 0) {
			JOptionPane.showMessageDialog(Window.frame, "You may have eaten them all or you lost them somewhere.",
					"You have no provisions left", JOptionPane.ERROR_MESSAGE);
		} else if (hasEaten) {
			JOptionPane.showMessageDialog(Window.frame, "You can only eat once per turn", "You are full",
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
			Window.lblStamina
					.setText("Stamina: " + Window.character.getStamina() + "/" + Window.character.getStaminaInitial());
			Window.mntmEatFood.setText("Eat food ( " + Window.character.getFood() + " left)");
		}
	}

	public void hungry() {
		hasEaten = false;
	}

	public int searchInventory(String equipment, boolean remove) {
		int position = -1;
		int count = 0;
		for (int i = 0; i < items; i++) {
			if (inventory[i].equals(equipment)) {
				position = i;
				count++;
			}

		}
		if (remove && (position != -1)) {
			for (int j = position; j < items - 1; j++) {
				inventory[j] = inventory[j + 1];

			}
			inventory[items - 1] = "";
			refreshList(-1);
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

	public void addToInventory(String equipment) {
		inventory[items] = equipment;
		refreshList(1);
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public void refreshList(int number) {
		items = items + number;
		Window.mnInventory.removeAll();
		for (int i = 0; i < items; i++) {
			Window.mntmItem[i].setText(inventory[i]);
			Window.mnInventory.add(Window.mntmItem[i]);
		}
	}

}
