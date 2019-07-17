package com.camcamcamcamcam.deathtrapdungeon.objects;

import com.camcamcamcamcam.deathtrapdungeon.procedures.Deathtrap;
import com.camcamcamcamcam.deathtrapdungeon.procedures.Methods;

public class States {
	private boolean examinedBarbarian;
	private boolean examinedAlcove;
	private boolean openedBlackBook;
	private boolean drunkFromFairyFountain;
	private boolean drunkFromHagFountain;
	private boolean eatenRice;
	private boolean rubbedOintment;

	private boolean bloodbeastKnowledge;
	private boolean manticoreKnowledge;
	private boolean dopplegangerPotionKnowledge;
	private boolean spiritGirlKnowledge;

	private boolean drunkPotionOfHeatResistance;
	private boolean drunkPotionOfTrapDetection;

	public States() {
		examinedBarbarian = false;
		examinedAlcove = false;
		openedBlackBook = false;
		drunkFromFairyFountain = false;
		drunkFromHagFountain = false;
		eatenRice = false;
		rubbedOintment = false;
		bloodbeastKnowledge = false;
		manticoreKnowledge = false;
		spiritGirlKnowledge = false;
		dopplegangerPotionKnowledge = false;
		drunkPotionOfHeatResistance = false;
		drunkPotionOfTrapDetection = false;
	}

	public boolean isExaminedBarbarian() {
		return examinedBarbarian;
	}

	public void setExaminedBarbarian(boolean examinedBarbarian) {
		this.examinedBarbarian = examinedBarbarian;
	}

	public boolean isExaminedAlcove() {
		return examinedAlcove;
	}

	public void setExaminedAlcove(boolean examinedAlcove) {
		this.examinedAlcove = examinedAlcove;
	}

	public boolean isOpenedBlackBook() {
		return openedBlackBook;
	}

	public void setOpenedBlackBook(boolean openedBlackBook) {
		this.openedBlackBook = openedBlackBook;
	}

	public boolean isDrunkFromFairyFountain() {
		return drunkFromFairyFountain;
	}

	public void setDrunkFromFairyFountain(boolean drunkFromFairyFountain) {
		this.drunkFromFairyFountain = drunkFromFairyFountain;
	}

	public boolean isDrunkFromHagFountain() {
		return drunkFromHagFountain;
	}

	public void setDrunkFromHagFountain(boolean drunkFromHagFountain) {
		this.drunkFromHagFountain = drunkFromHagFountain;
	}

	public boolean isEatenRice() {
		return eatenRice;
	}

	public void setEatenRice(boolean eatenRice) {
		this.eatenRice = eatenRice;
	}

	public boolean isRubbedOintment() {
		return rubbedOintment;
	}

	public void setRubbedOintment(boolean rubbedOintment) {
		this.rubbedOintment = rubbedOintment;
	}

	public boolean isBloodbeastKnowledge() {
		return bloodbeastKnowledge;
	}

	public void setBloodbeastKnowledge(boolean bloodbeastKnowledge) {
		this.bloodbeastKnowledge = bloodbeastKnowledge;
	}

	public boolean isDrunkPotionOfTrapDetection() {
		return drunkPotionOfTrapDetection;
	}

	public void setDrunkPotionOfTrapDetection(boolean drunkPotionOfTrapDetection) {
		this.drunkPotionOfTrapDetection = drunkPotionOfTrapDetection;
	}

	public boolean isManticoreKnowledge() {
		return manticoreKnowledge;
	}

	public void setManticoreKnowledge(boolean manticoreKnowledge) {
		this.manticoreKnowledge = manticoreKnowledge;
	}

	public boolean isDrunkPotionOfHeatResistance() {
		return drunkPotionOfHeatResistance;
	}

	public void setDrunkPotionOfHeatResistance(boolean drunkPotionOfHeatResistance) {
		this.drunkPotionOfHeatResistance = drunkPotionOfHeatResistance;
	}

	public boolean isDopplegangerPotionKnowledge() {
		return dopplegangerPotionKnowledge;
	}

	public void setDopplegangerPotionKnowledge(boolean dopplegangerPotionKnowledge) {
		this.dopplegangerPotionKnowledge = dopplegangerPotionKnowledge;
	}

	public boolean isSpiritGirlKnowledge() {
		return spiritGirlKnowledge;
	}

	public void setSpiritGirlKnowledge(boolean spiritGirlKnowledge) {
		this.spiritGirlKnowledge = spiritGirlKnowledge;
	}
}
