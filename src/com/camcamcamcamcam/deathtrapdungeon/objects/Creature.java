package com.camcamcamcamcam.deathtrapdungeon.objects;

public class Creature {
	private String name;
	protected int skill;
	protected int stamina;

	public Creature(String name, int skill, int stamina) {
		this.name = name;
		this.skill = skill;
		this.stamina = stamina;
	}
	
	public Creature() {
		
	}

	public int getStamina() {
		return stamina;
	}
	
	public boolean isAlive() {
		return stamina > 0;
	}

	public String changeStamina(int amount) {
		stamina = stamina + amount;
		return null;
	}

	public int getSkill() {
		return skill;
	}

	public String getName() {
		return name;
	}
}
