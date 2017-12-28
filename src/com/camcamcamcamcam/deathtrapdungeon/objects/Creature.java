package com.camcamcamcamcam.deathtrapdungeon.objects;

public class Creature {
	private String name;
	private int skill;
	private int stamina;

	public Creature(String name, int skill, int stamina) {
		this.name = name;
		this.skill = skill;
		this.stamina = stamina;
	}

	public int getStamina() {
		return stamina;
	}

	public void changeStamina(int amount) {
		stamina = stamina + amount;
	}

	public int getSkill() {
		return skill;
	}

	public String getName() {
		return name;
	}
}
