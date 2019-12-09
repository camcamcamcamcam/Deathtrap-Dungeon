package com.camcamcamcamcam.deathtrapdungeon.procedures;

import javax.swing.JOptionPane;

import com.camcamcamcamcam.deathtrapdungeon.objects.Character;

public class Deathtrap {
	
	public static Character character;
	
	public static String setScores() {
		switch (Deathtrap.character.getPage()) {
		default:
			return "";
		case -1: System.exit(0);
		case 0:
			return "Your skill is " + Deathtrap.character.getSkill() + ". Your stamina is "
					+ Deathtrap.character.getStamina() + ". Your luck is " + Deathtrap.character.getLuck() + ". ";
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
			// TODO check for shield here
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

	
	public static void pageMethods() {
		switch (character.getPage()) {
		case 0:
			Methods.choosePath(1, "Enter Deathtrap Dungeon");
			break;
		case 1:
			Methods.choosePath(270, 66, "Open the box", "Continue walking north");
			break;
		case 2:
			character.die();
			break;
		case 3:
			character.die();
			break;
		case 4:
			character.die();
			break;
		case 5:
			Methods.testLuck(185, 395);
			break;
		case 6:
			Methods.fight(11, 11, "MANTICORE", 364);
			break;
		case 7:
			character.die();
			break;
		case 8:
			character.die();
			break;
		case 9:
			Methods.choosePath(158, 375, "Drink it", "Dip a piece of cloth in it");
			break;
		case 10:
			character.setFood(0);
			if (character.equipment.search("Iron Key", false) != -1) {
				Methods.choosePath(86, "Use your iron key to open the door.");
			} else {
				Methods.choosePath(276, "Continue");
			}
			break;
		case 11:
			character.gems.add("Emerald");
			Methods.choosePath(140, 46, "Prise out the right eye", "Climb down the idol");
			break;
		case 12:
			Methods.choosePath(382, 195, 250, "Wait for his question", "Attack him with your sword",
					"Make a run for the door");
			break;
		case 13:
			Methods.choosePath(147, 182, "Drink the liquid", "Don't risk it and continue north.");
			break;
		case 14:
			Methods.choosePath(157, 310, "Try and open the casket", "Continue north.");
			break;
		case 15:
			Methods.choosePath(74, "Continue");
			break;
		case 16:
			Methods.gemSlot();
			break;
		case 17:
			character.die();
			break;
		case 18:
			Methods.testSkill(55, 202);
			break;
		case 19:
			character.die();
			break;
		case 20:
			Methods.choosePath(279, "Continue");
			break;
		case 21:
			Methods.fight(12, 2, "BLOODBEAST", Methods.testLuck(97, 116));
			break;
		case 22:
			Methods.choosePath(63, 184, 311, "Accept the Barbarian's offer",
					"Offer to lower him down if he is so eager to investigate the pit",
					"Suggest you both jump over the pit instead");
			break;
		case 23:
			Methods.choosePath(154, "Continue");
			break;
		case 24:
			Methods.choosePath(324, 188, "Sit in the chair", "Keep going north");
			break;
		case 25:
			Methods.choosePath(197, "Continue");
			break;
		case 26:
			Methods.testSkill(55, 202);
			break;
		case 27:
			Methods.choosePath(78, "Continue");
			break;
		case 28:
			character.equipment.add("Dwarf Armour");
			Methods.choosePath(213, "Continue");
			break;
		case 29:
			Methods.choosePath(90, "Continue");
			break;
		case 30:
			Methods.testLuck(160, 319);
			break;
		case 31:
			if (character.gems.search("Sapphire", false) != -1) {
				Methods.choosePath(376, "Continue");
			} else {
				Methods.choosePath(3, "Continue");
			}
			break;
		case 32:
			Methods.choosePath(37, "Continue");
			break;
		case 33:
			character.equipment.add("Grappling Iron");
			character.equipment.add("Leather Pouch");
			character.equipment.add("Brass Bell");
			Methods.choosePath(292, "Continue");
			break;
		case 34:
			character.die();
			break;
		case 35:
			Methods.choosePath(333, 124, "Knock on the trapdoor", "Burst through the trapdoor with your sword drawn");
			break;
		case 36:
			Methods.testSkill(340, 7);
			break;
		case 37:
			Methods.choosePath(351, 239, "Climb the idol to take the jewels",
					"Walk through the cavern to the tunnel in the opposite wall");
			break;
		case 38:
			Methods.choosePath(109, "Continue");
			break;
		case 39:
			Methods.fight(7, 8, "GIANT FLY", 111, 267);
			character.equipment.add("Opal Dagger");
			break;
		case 40:
			Methods.fight(9, 9, "MINOTAUR", 163);
			break;
		case 41:
			character.states.setExaminedAlcove(true);
			if (character.states.isExaminedBarbarian()) {
				Methods.choosePath(98, 83, "Drink the liquid", "Leave the chamber to continue west");
			} else {
				Methods.choosePath(98, 126, 83, "Drink the red liquid",
						"Leave the globlet and walk over to search the Barbarian",
						"Leave the chamber to continue west.");
			}
			break;
		case 42:
			Methods.testSkill(55, 202);
			break;
		case 43:
			Methods.choosePath(200, 316, "Open the door", "Continue north.");
			break;
		case 44:
			character.die();
			break;
		case 45:
			Methods.choosePath(312, "Continue");
			break;
		case 46:
			Methods.choosePath(239, "Continue");
			break;
		case 47:
			if (character.equipment.search("Hollow Wooden Tube", false) != -1) {
				Methods.choosePath(10, "Continue");
			} else {
				Methods.choosePath(335, "Continue");
			}
			break;
		case 48:
			Methods.choosePath(197, "Continue");
			break;
		case 49:
			Methods.choosePath(205, 241, "Follow them", "Walk back to the last junction to head north.");
			break;
		case 50:
			Methods.choosePath(221, "Continue");
			break;
		case 51:
			Methods.fight(6, 5, "HOBGOBLIN", 9);
			break;
		case 52:
			character.knowledge.add("Bloodbeast");
			if (character.states.isOpenedBlackBook()) {
				Methods.choosePath(369, "Walk back to the last junction to continue north.");
			} else {
				Methods.choosePath(138, 369, "Open the black book", "Walk back to the last junction to head north.");
			}
			break;
		case 53:
			Methods.choosePath(370, 348, "Run around the pool towards the tunnel",
					"Attack the Bloodbeast with your sword.");
			break;
		case 54:
			character.equipment.add("Rope");
			Methods.choosePath(239, "Continue");
			break;
		case 55:
			String test = ((String) JOptionPane.showInputDialog(Window.frame,
					"Type your answer in the text box below.")).toUpperCase();
			switch (test) {
			default:
				Methods.choosePath(347, "Continue");
				break;
			case "SCORPION":
				Methods.choosePath(143, "Continue");
				break;
			case "MINOTAUR":
				Methods.choosePath(40, "Continue");
			}
			break;
		case 56:
			Methods.choosePath(373, 215, "Try and climb over it", "Slice it open with your sword.");
			break;
		case 57:
			Methods.choosePath(198, "Continue");
			break;
		case 58:
			Methods.testSkill(80, 246);
			break;
		case 59:
			Methods.choosePath(341, 283, "Stand your ground with your sword drawn", "Hide in the shadows.");
			break;
		case 60:
			Methods.choosePath(179, 365, "Join Throm in attacking the Dwarf",
					"Persuade Throm to go through with the Dwarf's test.");
			break;
		case 61:
			character.die();
			break;
		case 62:
			Methods.gemSlot();
			break;
		case 63:
			Methods.choosePath(194, "Continue");
			break;
		case 64:
			Methods.testSkill(115, 190);
			break;
		case 65:
			if (character.potions.search("Trap Detection", false) != -1) {
				Methods.choosePath(345, "Continue");
			} else {
				Methods.choosePath(372, "Continue");
			}
			break;
		case 66:
			Methods.choosePath(293, 119, "West", "East");
			break;
		case 67:
			Methods.testLuck(146, 219);
			break;
		case 68:
			Methods.choosePath(271, 30, 212, "Throw your shield over the pit and jump after it",
					"Jump over the pit carrying all your possessions",
					"Reach for the rope with your sword to enable you to swing across the pit.");
			break;
		case 69:
			Methods.choosePath(305, "Continue");
			break;
		case 70:
			character.die();
			break;
		case 71:
			character.knowledge.add("Manticore");
			Methods.choosePath(128, "Continue");
			break;
		case 72:
			Methods.choosePath(122, "Continue");
			break;
		case 73:
			if (character.states.isExaminedBarbarian()) {
				Methods.choosePath(83, "Leave the chamber to continue west.");
			} else {
				Methods.choosePath(126, 83, "Walk back to examine the Barbarian",
						"Leave the chamber to continue west.");
			}
			break;
		case 74:
			if (character.equipment.search("Ring of Wishes", true) != -1) {
				Methods.choosePath(265, 300, 327, "Make a wish", "Try to smash the mirrors",
						"Attack the Mirror Demon with you sword.");
			} else {
				Methods.choosePath(300, 327, "Try to smash the mirrors", "Attack the Mirror Demon with your sword");
			}
			break;
		case 75:
			if (character.knowledge.search("Bloodbeast", false) != -1) {
				Methods.choosePath(369, "Continue north with Throm");
			} else {
				Methods.choosePath(52, 369, "Open the red book", "Continue north with Throm.");
			}
			break;
		case 76:
			Methods.choosePath(317, 117, "Explore the borehole", "Walk west along the tunnel.");
			break;
		case 77:
			Methods.choosePath(400, "Continue");
			break;
		case 78:
			Methods.choosePath(301, 142, "Crawl down the pipe", "Continue north.");
			break;
		case 79:
			Methods.testLuck(106, 383);
			break;
		case 80:
			Methods.choosePath(313, "Continue");
			break;
		case 81:
			Methods.choosePath(307, 263, 136, "Open the cupboard", "Open the west door", "Open the north door.");
			break;
		case 82:
			Methods.choosePath(214, "Continue");
			break;
		case 83:
			Methods.choosePath(37, "Continue");
			break;
		case 84:
			if (Methods.rollDice(2) > 8) {
				Methods.choosePath(152, "The total was greater than 8.");
			} else {
				Methods.choosePath(121, "The total was less than or equal to 8.");
			}
			break;
		case 85:
			character.die();
			break;
		case 86:
			Methods.choosePath(187, "Continue");
			break;
		case 87:
			Methods.choosePath(381, "Continue");
			break;
		case 88:
			Methods.choosePath(343, 268, "Take part in the Run of the Arrow", "Try to fight your way out.");
			break;
		case 89:
			Methods.testLuck(54, 261);
			break;
		case 90:
			if (character.knowledge.search("Bloodbeast", false) != -1) {
				Methods.choosePath(172, "Continue");
			} else {
				Methods.choosePath(357, "Continue");
			}
			break;
		case 91:
			Methods.fight(5, 5, "FIRST ORC", 257);
			Methods.fight(6, 4, "SECOND ORC", 257);
			character.changeSkill(4);
			Methods.choosePath(257, "Continue");
			break;
		case 92:
			Methods.choosePath(122, "Continue");
			break;
		case 93:
			Methods.choosePath(284, 230, "Enter the room and open the chest", "Keep walking down the tunnel.");
			break;
		case 94:
			Methods.choosePath(174, "Continue");
			break;
		case 95:
			character.equipment.add("Iron Shield");
			Methods.choosePath(248, "Continue");
			break;
		case 96:
			character.die();
			break;
		case 97:
			Methods.choosePath(134, "Continue");
			break;
		case 98:
			Methods.testLuck(105, 235);
			break;
		case 99:
			Methods.choosePath(266, 305, "Search her room",
					"Leave by the door in the east wall, where you find yourself standing at the end of a tunnel");
			break;
		case 100:
			Methods.choosePath(87, 217, "Open the door", "Keep walking north.");
			break;
		case 101:
			character.die();
			break;
		case 102:
			Methods.choosePath(133, 251, "Shout: Hail, Sukumvit", "Shout: Sukumvit is a worm?");
			break;
		case 103:
			Methods.choosePath(77, "Continue");
			break;
		case 104:
			Methods.choosePath(134, "Continue");
			break;
		case 105:
			if (character.states.isExaminedBarbarian()) {
				Methods.choosePath(83, "Leave the chamber to continue west");
			} else {
				Methods.choosePath(126, "Continue");
			}
			break;
		case 106:
			character.equipment.add("Doppelganger Potion");
			Methods.choosePath(188, "Continue");
			break;
		case 107:
			Methods.choosePath(168, 267, "Try the door", "Continue along the tunnel.");
			break;
		case 108:
			Methods.choosePath(394, 59, 14, "Break the glass and try to snatch the crown", "Continue west",
					"Return to the junction to head north.");
			break;
		case 109:
			Methods.choosePath(43, 24, "Keep heading west", "Go north");
			break;
		case 110:
			Methods.choosePath(58, 223, "Step between the poles", "Walk across the top of the poles");
			break;
		case 111:
			Methods.choosePath(267, "Continue");
			break;
		case 112:
			Methods.choosePath(356, "Continue");
			break;
		case 113:
			if (character.equipment.search("Wooden Ball", true) != -1) {
				Methods.choosePath(372, 74, "Try again with the other ball",
						"Close the door and continue west along the tunnel");
			} else {
				Methods.choosePath(74,
						"You have already thrown twice, so you close the door and continue west along the tunnel");
			}
			break;
		case 114:
			Methods.choosePath(336, 298, "Put it on your own wrist", "Set off north again.");
			break;
		case 115:
			Methods.choosePath(221, "Continue");
			break;
		case 116:
			character.die();
			break;
		case 117:
			Methods.choosePath(329, 135, "Take a closer look in the mirror",
					"Make the long walk back to the last junction to head north.");
			break;
		case 118:
			Methods.choosePath(60, "Continue");
			break;
		case 119:
			Methods.choosePath(56, 293, "Continue east", "Go back to the junction to head west");
			break;
		case 120:
			Methods.choosePath(228, 292, "Reach down for them", "Ignore them and continue north");
			break;
		case 121:
			Methods.choosePath(26, 354, "Swallow the pill stamped with the letter S", "Swallow the other pill");
			break;
		case 122:
			Methods.choosePath(176, 384, "Climb the left-hand flight of steps", "Climb the right-hand flight");
			break;
		case 123:
			Methods.choosePath(282, "Continue");
			break;
		case 124:
			Methods.fight(5, 4, "First GOBLIN", 5, 5, "Second GOBLIN", 81);
			break;
		case 125:
			Methods.testLuck(69, 139);
			break;
		case 126:
			character.states.setExaminedBarbarian(true);
			if (character.states.isExaminedAlcove()) {
				Methods.choosePath(226, 83, "Eat the dried meat", "Leave the chamber and head west");
			} else {
				Methods.choosePath(226, 41, 83, "Eat the dried meat", "Leave the meat and walk over to the alcove",
						"Leave the chamber and head west");
			}
			break;
		case 127:
			Methods.choosePath(90, "Continue");
			break;
		case 128:
			Methods.choosePath(35, 233, "Step through the archway", "Stop to eat some of the mushrooms");
			break;
		case 129:
			if (character.equipment.search("Bone Monkey Charm", true) != -1) {
				Methods.choosePath(349, 361, 167, "Lower yourself down on the rope to fight the PIT FIEND",
						"Throw your bone monkey charm into the pit",
						"Try to hook the PIT FIEND with the grappling iron while sitting on top of the wall");
			} else {
				Methods.choosePath(349, 167, "Lower yourself down on the rope to fight the PIT FIEND",
						"Try to hook the PIT FIEND with the grappling iron while sitting on top of the wall");
			}
			break;
		case 130:
			Methods.fight(7, 5, "First HOBGOBLIN", 9);
			Methods.fight(6, 5, "Second HOBGOBLIN", 9);
			break;
		case 131:
			Methods.choosePath(74, "Continue");
			break;
		case 132:
			Methods.gemSlot();
			break;
		case 133:
			Methods.testSkill(178, 17);
			break;
		case 134:
			if (character.knowledge.search("Manticore", false) != -1) {
				Methods.choosePath(222, "Continue");
			} else {
				Methods.choosePath(247, "Continue");
			}
			break;
		case 135:
			Methods.choosePath(68, "Continue");
			break;
		case 136:
			Methods.choosePath(210, 78, "Open the door", "Continue north");
			break;
		case 137:
			Methods.choosePath(220, 362, "Ring the bell", "Walk around it and continue west");
			break;
		case 138:
			character.states.setOpenedBlackBook(true);
			if (character.knowledge.search("Bloodbeast", false) != -1) {
				Methods.choosePath(397, 75, 369, "Drink the liquid", "Rub the liquid into your wounds",
						"Leave the bottle and book and continue north with Throm");
			} else {
				Methods.choosePath(397, 75, 52, 369, "Drink the liquid", "Rub the liquid into your wounds",
						"Open the red book", "Leave the bottle and book and continue north with Throm");
			}
			break;
		case 139:
			Methods.fight(9, 9, "IVY", 201);
			break;
		case 140:
			character.die();
			break;
		case 141:
			Methods.testSkill(72, 96);
			break;
		case 142:
			Methods.choosePath(338, "Continue");
			break;
		case 143:
			Methods.fight(10, 10, "LEFT PINCER", 10, 10, "RIGHT PINCER", 163);
			break;
		case 144:
			Methods.choosePath(85, "Continue");
			break;
		case 145:
			Methods.fight(8, 6, "DWARF", 28);
			break;
		case 146:
			if (character.equipment.search("Iron Key", false) != -1) {
				Methods.choosePath(86, "Continue");
			} else {
				Methods.choosePath(276, "Continue");
			}
			break;
		case 147:
			character.potions.add("Heat Resistance");
			Methods.choosePath(182, "Continue");
			break;
		case 148:
			Methods.fight(7, 7, "First GUARD DOG", 175);
			Methods.fight(7, 8, "Second GUARD DOG", 175, 315);
			break;
		case 149:
			Methods.testLuck(70, 353);
			break;
		case 150:
			character.equipment.add("Grappling Iron");
			character.equipment.add("Leather Pouch");
			character.equipment.add("Brass Bell");
			Methods.choosePath(292, "Continue");
			break;
		case 151:
			character.changeSkill(-2);
			Methods.fight(7, 8, "First FLYING GUARDIAN", 240);
			Methods.fight(8, 8, "Second FLYING GUARDIAN", 240);
			character.changeSkill(2);
			Methods.choosePath(240, "Continue");
			break;
		case 152:
			Methods.testSkill(55, 202);
			break;
		case 153:
			character.equipment.add("Wooden Ball");
			character.equipment.add("Wooden Ball");
			Methods.choosePath(390, 371, 74, "Walk into the room and pick up the skull",
					"Throw a wooden ball at the skull from the doorway",
					"Close the door and continue west, taking the wooden balls with you");
			break;
		case 154:
			Methods.choosePath(22, "Continue");
			break;
		case 155:
			Methods.choosePath(378, 322, "Dive into the water", "Walk back down the tunnel");
			break;
		case 156:
			Methods.choosePath(208, 326, "Open the door, jump over the pit and take the rope",
					"Continue north along the tunnel");
			break;
		case 157:
			character.gems.add("Pearl");
			Methods.choosePath(310, "Continue");
			break;
		case 158:
			Methods.choosePath(275, "Continue");
			break;
		case 159:
			if (character.equipment.search("Dagger", false) != -1) {
				Methods.choosePath(294, "Continue");
			} else {
				Methods.choosePath(334, "Continue");
			}
			break;
		case 160:
			Methods.choosePath(237, "Continue");
			break;
		case 161:
			character.gems.clearAll();
			Methods.choosePath(29, "Continue");
			break;
		case 162:
			character.gems.add("Sapphire");
			character.equipment.add("Iron Key");
			Methods.choosePath(142, "Continue");
			break;
		case 163:
			Methods.choosePath(363, 302, "Eat and drink the Dwarf's offerings", "Sit down and await his return");
			break;
		case 164:
			Methods.choosePath(299, 83, "Open the door", "Keep going west");
			break;
		case 165:
			character.equipment.add("Stilts");
			Methods.choosePath(234, "Continue");
			break;
		case 166:
			character.changeSkill(-3);
			Methods.fight(7, 8, "First FLYING GUARDIAN", 11);
			Methods.fight(8, 8, "Second FLYING GUARDIAN", 11);
			character.changeSkill(3);
			Methods.choosePath(11, "Continue");
			break;
		case 167:
			Methods.choosePath(203, "Continue");
			break;
		case 168:
			Methods.choosePath(94, 267, "Reach for the dagger", "Back away in disgust and leave the cavern");
			break;
		case 169:
			character.knowledge.add("Doppleganger");
			Methods.choosePath(109, "Continue");
			break;
		case 170:
			Methods.choosePath(281, 192, "Help her",
					"Leave her to defend herself and walk back to the tunnel to head north");
			break;
		case 171:
			character.equipment.add("Rope");
			Methods.choosePath(326, "Continue");
			break;
		case 172:
			Methods.fight(12, 4, "BLOODBEAST", 278);
			break;
		case 173:
			if (character.states.isDrunkFromHagFountain()) {
				Methods.choosePath(368, "Continue north");
			} else {
				Methods.choosePath(368, 337, "Continue north", "Drink from the other fountain");
			}
			break;
		case 174:
			Methods.testLuck(39, 350);
			break;
		case 175:
			Methods.choosePath(315, "Continue");
			break;
		case 176:
			Methods.choosePath(277, "Continue");
			break;
		case 177:
			Methods.testLuck(243, 103);
			break;
		case 178:
			Methods.choosePath(344, "Continue");
			break;
		case 179:
			Methods.choosePath(290, 191, 84, "Guess that it will be the same",
					"Guess that it will total less than eight", "Guess that it will total more than eight");
			break;
		case 180:
			Methods.testLuck(53, 272);
			break;
		case 181:
			Methods.testLuck(312, 45);
			break;
		case 182:
			if (character.potions.search("Heat Resistance", false) != -1) {
				Methods.choosePath(25, "Continue");
			} else {
				Methods.choosePath(242, "Continue");
			}
			break;
		case 183:
			Methods.choosePath(386, 218, "Go west", "Continue north");
			break;
		case 184:
			Methods.choosePath(323, 149, "Stay with the Barbaian and head north down the lower tunnel",
					"Abandon him by jumping over the pit to head west");
			break;
		case 185:
			Methods.choosePath(318, 47, "Run over the bridge", "Dive into the river");
			break;
		case 186:
			Methods.testLuck(260, 358);
			break;
		case 187:
			Methods.choosePath(360, 280, "Give the man something from your backpack for his services",
					"Walk past him down the tunnel");
			break;
		case 188:
			if (character.knowledge.search("Spirit Girl", false) != -1) {
				Methods.choosePath(155, "Continue");
			} else {
				Methods.choosePath(224, "Continue");
			}
			break;
		case 189:
			Methods.fight(5, 5, "First ORC", 257);
			Methods.fight(6, 4, "Second ORC", 257);
			break;
		case 190:
			Methods.choosePath(50, "Continue");
			break;
		case 191:
			if (Methods.rollDice(2) < 8) {
				Methods.choosePath(152, "The total was less than eight.");
			} else {
				Methods.choosePath(121, "The total was greater or equal to eight.");
			}
			break;
		case 192:
			Methods.choosePath(120, 292, "Stop and lift it up", "Keep walking");
			break;
		case 193:
			character.die();
			break;
		case 194:
			Methods.choosePath(52, 138, 369, "Open the red leather book", "Open the black leather book",
					"Continue north along the tunnel");
			break;
		case 195:
			Methods.choosePath(382, "Continue");
			break;
		case 196:
			Methods.fight(11, 11, "MANTICORE", 364);
			break;
		case 197:
			Methods.choosePath(171, 156, 326, "Try to open the door", "Slide the iron plate",
					"Continue north up the tunnel");
			break;
		case 198:
			Methods.choosePath(230, "Continue");
			break;
		case 199:
			Methods.choosePath(74, "Continue");
			break;
		case 200:
			Methods.choosePath(321, 316, "Pull the drape up", "Leave the room and continue north along the tunnel");
			break;
		case 201:
			character.equipment.add("Bone");
			Methods.choosePath(305, "Continue");
			break;
		case 202:
			Methods.testLuck(18, 42);
			break;
		case 203:
			Methods.fight(12, 15, "PIT FIEND", 258);
			break;
		case 204:
			Methods.testLuck(131, 199);
			break;
		case 205:
			Methods.choosePath(306, 161, "Attack them", "Try to walk past them");
			break;
		case 206:
			Methods.choosePath(60, "Continue");
			break;
		case 207:
			Methods.choosePath(386, 218, "Go west", "Continue north");
			break;
		case 208:
			character.equipment.add("Rope");
			Methods.choosePath(326, "Continue");
			break;
		case 209:
			Methods.listEquipment();
			Methods.choosePath(356, "Continue");
			break;
		case 210:
			Methods.choosePath(27, 78, "Cut him free from his chains", "Leave the room to head north.");
			break;
		case 211:
			Methods.fight(9, 9, "IVY", 201, 201);
			break;
		case 212:
			Methods.choosePath(285, "Continue");
			break;
		case 213:
			Methods.choosePath(108, 14, "Walk west to investigate who or what is making the noise", "Continue north");
			break;
		case 214:
			Methods.choosePath(389, 181, "Abandon any weapons before continuing north",
					"Ignore the notice and carry on north");
			break;
		case 215:
			Methods.choosePath(13, "Continue");
			break;
		case 216:
			Methods.choosePath(308, 316, "Enter her cage with your eyes closed to dispose of her with your sword",
					"Retreat out of the room with your eyes closed to continue north");
			break;
		case 217:
			character.equipment.search("Shield", true);
			Methods.choosePath(36, "Continue");
			break;
		case 218:
			Methods.choosePath(65, 252, "Enter the room and take the jewel", "Continue north");
			break;
		case 219:
			character.die();
			break;
		case 220:
			Methods.choosePath(61, 346, "Scream as loud as you can", "Try to deaden the bell with your boot");
			break;
		case 221:
			Methods.choosePath(374, 60, "Search the chamber", "Head straight for the archway");
			break;
		case 222:
			if (character.equipment.search("Shield", false) != -1) {
				Methods.choosePath(196, "Continue");
			} else {
				Methods.choosePath(6, "Continue");
			}
			break;
		case 223:
			Methods.choosePath(313, "Continue");
			break;
		case 224:
			Methods.choosePath(43, "Continue");
			break;
		case 225:
			Methods.fight(12, 2, "BLOODBEAST", Methods.testLuck(97, 21));
			break;
		case 226:
			if (character.states.isExaminedAlcove()) {
				Methods.choosePath(83, "Leave the chamber to continue west");
			} else {
				Methods.choosePath(41, 83, "Walk over to the alcove", "Leave the chamber to continue west");
			}
			break;
		case 227:
			Methods.choosePath(85, "Continue");
			break;
		case 228:
			Methods.testLuck(150, 33);
			break;
		case 229:
			character.knowledge.add("Spirit Girl");
			Methods.choosePath(107, "Continue");
			break;
		case 230:
			if (character.equipment.search("Doppelganger Potion", true) != -1) {
				Methods.choosePath(88, 5, 385, "Walk up to them", "Try to creep past them",
						"Drink a Doppelganger Potion");
			} else {
				Methods.choosePath(88, 5, "Walk up to them", "Try to creep past them");
			}
			break;
		case 231:
			Methods.choosePath(110, "Continue");
			break;
		case 232:
			if (character.equipment.search("Sword", false) != -1) {
				Methods.choosePath(320, "Continue");
			} else {
				Methods.choosePath(286, "Continue");
			}
			break;
		case 233:
			character.die();
			break;
		case 234:
			if (character.equipment.search("Stilts", true) != -1) {
				Methods.choosePath(183, "Continue");
			} else {
				Methods.choosePath(207, "Continue");
			}
			break;
		case 235:
			Methods.choosePath(73, "Continue");
			break;
		case 236:
			Methods.fight(9, 8, "IMITATOR", 314);
			break;
		case 237:
			Methods.choosePath(12, 100, "Open the door", "Keep going north");
			break;
		case 238:
			character.equipment.add("Iron Helmet");
			Methods.choosePath(291, "Continue"); 
			break;
		case 239:
			Methods.choosePath(102, 344, "Open the door", "Keep walking north");
			break;
		case 240:
			character.gems.add("Emerald");
			Methods.choosePath(34, 89, "Prise out the right eye", "Climb down the idol");
			break;
		case 241:
			Methods.choosePath(393, 291, "Pull back the curtain and walk through the archway", "Continue north");
			break;
		case 242:
			Methods.testSkill(48, 366);
			break;
		case 243:
			Methods.choosePath(400, "Continue");
			break;
		case 244:
			character.knowledge.add("Doppleganger");
			Methods.choosePath(109, "Continue");
			break;
		case 245:
			Methods.fight(12, 15, "PIT FIEND", 258);
			break;
		case 246:
			Methods.choosePath(313, "Continue");
			break;
		case 247:
			Methods.fight(11, 11, "MANTICORE", 364);
			break;
		case 248:
			Methods.choosePath(214, "Continue");
			break;
		case 249:
			Methods.gemSlot();
			break;
		case 250:
			Methods.choosePath(44, 195, 382, "Keep on running", "Turn to attack him with your sword",
					"Tell him you will answer his question");
			break;
		case 251:
			character.equipment.add("Ring of Wishes");
			Methods.choosePath(344, "Continue");
			break;
		case 252:
			Methods.choosePath(90, "Continue");
			break;
		case 253:
			Methods.choosePath(315, "Continue");
			break;
		case 254:
			Methods.fight(7, 11, "ROCK GRUB", 76, 117);
			break;
		case 255:
			character.die();
			break;
		case 256:
			character.equipment.add("Doppelganger Potion");
			Methods.choosePath(188, "Continue");
			break;
		case 257:
			character.equipment.add("Hollow Wooden Tube");
			Methods.choosePath(164, "Continue");
			break;
		case 258:
			Methods.choosePath(95, 248, "Pull the ring", "Leave the pit via the double doors");
			break;
		case 259:
			Methods.choosePath(318, 47, "Run over the bridge", "Dive into the river");
			break;
		case 260:
			Methods.choosePath(166, 140, "Prise out the left eye", "Prise out the right eye");
			break;
		case 261:
			Methods.choosePath(239, "Continue");
			break;
		case 262:
			Methods.choosePath(337, 173, 368, "Drink at the fountain on your left",
					"Drink at the fountain on your right", "Continue your walk north");
			break;
		case 263:
			Methods.choosePath(153, 73, "Open the door", "Continue west");
			break;
		case 264:
			Methods.choosePath(130, 51, 355, "Try to talk to them", "Attack them with your sword",
					"Slip by them unnoticed");
			break;
		case 265:
			Methods.choosePath(122, "Continue");
			break;
		case 266:
			character.equipment.add("Bone");
			Methods.choosePath(305, "Continue");
			break;
		case 267:
			Methods.choosePath(352, 68, "Head west", "Head east.");
			break;
		case 268:
			character.die();
			break;
		case 269:
			character.gems.add("Diamond");
			if (character.states.isEatenRice()) {
				Methods.choosePath(127, "Leave the the hall, taking just the diamond with you");
			} else {
				Methods.choosePath(127, 330, "Leave the the hall, taking just the diamond with you",
						"Eat the rice and drink the water");
			}
			break;
		case 270:
			Methods.choosePath(66, "Continue");
			break;
		case 271:
			character.equipment.search("Shield", true);
			Methods.choosePath(237, "Continue");
			break;
		case 272:
			character.die();
			break;
		case 273:
			character.gems.add("Topaz");
			Methods.choosePath(15, 204, "Get down on all fours and crawl out of the room holding the skull",
					"Replace the skull on the plinth before leaving the room.");
			break;
		case 274:
			Methods.testSkill(238, 359);
			break;
		case 275:
			Methods.testLuck(231, 309);
			break;
		case 276:
			character.die();
			break;
		case 277:
			Methods.choosePath(338, "Continue");
			break;
		case 278:
			Methods.choosePath(134, "Continue");
			break;
		case 279:
			Methods.choosePath(32, "Continue");
			break;
		case 280:
			Methods.choosePath(218, "Continue");
			break;
		case 281:
			character.equipment.add("Monkey Bone Charm");
			character.equipment.add("Mirror");
			character.equipment.add("Dagger");
			Methods.choosePath(399, 192, "Eat the bread",
					"Just take the mirror and charm and return to the tunnel to head north");
			break;
		case 282:
			Methods.choosePath(22, 388, "Head west with the Barbarian", "Decline his offer and head east alone");
			break;
		case 283:
			Methods.choosePath(109, "Continue");
			break;
		case 284:
			if (character.potions.search("Trap Detection", false) != -1) {
				Methods.choosePath(398, "Continue");
			} else {
				Methods.choosePath(57, "Continue");
			}
			break;
		case 285:
			character.gems.add("Ruby");
			Methods.choosePath(237, "Continue");
			break;
		case 286:
			character.equipment.add("Sword");
			character.equipment.add("Long Knife");
			Methods.choosePath(320, "Continue");
			break;
		case 287:
			Methods.gemSlot();
			break;
		case 288:
			Methods.choosePath(64, 221, "Put the ring on", "Continue east with Throm");
			break;
		case 289:
			Methods.testLuck(216, 19);
			break;
		case 290:
			if (Methods.rollDice(2) == 8) {
				Methods.choosePath(152, "The total is equal to 8.");
			} else {
				Methods.choosePath(121, "The total is not equal to 8.");
			}
			break;
		case 291:
			Methods.choosePath(90, "Continue");
			break;
		case 292:
			Methods.choosePath(93, 230, "Open the door", "Keep walking along the tunnel");
			break;
		case 293:
			Methods.choosePath(137, 387, "Continue west, following the two sets of footprints",
					"Head north, following the third set of footprints");
			break;
		case 294:
			Methods.fight(12, 2, "BLOODBEAST", Methods.testLuck(97, 21));
			break;
		case 295:
			Methods.choosePath(206, "Continue");
			break;
		case 296:
			Methods.choosePath(49, 241, "Draw your sword and look round the corner",
					"Walk back to the junction to head north");
			break;
		case 297:
			Methods.choosePath(305, "Continue");
			break;
		case 298:
			Methods.choosePath(304, 279, "Look inside the backpack", "Continue north");
			break;
		case 299:
			if (character.states.isExaminedBarbarian()) {
				Methods.choosePath(41, 83, "Walk towards the alcove", "Close the door and continue west");
			} else {
				Methods.choosePath(126, 41, 83, "Walk over to search the Barbarian", "Walk towards the alcove",
						"Close the door and continue west");
			}
			break;
		case 300:
			Methods.choosePath(141, 327, "Try and smash the mirror again", "Attack the Mirror Demon instead");
			break;
		case 301:
			Methods.choosePath(162, 4, "Crawl back out of the pipe and examine your find",
					"Press on further down the pipe, taking the box with you to examine further");
			break;
		case 302:
			Methods.fight(10, 12, "THROM", 379);
			break;
		case 303:
			Methods.choosePath(262, "Continue");
			break;
		case 304:
			Methods.choosePath(20, "Continue");
			break;
		case 305:
			if (character.equipment.search("Old Bone", true) != -1) {
				Methods.choosePath(253, "Continue");
			} else {
				Methods.choosePath(148, "Continue");
			}
			break;
		case 306:
			character.equipment.clearAll();
			character.gems.clearAll();
			Methods.choosePath(29, "Continue");
			break;
		case 307:
			character.equipment.add("Wooden Mallet");
			character.equipment.add("Iron Spikes");
			Methods.choosePath(263, 136, "Open the west door", "Open the north door");
			break;
		case 308:
			character.gems.add("Garnet");
			Methods.choosePath(316, "Continue");
			break;
		case 309:
			Methods.testLuck(231, 193);
			break;
		case 310:
			Methods.choosePath(339, 262, "Open the door to your left", "Open the door to your right");
			break;
		case 311:
			Methods.choosePath(325, "Continue");
			break;
		case 312:
			Methods.fight(11, 9, "NINJA", 232);
			break;
		case 313:
			Methods.choosePath(32, "Continue");
			break;
		case 314:
			Methods.choosePath(262, "Continue");
			break;
		case 315:
			if ((character.equipment.search("Rope", true) != -1)
					&& (character.equipment.search("Grappling Iron", true) != -1)) {
				Methods.choosePath(129, "Continue");
			} else {
				Methods.choosePath(245, "Continue");
			}
			break;
		case 316:
			Methods.choosePath(296, 241, "Head west into the new tunnel", "Continue north");
			break;
		case 317:
			character.die();
			break;
		case 318:
			if (character.equipment.search("Iron Key", true) != -1) {
				Methods.choosePath(86, "Continue");
			} else {
				Methods.choosePath(276, "Continue");
			}
			break;
		case 319:
			Methods.choosePath(285, "Continue");
			break;
		case 320:
			Methods.choosePath(330, 269, 127, "Eat the rice and drink the water",
					"Rub some of the ointment into your wounds", "Take only the diamond and leave the hall");
			break;
		case 321:
			Methods.choosePath(289, 316, "Continue helping her", "Leave the room and head north up the tunnel");
			break;
		case 322:
			Methods.choosePath(43, "Continue");
			break;
		case 323:
			Methods.choosePath(194, "Continue");
			break;
		case 324:
			if (character.knowledge.search("Doppleganger", false) != -1) {
				Methods.choosePath(256, "Continue");
			} else {
				Methods.choosePath(79, "Continue");
			}
			break;
		case 325:
			character.die();
			break;
		case 326:
			switch (Methods.rollDice(1)) {
			case 1:
			case 2:
				Methods.choosePath(91, "Continue");
				break;
			case 3:
			case 4:
				Methods.choosePath(189, "Continue");
				break;
			case 5:
			case 6:
				Methods.choosePath(380, "Continue");
			}
			break;
		case 327:
			Methods.fight(10, 10, "MIRROR DEMON", 92);
			break;
		case 328:
			Methods.choosePath(125, 99, "Slip out of the chamber through the door in the east wall",
					"Continue the conversation");
			break;
		case 329:
			character.die();
			break;
		case 330:
			character.states.setEatenRice(true);
			if (character.states.isRubbedOintment()) {
				Methods.choosePath(127, "Leave the hall, taking just the diamond with you.");
			} else {
				Methods.choosePath(269, 127, "Rub some of the ointment into your wounds",
						"Leave the hall, taking just the diamond with you");
			}
			break;
		case 331:
			Methods.fight(8, 6, "SKELETON WARRIOR", 71);
			break;
		case 332:
			Methods.testLuck(53, 272);
			break;
		case 333:
			character.die();
			break;
		case 334:
			character.die();
			break;
		case 335:
			Methods.testLuck(67, 101);
			break;
		case 336:
			Methods.choosePath(298, "Continue");
			break;
		case 337:
			character.states.setDrunkFromHagFountain(true);
			if (character.states.isDrunkFromFairyFountain()) {
				Methods.choosePath(368, "Continue north");
			} else {
				Methods.choosePath(173, 368, "Drink from the other fountain", "Continue north");
			}
			break;
		case 338:
			Methods.choosePath(123, 282, "Wear the necklace yourself", "Set off north without the necklace");
			break;
		case 339:
			if (character.equipment.search("Jug of Acid", true) != -1) {
				Methods.choosePath(303, "Continue");
			} else {
				Methods.choosePath(236, "Continue");
			}
			break;
		case 340:
			Methods.choosePath(381, "Continue");
			break;
		case 341:
			if (character.getFood() > 0) {
				Methods.choosePath(367, 38, 169, "Talk to him", "Take the bread and water off his tray",
						"Offer him some of your provisions");
			} else {
				Methods.choosePath(367, 38, "Talk to him", "Take the bread and water off his tray");
			}
			break;
		case 342:
			if (character.equipment.search("Dagger", false) != -1) {
				Methods.choosePath(294, "Continue");
			} else {
				Methods.choosePath(334, "Continue");
			}
			break;
		case 343:
			Methods.choosePath(318, 47, "Run over the bridge", "Dive into the river");
			break;
		case 344:
			Methods.choosePath(229, 107, "Walk through the light", "Walk around the light");
			break;
		case 345:
			Methods.choosePath(252, "Continue");
			break;
		case 346:
			Methods.choosePath(362, "Continue");
			break;
		case 347:
			character.die();
			break;
		case 348:
			Methods.testSkill(225, 159);
			break;
		case 349:
			Methods.fight(12, 15, "PIT FIEND", 258);
			break;
		case 350:
			Methods.choosePath(39, "Continue");
			break;
		case 351:
			if (character.equipment.search("Rope", true) != -1) {
				Methods.choosePath(396, "Continue");
			} else {
				Methods.choosePath(186, "Continue");
			}
			break;
		case 352:
			Methods.choosePath(254, 68, "Fight the ROCK GRUB", "Run back down the junction to head east");
			break;
		case 353:
			Methods.choosePath(325, "Continue");
			break;
		case 354:
			Methods.testSkill(55, 202);
			break;
		case 355:
			Methods.choosePath(110, "Continue");
			break;
		case 356:
			Methods.choosePath(170, 192, "Enter the cavern and investigate", "Continue north along the tunnel");
			break;
		case 357:
			if (character.gems.getNumberOfItems() > 0) {
				Methods.choosePath(255, 332, 180, "Run round the side of its pool towards the tunnel",
						"Throw a gem into its pool", "Attack it with your sword");
			} else {
				Methods.choosePath(255, 180, "Run round the side of its pool towards the tunnel",
						"Attack it with your sword");
			}
			break;
		case 358:
			Methods.choosePath(239, "Continue");
			break;
		case 359:
			character.die();
			break;
		case 360:
			Methods.listEquipment();
			Methods.choosePath(297, 328, 211, "Offer her something from your backpack",
					"Try to talk your way out of giving her anything", "Attack her with your sword");
			break;
		case 361:
			Methods.testLuck(82, 377);
			break;
		case 362:
			Methods.choosePath(264, "Continue");
			break;
		case 363:
			Methods.choosePath(302, "Continue");
			break;
		case 364:
			if (character.gems.search("Emerald", true) != -1) {
				Methods.choosePath(31, "Continue");
			} else {
				Methods.choosePath(3, "Continue");
			}
			break;
		case 365:
			Methods.choosePath(290, 191, 84, "Guess that it will be the same",
					"Guess that it will total less than eight", "Guess that it will total more than eight");
			break;
		case 366:
			character.die();
			break;
		case 367:
			Methods.choosePath(244, 109, "Pay for the old man's advice", "Wish him well and continue west");
			break;
		case 368:
			Methods.choosePath(165, 234, "Buy the stilts", "Keep walking north");
			break;
		case 369:
			Methods.fight(10, 11, "CAVE TROLL", 288);
			break;
		case 370:
			Methods.testSkill(104, 342);
			break;
		case 371:
			Methods.testSkill(273, 113);
			break;
		case 372:
			character.die();
			break;
		case 373:
			Methods.choosePath(13, "Continue");
			break;
		case 374:
			Methods.testLuck(118, 295);
			break;
		case 375:
			character.equipment.add("Jug of Acid");
			Methods.choosePath(110, "Continue");
			break;
		case 376:
			if (character.gems.search("Diamond", true) != -1) {
				Methods.choosePath(62, "Continue");
			} else {
				Methods.choosePath(3, "Continue");
			}
			break;
		case 377:
			Methods.choosePath(203, "Continue");
			break;
		case 378:
			Methods.testLuck(112, 209);
			break;
		case 379:
			Methods.choosePath(213, 145, "Walk straight into the tunnel", "Take a punch at the Dwarf");
			break;
		case 380:
			Methods.fight(5, 5, "First ORC", 257);
			Methods.fight(6, 4, "Second ORC", 257);
			break;
		case 381:
			Methods.choosePath(331, 128, "Take the parchment from the skeleton", "Walk over to the alcove");
			break;
		case 382:
			Methods.choosePath(144, 227, 391, "100 pounds", "150 pounds", "200 pounds");
			break;
		case 383:
			Methods.choosePath(188, "Continue");
			break;
		case 384:
			Methods.choosePath(277, "Continue");
			break;
		case 385:
			Methods.choosePath(318, 47, "Run over the bridge", "Dive into the river");
			break;
		case 386:
			Methods.choosePath(218, "Continue");
			break;
		case 387:
			Methods.fight(7, 7, "CAVEMAN", 114);
			break;
		case 388:
			Methods.choosePath(23, 154, "Pull it off the wall to see whether there is a message written on it",
					"Hurry back the tunnel to join the Barbarian");
			break;
		case 389:
			character.equipment.search("Sword", true);
			Methods.choosePath(181, "Continue");
			break;
		case 390:
			character.gems.add("Topaz");
			Methods.choosePath(15, 204, "Crawl out of the room holding the skull",
					"Replace the skull on the plinth before leaving the room");
			break;
		case 391:
			Methods.choosePath(100, "Continue");
			break;
		case 392:
			Methods.gemSlot();
			break;
		case 393:
			Methods.choosePath(274, 291, "Walk across the tightrope to reach the helmet",
					"Return to the tunnel to continue north");
			break;
		case 394:
			Methods.choosePath(59, 14, "Head west", "Return to the junction to head north");
			break;
		case 395:
			Methods.choosePath(259, "Continue");
			break;
		case 396:
			Methods.choosePath(151, 34, "Prise out the left eye", "Prise out the right eye");
			break;
		case 397:
			character.potions.add("Trap Detection");
			if (character.knowledge.search("Bloodbeast", false) != -1) {
				Methods.choosePath(369, "Continue north with Throm");
			} else {
				Methods.choosePath(52, 369, "Open the red book", "Continue north with Throm");
			}
			break;
		case 398:
			Methods.choosePath(230, "Continue");
			break;
		case 399:
			Methods.choosePath(192, "Continue");
		}
	}
}
