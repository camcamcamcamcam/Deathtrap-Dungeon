package com.camcamcamcamcam.deathtrapdungeon.procedures;

import java.util.Random;

public class Methods {

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

	public static void testSkill(int skillful, int unskillful) {
		if (Window.character.getLuck() < rollDice(2)) {
			choosePath(unskillful, "You were not skilled enough. Click confirm to find out the consequences.");
		} else {
			choosePath(skillful, "Your skill was enough. Click confirm to continue.");
		}
	}

	public static void testLuck(int lucky, int unlucky) {
		if (Window.character.getLuck() < rollDice(2)) {
			choosePath(unlucky, "You were unlucky. Click confirm to find out the consequences.");
		} else {
			choosePath(lucky, "You were lucky. Click confirm to continue.");
		}
		Window.character.alter(Window.character.changeLuck(-1), "You tested your luck");
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
