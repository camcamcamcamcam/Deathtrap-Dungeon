package com.camcamcamcamcam.deathtrapdungeon.objects;

public class Creature {
	private String name;

	protected int[] stats;

	public Creature(String name, int skill, int stamina) {
		this.stats = new int[]{skill, stamina};
		this.name = name;
	}

	public Creature() {
		this.stats = new int[]{0, 0};
	}

	public int get(Stats stat) {
		return this.stats[stat.ordinal()];
	}

	public String change(Stats stat, int amount) {
		this.stats[stat.ordinal()] += amount;
		return null;
	}
	
	public boolean isAlive() {
		return this.stats[Stats.STAMINA.ordinal()] > 0;
	}

	public String getName() {
		return name;
	}
}
