package com.camcamcamcamcam.deathtrapdungeon.procedures;

import java.util.Random;

import javax.swing.JOptionPane;

import com.camcamcamcamcam.deathtrapdungeon.objects.Creature;

public class Methods {

	public static void listEquipment() {
		String equipmentChosen = (String) JOptionPane.showInputDialog(Window.frame, "Select item", "Equipment",
				JOptionPane.PLAIN_MESSAGE, null,
				new String[] { "1. Emerald Diamond Sapphire ", "2. Diamond Sapphire Emerald ",
						"3. Sapphire Emerald Diamond ", "4. Emerald Sapphire Diamond ", "5. Diamond Emerald Sapphire ",
						"6. Sapphire Diamond Emerald " },
				"1. Emerald Diamond Sapphire");
		Deathtrap.character.equipment.search(equipmentChosen, true);
	}

	public static void gemSlot() {
		String gemSlot = (String) JOptionPane.showInputDialog(Window.frame, "Choose your arrangement",
				"Arrange the gems", JOptionPane.PLAIN_MESSAGE, null,
				new String[] { "1. Emerald Diamond Sapphire ", "2. Diamond Sapphire Emerald ",
						"3. Sapphire Emerald Diamond ", "4. Emerald Sapphire Diamond ", "5. Diamond Emerald Sapphire ",
						"6. Sapphire Diamond Emerald " },
				"1. Emerald Diamond Sapphire");
		String message = "Click confirm to see if you entered the right combination.";
		switch (Integer.parseInt("" + gemSlot.charAt(0))) {
		case 1:
			choosePath(16, message);
			break;
		case 2:
			choosePath(392, message);
			break;
		case 3:
			choosePath(177, message);
			break;
		case 4:
			choosePath(287, message);
			break;
		case 5:
			choosePath(132, message);
			break;
		case 6:
			choosePath(249, message);
		}
	}

	public static String label(Creature[] creature) {
		String label = creature[0].getName() + ": SKILL " + creature[0].getSkill() + ", STAMINA "
				+ creature[0].getStamina();
		if (creature.length > 1) {
			for (int i = 1; i < creature.length; i++) {
				label = label + "\n" + creature[i].getName() + ": SKILL " + creature[i].getSkill() + ", STAMINA "
						+ creature[i].getStamina();
			}
		}
		return label;
	}

	public static void fight(int creatureSkill, int creatureStamina, String creatureName, int winPage, int escapePage) {
		fight(new Creature[] { new Creature(creatureName, creatureSkill, creatureStamina) }, winPage, escapePage);
	}

	public static void fight(int creatureSkill, int creatureStamina, String creatureName, int winPage) {
		fight(new Creature[] { new Creature(creatureName, creatureSkill, creatureStamina) }, winPage, -1);
	}

	public static void fight(int creatureSkill1, int creatureStamina1, String creatureName1, int creatureSkill2,
			int creatureStamina2, String creatureName2, int winPage) {
		fight(new Creature[] { new Creature(creatureName1, creatureSkill1, creatureStamina1),
				new Creature(creatureName2, creatureSkill2, creatureStamina2) }, winPage, -1);
	}

