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

	private String[] inventory;

	public Character() {
		Random random = new Random();
		setSkill(random.nextInt(6) + 7);
		setSkillInitial(getSkill());
		setStamina(random.nextInt(6) + random.nextInt(6) + 14);
		setStaminaInitial(getStamina());
		setLuck(random.nextInt(6) + 7);
		setLuckInitial(getLuck());
		setFood(10);
		setGold(0);
		inventory = new String[100];
		inventory[0] = "Sword";
		inventory[1] = "Shield";
		inventory[2] = "Leather Armour";
		String[] possibleValues = { "Potion of Skill", "Potion of Strength", "Potion of Fortune" };
		inventory[3] = (String) JOptionPane.showInputDialog(null,
				"Down in the dark, twisting labyrinth of Fang, unknown horrors await\n"
						+ "you.  Devised by the devilish mind of Barron Sukumvit,  the\n"
						+ "labyrinth is riddled with fiendish traps and bloodthirsty monsters,\n"
						+ "which will test your skills almost beyond the level of endurance.\n"
						+ "Countless adventurers before you have taken up the challenge  of\n"
						+ "the Trial of Champions and walked through the carved mouth  of the\n"
						+ "labyrinth, never to be seen again. Do YOU dare enter?\n\n"
						+ "There is only one true way through Deathtrap\n"
						+ "Dungeon and it will probably take you several attempts to find it. Make\n"
						+ "notes and draw a map as you explore - this map will be useful in future\n"
						+ "adventures and help you to identify unexplored sections of the dungeon.\n"
						+ "Not all areas contain treasure - many merely contain traps and creatures\n"
						+ "which you will no doubt fall foul of. There are many ‘wild-goose-chase’\n"
						+ "passages and while you may indeed progress through to your ultimate\n"
						+ "destination, it is by no means certain that you will find what you are\n"
						+ "searching for. The ‘one true way’ involves a minimum of risk and any\n"
						+ "player, no matter how weak on initial dice rolls, should be able to get\n"
						+ "through fairly easily. May the luck of the gods go with you on the\n"
						+ "adventure ahead! \n\n" + "Your skill is " + getSkill() + ". Your stamina is " + getStamina()
						+ ". Your luck is " + getLuck() + ". \n"
						+ "You start the game with a sword, leather armour and a shield, "
						+ "\n a backpack containing Provisions for the trip, " + "\n and a lantern to light your way. "
						+ "\n But you will find lots more items as the adventure unfolds. "
						+ "\n You may also take a magical potion which will aid you on your quest. "
						+ "\n Each potion can only be used twice throughout an adventure. "
						+ "\n Each potion, when drunk, restores a chosen score (i.e. Skill, Stamina, Luck) to its Initial level. "
						+ "\n The Luck potion will also add one point to your Initial level."
						+ "\n Which potion would you like?",
				"Welcome to Deathtrap Dungeon", JOptionPane.INFORMATION_MESSAGE, null, possibleValues,
				possibleValues[0]);
		inventory[4] = inventory[3];
	}

	public int getSkill() {
		return skill;
	}

	public void setSkill(int skill) {
		this.skill = skill;
	}

	public int getSkillInitial() {
		return skillInitial;
	}

	public void setSkillInitial(int skillInitial) {
		this.skillInitial = skillInitial;
	}

	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

	public int getStaminaInitial() {
		return staminaInitial;
	}

	public void setStaminaInitial(int staminaInitial) {
		this.staminaInitial = staminaInitial;
	}

	public int getLuck() {
		return luck;
	}

	public void setLuck(int luck) {
		this.luck = luck;
	}

	public int getLuckInitial() {
		return luckInitial;
	}

	public void setLuckInitial(int luckInitial) {
		this.luckInitial = luckInitial;
	}

	public int getFood() {
		return food;
	}

	public void setFood(int food) {
		this.food = food;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

}
