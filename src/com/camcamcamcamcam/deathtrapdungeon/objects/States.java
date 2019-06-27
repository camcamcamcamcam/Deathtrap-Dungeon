package com.camcamcamcamcam.deathtrapdungeon.objects;

import com.camcamcamcamcam.deathtrapdungeon.procedures.Deathtrap;
import com.camcamcamcamcam.deathtrapdungeon.procedures.Methods;

public class States {
	private boolean examinedBarbarian;
	private boolean examinedAlcove;
	private boolean openedBlackBook;
	private boolean openedRedBook;
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
		openedRedBook = false;
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

	public boolean isOpenedRedBook() {
		return openedRedBook;
	}

	public void setOpenedRedBook(boolean openedRedBook) {
		this.openedRedBook = openedRedBook;
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

	public static String setScores(int whichPage) {
		switch (whichPage) {
		default:
			return null;
		case 0:
			return "Your skill is " + Deathtrap.character.getSkill() + ". Your stamina is "
					+ Deathtrap.character.getStamina() + ". Your luck is " + Deathtrap.character.getLuck() + ". \n\n";
		case 6:
			return Deathtrap.character.changeStamina(-2);
		case 10:
			return Deathtrap.character.setFood(0);
		case 16:
			return Deathtrap.character.changeStamina(-(Methods.rollDice(1) + 1));
		case 20:
			return Deathtrap.character.changeGold(1) + Deathtrap.character.changeSkill(-1);
		case 26:
			return Deathtrap.character.changeSkill(-2);
		case 28:
			return Deathtrap.character.changeSkill(1);
		case 33:
			return Deathtrap.character.changeSkill(-3);
		case 38:
			return Deathtrap.character.changeStamina(-3);
		case 42:
			return Deathtrap.character.changeStamina(-5);
		case 45:
			return Deathtrap.character.changeStamina(-4) + Deathtrap.character.changeSkill(-1);
		case 57:
			return Deathtrap.character.changeStamina(-4);
		case 72:
			return Deathtrap.character.changeSkill(-2);
		case 91:
			return Deathtrap.character.changeStamina(-4);
		case 95:
			return Deathtrap.character.changeSkill(1);
		case 103:
			return Deathtrap.character.changeStamina(-3);
		case 112:
			return Deathtrap.character.setFood(Deathtrap.character.getFood() - 2);
		case 115:
			return Deathtrap.character.changeStamina(3);
		case 123:
			return Deathtrap.character.changeSkill(1) + Deathtrap.character.changeStamina(1);
		case 132:
			return Deathtrap.character.changeStamina(-(Methods.rollDice(1) + 1));
		case 139:
			return Deathtrap.character.changeStamina(-2);
		case 146:
			return Deathtrap.character.setFood(0);
		case 147:
			return Deathtrap.character.changeStamina(1);
		case 150:
			return Deathtrap.character.changeSkill(-1);
		case 157:
			return Deathtrap.character.changeLuck(1);
		case 158:
			return Deathtrap.character.changeSkill(-1) + Deathtrap.character.changeStamina(-4);
		case 162:
			return Deathtrap.character.changeLuck(1);
		case 165:
			return Deathtrap.character.changeGold(-1);
		case 167:
			return Deathtrap.character.changeStamina(-4);
		case 169:
			return Deathtrap.character.setFood(Deathtrap.character.getFood() - 1);
		case 171:
			return Deathtrap.character.changeStamina(-4);
		case 173:
			return Deathtrap.character.changeStamina(1) + Deathtrap.character.changeSkill(2);
		case 175:
			return Deathtrap.character.changeLuck(2);
		case 179:
			return Deathtrap.character.changeStamina(-2);
		case 189:
			return Deathtrap.character.changeStamina(-3);
		case 190:
			return Deathtrap.character.changeStamina(-3);
		case 195:
			return Deathtrap.character.changeStamina(-1);
		case 199:
			return Deathtrap.character.changeStamina(-2 * Methods.rollDice(1)) + Deathtrap.character.changeLuck(-1);
		case 206:
			return Deathtrap.character.setFood(Deathtrap.character.getFood() - 2)
					+ Deathtrap.character.changeStamina(4);
		case 207:
			return Deathtrap.character.changeStamina(-3);
		case 215:
			return Deathtrap.character.changeStamina(-2);
		case 217:
			return Deathtrap.character.changeSkill(-1);
		case 220:
			return Deathtrap.character.changeSkill(-2) + Deathtrap.character.changeStamina(-2);
		case 223:
			return Deathtrap.character.changeLuck(-2) + Deathtrap.character.changeStamina(-(Methods.rollDice(2)));
		case 226:
			return Deathtrap.character.changeStamina(3);
		case 235:
			return Deathtrap.character.changeStamina(-2);
		case 238:
			return Deathtrap.character.changeSkill(1);
		case 244:
			return Deathtrap.character.changeGold(-1);
		case 246:
			return Deathtrap.character.changeLuck(-2) + Deathtrap.character.changeStamina(-(Methods.rollDice(2)));
		case 247:
			return Deathtrap.character.changeStamina(-2 * (Methods.rollDice(1)));
		case 249:
			return Deathtrap.character.changeStamina(-(Methods.rollDice(1) + 1));
		case 257:
			return Deathtrap.character.changeGold(1);
		case 269:
			return Deathtrap.character.changeStamina(3);
		case 270:
			return Deathtrap.character.changeGold(2);
		case 271:
			return Deathtrap.character.changeSkill(-1);
		case 285:
			return Deathtrap.character.changeSkill(-1) + Deathtrap.character.changeStamina(-2);
		case 286:
			return Deathtrap.character.changeSkill(4);
		case 287:
			return Deathtrap.character.changeStamina(-(Methods.rollDice(1) + 1));
		case 294:
			return Deathtrap.character.changeSkill(-2);
		case 295:
			return Deathtrap.character.changeStamina(-5);
		case 297:
			return Deathtrap.character.changeLuck(-1);
		case 304:
			return Deathtrap.character.changeStamina(-6);
		case 306:
			return Deathtrap.character.changeLuck(-2);
		case 309:
			return Deathtrap.character.changeStamina(-3);
		case 330:
			return Deathtrap.character.changeStamina(1);
		case 336:
			return Deathtrap.character.changeSkill(-4);
		case 337:
			return Deathtrap.character.changeStamina(1) + Deathtrap.character.changeLuck(-2);
		case 339:
			return Deathtrap.character.changeStamina(-1);
		case 343:
			return Deathtrap.character.changeStamina(-1);
		case 350:
			return Deathtrap.character.changeStamina(-(Methods.rollDice(1)));
		case 353:
			return Deathtrap.character.changeSkill(-1) + Deathtrap.character.changeStamina(-4);
		case 354:
			return Deathtrap.character.changeLuck(-2);
		case 358:
			return Deathtrap.character.changeStamina(-2);
		case 363:
			return Deathtrap.character.changeStamina(2);
		case 377:
			return Deathtrap.character.changeStamina(-5);
		case 384:
			return Deathtrap.character.changeStamina(-2);
		case 386:
			return Deathtrap.character.changeStamina(-1);
		case 389:
			return Deathtrap.character.changeSkill(-4);
		case 390:
			return Deathtrap.character.changeLuck(1);
		case 391:
			return Deathtrap.character.changeSkill(1) + Deathtrap.character.changeStamina(1)
					+ Deathtrap.character.changeLuck(1);
		case 394:
			return Deathtrap.character.changeStamina(-(Methods.rollDice(1) + 2));
		case 395:
			return Deathtrap.character.changeStamina(-3);
		case 397:
			return Deathtrap.character.changeLuck(2);
		case 399:
			return Deathtrap.character.changeStamina(3);
		}
	}

}