	public static void fight(Creature[] creature, int winPage, int escapePage) {

		// initialising values
		boolean allDead; // whether all the creatures have been killed
		int optionChosen; // whether the player has chosen to escape or fight
		int numberOfRounds = 0; // how many rounds of fighting the player has done
		int whoIsWounded = 0; // whether the player is wounded or the creature is for that round
		int debuff = 0; // if the player is fighting the dwarf, their attack strength is reduced by 2
						// for the duration of the fight.
		if (creature[0].getName().equals("DWARF")) {
			debuff = -2;
		}

		// setting up dialogue box showing creature names and stats
		String title = "Fighting " + creature[0].getName();
		String label = label(creature);
		if (creature.length > 1) {
			for (int i = 1; i < creature.length; i++) {
				title = title + " and " + creature[i].getName();
			}
		}

		do {

			// assumes a creature is still alive and checks later
			allDead = false;

			// if you have the option to escape, it will be displayed. Special case for the
			// rock grub, where the player may escape after 2 rounds.
			if (escapePage != -1 && !(numberOfRounds < 2 && creature[0].getName().equals("ROCK GRUB"))) {
				optionChosen = JOptionPane.showOptionDialog(Window.frame, label, title,
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						new String[] { "Escape", "Fight" }, "Fight");
				if (optionChosen == 0) {
					JOptionPane.showMessageDialog(Window.frame,
							"The creature attacked you while you escaped" + Deathtrap.character.changeStamina(-2),
							"You escaped from the battle", JOptionPane.PLAIN_MESSAGE);
					choosePath(escapePage, "You escaped from the battle.");
					return;

				} else {
					optionChosen--;
				}
			} else if (whoIsWounded != 0) {
				optionChosen = JOptionPane.showOptionDialog(Window.frame, label, title, JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE, null, new String[] { "Use Luck", "Fight" }, "Fight");
			} else {
				optionChosen = 1;
				JOptionPane.showMessageDialog(Window.frame, label, title, JOptionPane.PLAIN_MESSAGE);
			}

			// creature stats are updated and round is refreshed
			label = label(creature);
			int creatureFought = -1;
			boolean hasDamaged = false;

			// fight is initiated for each creature
			for (int i = 0; i < creature.length; i++) {
				if (creature[i].getStamina() <= 0) continue;
				int[] rollDice = { Methods.rollDice(2), Methods.rollDice(2) };
				if (Deathtrap.character.getSkill() + rollDice[0] - debuff > creature[i].getSkill() + rollDice[1]) {

					// if you win rounds against more than one creature, you only inflict damage on
					// the first.
					if (!hasDamaged) {
						creature[i].changeStamina(-2);
						hasDamaged = true;
						label = "You successfully wounded the " + creature[i].getName() + "!\n" + label(creature);
						whoIsWounded = 1;
						creatureFought = i;

						// if all creatures are dead, you win.
						boolean temp = true;
						for (int j = 0; j < creature.length; j++) {
							System.out.println(creature[j].getStamina());
							temp = temp && creature[j].getStamina() <= 0;
						}
						allDead = temp;

					} else {
						label = "You defended yourself against the " + creature[i].getName() + "'s blow.\n" + label(creature);
					}

					// cases for if you are wounded or if you both miss
				} else if (Deathtrap.character.getSkill() + rollDice[0] - debuff < creature[i].getSkill()
						+ rollDice[1]) {
					Deathtrap.character.changeStamina(-2);
					label = "The " + creature[i].getName() + " wounded you!\n" + label;
					whoIsWounded = -1;
				} else {
					label = "Both of you missed.\n" + label;
					whoIsWounded = 0;
				}
			}

			if (optionChosen == 0) {
				String message = "";
				boolean lucky = Deathtrap.character.getLuck() < rollDice(2);
				if (lucky && whoIsWounded == 1) {
					creature[creatureFought].changeStamina(-2);
					message = "You were lucky! The " + creature[creatureFought].getName()
							+ " loses 2 extra stamina points.";
					boolean temp = true;
					for (int j = 0; j < creature.length; j++) {
						temp = temp && creature[j].getStamina() <= 0;
					}
					allDead = temp;
				}
				if (lucky && whoIsWounded == -1) {
					Deathtrap.character.changeStamina(1);
					message = "You were lucky! You only lose 1 stamina point.";
				}
				if (!lucky && whoIsWounded == 1) {
					creature[creatureFought].changeStamina(-2);
					message = "You were unlucky. The " + creature[creatureFought].getName()
							+ " only lost 1 stamina point.";
				}
				if (!lucky && whoIsWounded == -1) {
					Deathtrap.character.changeStamina(-1);
					message = "You were unlucky! You lose 1 extra stamina point.";
				}
				Deathtrap.character.changeLuck(-1);
				JOptionPane.showMessageDialog(Window.frame, message + "\nYou lost 1 luck point due to using your luck",
						"You used luck on the wound", JOptionPane.PLAIN_MESSAGE);
			}
			numberOfRounds++;
			System.out.println(Deathtrap.character.getStamina() + ", " + allDead);
		} while (Deathtrap.character.getStamina() > 0 && !allDead);
		choosePath(winPage, "You won.");
	}

	public static int[] pages;

	public static void choosePath(int page1, String option1) {
		choosePath(new int[] { page1 }, new String[] { option1 });
	}

	public static void choosePath(int page1, int page2, String option1, String option2) {
		choosePath(new int[] { page1, page2 }, new String[] { option1, option2 });
	}

	public static void choosePath(int page1, int page2, int page3, String option1, String option2, String option3) {
		choosePath(new int[] { page1, page2, page3 }, new String[] { option1, option2, option3 });
	}

	public static void choosePath(int page1, int page2, int page3, int page4, String option1, String option2,
			String option3, String option4) {
		choosePath(new int[] { page1, page2, page3, page4 }, new String[] { option1, option2, option3, option4 });
	}

	public static void choosePath(int[] pages, String[] options) {
		Methods.pages = pages;
		for (int i = 0; i < 4; i++) {
			Window.frame.getContentPane().add(Window.choices[i], Window.gbc_choices[i]);
			Window.frame.getContentPane().remove(Window.choices[i]);
		}
		for (int i = 0; i < options.length; i++) {
			Window.frame.getContentPane().add(Window.choices[i], Window.gbc_choices[i]);
		}
		for (int i = 0; i < options.length; i++) {
			Window.choices[i].setText(options[i]);
		}
	}

	public static int testSkill(int skillful, int unskillful) {
		int page;
		if (Deathtrap.character.getLuck() < rollDice(2)) {
			choosePath(unskillful, "You were not skilled enough. Click confirm to find out the consequences.");
			page = unskillful;
		} else {
			choosePath(skillful, "Your skill was enough. Click confirm to continue.");
			page = skillful;
		}
		return page;
	}

	public static int testLuck(int lucky, int unlucky) {
		int page;
		if (Deathtrap.character.getLuck() < rollDice(2)) {
			choosePath(unlucky, "You were unlucky. Click confirm to find out the consequences.");
			page = unlucky;
		} else {
			choosePath(lucky, "You were lucky. Click confirm to continue.");
			page = lucky;
		}
		Deathtrap.character.alter(Deathtrap.character.changeLuck(-1), "You tested your luck");
		return page;
	}

	public static int rollDice(int quantity) {
		int result = 0;
		Random random = new Random();
		for (int i = 0; i < quantity; i++) {
			result = result + random.nextInt(6) + 1;
		}
		return result;
	}
}
