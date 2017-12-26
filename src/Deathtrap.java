
public class Deathtrap {
	static void pageMethods() {
		switch (Window.character.getPage()) {
		case 0:
			Methods.choosePath(new String[] {"Enter Deathtrap Dungeon"});
			Methods.pages = new int[] {1};
			break;
		case 1:
			Methods.choosePath(new String[] {"Open the box", "Continue walking north"});
			Methods.pages = new int[] {270, 66};
			break;
/*
		case 2:
			return Methods.die();

		case 3:
			return Methods.die();

		case 4:
			return Methods.die();

		case 5:
			return Methods.testLuck(185, 395);

		case 6:
			return Methods.fight(11, 11, 364, "MANTICORE", 0);

		case 7:
			return Methods.die();

		case 8:
			return Methods.die();

		case 9:
			return Methods.choosePath(158, 375, "Drink it", "Dip a piece of cloth in it");

		case 10:
			if (equipment[0]) {
				return 86;
			} else {
				return 276;
			}

		case 11:
			gems[1] = true;
			return Methods.choosePath(140, 46, "Prise out the right eye", "Climb down the idol");

		case 12:
			return Methods.choosePath(382, 195, 250, "Wait for his question", "Attack him with your sword?",
					"Make a run for the door");

		case 13:
			return Methods.choosePath(147, 182, "Drink the liquid", "Don't risk it and continue north.");

		case 14:
			return Methods.choosePath(157, 310, "Try and open the casket", "Continue north.");

		case 15:
			return 74;

		case 16:
			return Methods.gemSlot();

		case 17:
			return Methods.die();

		case 18:
			return Methods.testSkill(55, 202);

		case 19:
			return Methods.die();

		case 20:
			return 279;

		case 21:
			return Methods.fight(12, 2, Methods.testLuck(97, 116), "BLOODBEAST", 0);

		case 22:
			return Methods.choosePath(63, 184, 311, "Accept the Barbarian's offer",
					"Offer to lower him down if he is so eager to investigate the pit",
					"Suggest you both jump over the pit instead");

		case 23:
			return 154;

		case 24:
			return Methods.choosePath(324, 188, "Sit in the chair", "Keep going north");

		case 25:
			return 197;

		case 26:
			return Methods.testSkill(55, 202);

		case 27:
			return 78;

		case 28:
			equipment[17] = true;
			return 213;

		case 29:
			return 90;

		case 30:
			return Methods.testLuck(160, 319);

		case 31:
			if (gems[1]) {
				return 376;
			} else {
				return 3;
			}

		case 32:
			return 37;

		case 33:
			equipment[3] = true;
			equipment[14] = true;
			equipment[6] = true;
			return 292;

		case 34:
			return Methods.die();

		case 35:
			return Methods.choosePath(333, 124, "Knock on the trapdoor",
					"Burst through the trapdoor with your sword drawn");

		case 36:
			return Methods.testSkill(340, 7);

		case 37:
			return Methods.choosePath(351, 239, "Climb the idol to take the jewels",
					"Walk through the cavern to the tunnel in the opposite wall");

		case 38:
			return 109;

		case 39:
			return Methods.fight(7, 8, 111, "GIANT FLY", 267);

		case 40:
			return Methods.fight(9, 9, 163, "MINOTAUR", 0);

		case 41:
			if (check[0]) {
				return Methods.choosePath(98, 83, "Drink the liquid", "Leave the chamber to continue west");
			} else {
				return Methods.choosePath(98, 126, 83, "Drink the red liquid",
						"Leave the globlet and walk over to search the Barbarian",
						"Leave the chamber to continue west.");
			}

		case 42:
			return Methods.testSkill(55, 202);

		case 43:
			return Methods.choosePath(200, 316, "Open the door", "Continue north.");

		case 44:
			return Methods.die();

		case 45:
			return 312;

		case 46:
			return 239;

		case 47:
			if (equipment[13]) {
				return 10;
			} else {
				return 335;
			}

		case 48:
			return 197;

		case 49:
			return Methods.choosePath(205, 241, "Follow them", "Walk back to the last junction to head north.");

		case 50:
			return 221;

		case 51:
			return Methods.fight(6, 5, 9, "HOBGOBLIN", 0);

		case 52:
			knowledge[2] = true;
			if (check[5]) {
				return 369;
				// TODO You walk back to the last junction to continue north.
			} else {
				return Methods.choosePath(138, 369, "Open the black book",
						"Walk back to the last junction to head north.");
			}

		case 53:
			return Methods.choosePath(370, 348, "Run around the pool towards the tunnel",
					"Attack the Bloodbeast with your sword.");

		case 54:
			equipment[10] = true;
			return 239;

		case 55:
			String test = Methods.input();
			switch (test) {
			default:
				return 347;

			case "SCORPION":
				return 143;

			case "MINOTAUR":
				return 40;

			}

		case 56:
			return Methods.choosePath(373, 215, "Try and climb over it", "Slice it open with your sword.");

		case 57:
			return 198;

		case 58:
			return Methods.testSkill(80, 246);

		case 59:
			return Methods.choosePath(341, 283, "Stand your ground with your sword drawn", "Hide in the shadows.");

		case 60:
			return Methods.choosePath(179, 365, "Join Throm in attacking the Dwarf",
					"Persuade Throm to go through with the Dwarf's test.");

		case 61:
			return Methods.die();

		case 62:
			return Methods.gemSlot();

		case 63:
			return 194;

		case 64:
			return Methods.testSkill(115, 190);

		case 65:
			if (potions[1]) {
				return 345;
			} else {
				return 372;
			}

		case 66:
			return Methods.choosePath(293, 119, "West", "East.");

		case 67:
			return Methods.testLuck(146, 219);

		case 68:
			return Methods.choosePath(271, 30, 212, "Throw your shield over the pit and jump after it",
					"Jump over the pit carrying all your possessions",
					"Reach for the rope with your sword to enable you to swing across the pit.");

		case 69:
			return 305;

		case 70:
			return Methods.die();

		case 71:
			knowledge[0] = true;
			return 128;

		case 72:
			return 122;

		case 73:
			if (check[0]) {
				return 83;// TODO You leave the chamber to continue west.
			} else {
				return Methods.choosePath(126, 83, "Walk back to examine the Barbarian",
						"Leave the chamber to continue west.");
			}

		case 74:
			if (equipment[1]) {
				return Methods.choosePath(265, 300, 327, "Make a wish", "Try to smash the mirrors",
						"Attack the Mirror Demon with you sword.");
			} else {
				return Methods.choosePath(300, 327, "Try to smash the mirrors, ",
						"Attack the Mirror Demon with your sword.");
			}

		case 75:
			check[2] = true;
			if (knowledge[2]) {
				return 369;// TODO You continue north with Throm.
			} else {
				return Methods.choosePath(52, 369, "Open the red book", "Continue north with Throm.");
			}

		case 76:
			return Methods.choosePath(317, 117, "Explore the borehole", "Walk west along the tunnel.");

		case 77:
			return 400;

		case 78:
			return Methods.choosePath(301, 142, "Crawl down the pipe", "Continue north.");

		case 79:
			return Methods.testLuck(106, 383);

		case 80:
			return 313;

		case 81:
			return Methods.choosePath(307, 263, 136, "Open the cupboard", "Open the west door", "Open the north door.");

		case 82:
			return 214;

		case 83:
			return 37;

		case 84:
			if (Methods.rollDice(2) > 8) {
				return 152;
			} else {
				return 121;
			}

		case 85:
			return Methods.die();

		case 86:
			return 187;

		case 87:
			return 381;

		case 88:
			return Methods.choosePath(343, 268, "Take part in the Run of the Arrow", "Try to fight your way out.");

		case 89:
			return Methods.testLuck(54, 261);

		case 90:
			if (knowledge[2]) {
				return 172;
			} else {
				return 357;
			}

		case 91:
			Methods.fight(5, 5, 257, "FIRST ORC", 0);
			Methods.fight(6, 4, 257, "SECOND ORC", 0);
			System.out.println(Methods.alterScores(4, "SKILL"));
			oldEquip[0] = true;
			return 257;

		case 92:
			return 122;

		case 93:
			return Methods.choosePath(284, 230, "Enter the room and open the chest", "Keep walking down the tunnel.");

		case 94:
			return 174;

		case 95:
			equipment[18] = true;
			return 248;

		case 96:
			return Methods.die();

		case 97:
			return 134;

		case 98:
			return Methods.testLuck(105, 235);

		case 99:
			return Methods.choosePath(266, 305, "Search her room", "Leave by the door in the east wall");// TODO
																											// You
																											// find
																											// yourself
																											// standing
																											// at
																											// the
																											// end
																											// of
																											// a
																											// tunnel.

		case 100:
			return Methods.choosePath(87, 217, "Open the door", "Keep walking north.");

		case 101:
			return Methods.die();

		case 102:
			return Methods.choosePath(133, 251, "Shout: Hail, Sukumvit", "Shout: Sukumvit is a worm?");

		case 103:
			return 77;

		case 104:
			return 134;

		case 105:
			if (check[0]) {
				return 83;
			} else {
				return 126;
			}
			// TODO You leave the chamber to continue west

		case 106:
			potions[2] = true;
			return 188;

		case 107:
			return Methods.choosePath(168, 267, "Try the door", "Continue along the tunnel.");

		case 108:
			return Methods.choosePath(394, 59, 14, "Break the glass and try to snatch the crown", "Continue west",
					"Return to the junction to head north.");

		case 109:
			return Methods.choosePath(43, 24, "Keep heading west", "Go north");

		case 110:
			return Methods.choosePath(58, 223, "Step between the poles", "Walk across the top of the poles");

		case 111:
			return 267;

		case 112:
			return 356;

		case 113:
			if (woodenBalls > 0) {
				return Methods.choosePath(372, 74, "Try again with the other ball",
						"Close the door and continue west along the tunnel");
			} else {
				return 74;// TODO You have already thrown twice, so you close
							// the door and continue west along the tunnel.
			}

		case 114:
			return Methods.choosePath(336, 298, "Put it on your own wrist", "Set off north again.");

		case 115:
			return 221;

		case 116:
			return Methods.die();

		case 117:
			return Methods.choosePath(329, 135, "Take a closer look in the mirror",
					"Make the long walk back to the last junction to head north.");

		case 118:
			return 60;

		case 119:
			return Methods.choosePath(56, 293, "Continue east", "Go back to the junction to head west");

		case 120:
			return Methods.choosePath(228, 292, "Reach down for them", "Ignore them and continue north");

		case 121:
			return Methods.choosePath(26, 354, "Swallow the pill stamped with the letter S", "Swallow the other pill");

		case 122:
			return Methods.choosePath(176, 384, "Climb the left-hand flight of steps", "Climb the right-hand flight");

		case 123:
			return 282;

		case 124:
			return Methods.doubleFight(5, 4, 5, 5, "First GOBLIN", "Second GOBLIN", 81);

		case 125:
			return Methods.testLuck(69, 139);

		case 126:
			if (check[1]) {
				return Methods.choosePath(226, 83, "Eat the dried meat", "Leave the chamber and head west");
			} else {
				return Methods.choosePath(226, 41, 83, "Eat the dried meat",
						"Leave the meat and walk over to the alcove", "Leave the chamber and head west");
			}

		case 127:
			gems[2] = true;
			return 90;

		case 128:
			return Methods.choosePath(35, 233, "Step through the archway", "Stop to eat some of the mushrooms");

		case 129:
			if (equipment[2]) {
				return Methods.choosePath(349, 361, 167, "Lower yourself down on the rope to fight the PIT FIEND",
						"Throw your bone monkey charm into the pit",
						"Try to hook the PIT FIEND with the grappling iron while sitting on top of the wall");
			} else {
				return Methods.choosePath(349, 167, "Lower yourself down on the rope to fight the PIT FIEND",
						"Try to hook the PIT FIEND with the grappling iron while sitting on top of the wall");
			}

		case 130:
			Methods.fight(7, 5, 9, "First HOBGOBLIN", 0);
			return Methods.fight(6, 5, 9, "Second HOBGOBLIN", 0);

		case 131:
			return 74;

		case 132:
			return Methods.gemSlot();

		case 133:
			return Methods.testSkill(178, 17);

		case 134:
			if (knowledge[0]) {
				return 222;
			} else {
				return 247;
			}

		case 135:
			return 68;

		case 136:
			return Methods.choosePath(210, 78, "Open the door", "Continue north");

		case 137:
			return Methods.choosePath(220, 362, "Ring the bell", "Walk around it and continue west");

		case 138:
			if (knowledge[2]) {
				return Methods.choosePath(397, 75, 369, "Drink the liquid", "Rub the liquid into your wounds",
						"Leave the bottle and book and continue north with Throm");
			} else {
				return Methods.choosePath(397, 75, 52, 369, "Drink the liquid", "Rub the liquid into your wounds",
						"Open the red book", "Leave the bottle and book and continue north with Throm");
			}

		case 139:
			return Methods.fight(9, 9, 201, "IVY", 0);

		case 140:
			return Methods.die();

		case 141:
			return Methods.testSkill(72, 96);

		case 142:
			return 338;

		case 143:
			return Methods.doubleFight(10, 10, 10, 10, "LEFT PINCER", "RIGHT PINCER", 163);

		case 144:
			return 85;

		case 145:
			return Methods.fight(8, 6, 28, "DWARF", 0);

		case 146:
			if (equipment[0]) {
				return 86;
			} else {
				return 276;
			}

		case 147:
			potions[0] = true;
			return 182;

		case 148:
			Methods.fight(7, 7, 175, "First GUARD DOG", 0);
			return Methods.fight(7, 8, 175, "Second GUARD DOG", 315);

		case 149:
			return Methods.testLuck(70, 353);

		case 150:
			equipment[3] = true;
			equipment[6] = true;
			equipment[14] = true;
			return 292;

		case 151:
			Methods.fight(7, 8, 240, "First FLYING GUARDIAN", 0);
			Methods.fight(8, 8, 240, "Second FLYING GUARDIAN", 0);
			System.out.println(Methods.alterScores(2, "SKILL"));
			return 240;

		case 152:
			return Methods.testSkill(55, 202);

		case 153:
			woodenBalls = 2;
			return Methods.choosePath(390, 371, 74, "Walk into the room and pick up the skull",
					"Throw a wooden ball at the skull from the doorway",
					"Close the door and continue west, taking the wooden balls with you");
		case 154:
			return 22;

		case 155:
			return Methods.choosePath(378, 322, "Dive into the water", "Walk back down the tunnel");

		case 156:
			return Methods.choosePath(208, 326, "Open the door, jump over the pit and take the rope",
					"Continue north along the tunnel");

		case 157:
			gems[3] = true;
			return 310;

		case 158:
			return 275;

		case 159:
			if (equipment[19]) {
				return 294;
			} else {
				return 334;
			}

		case 160:
			return 237;

		case 161:
			for (int i = 0; i < gems.length; i++) {
				gems[i] = false;
			}
			return 29;

		case 162:
			gems[1] = true;
			return 142;

		case 163:
			return Methods.choosePath(363, 302, "Eat and drink the Dwarf's offerings", "Sit down and await his return");

		case 164:
			return Methods.choosePath(299, 83, "Open the door", "Keep going west");

		case 165:
			equipment[8] = true;
			return 234;

		case 166:
			Methods.fight(7, 8, 11, "First FLYING GUARDIAN", 0);
			Methods.fight(8, 8, 11, "Second FLYING GUARDIAN", 0);
			System.out.println(Methods.alterScores(3, "SKILL"));
			return 11;

		case 167:
			return 203;

		case 168:
			return Methods.choosePath(94, 267, "Reach for the dagger", "Back away in disgust and leave the cavern");

		case 169:
			knowledge[3] = true;
			return 109;

		case 170:
			return Methods.choosePath(281, 192, "Help her",
					"Leave her to defend herself and walk back to the tunnel to head north");

		case 171:
			equipment[10] = true;
			return 326;

		case 172:
			return Methods.fight(12, 4, 278, "BLOODBEAST", 0);

		case 173:
			if (check[4]) {
				return 368;
			} else {
				return 337;
			}
			// TODO You continue north

		case 174:
			return Methods.testLuck(39, 350);

		case 175:
			return 315;

		case 176:
			return 277;
		case 177:
			return Methods.testLuck(243, 103);

		case 178:
			return 344;

		case 179:
			return Methods.choosePath(290, 191, 84, "Guess that it will be the same",
					"Guess that it will total less than eight", "Guess that it will total more than eight");

		case 180:
			return Methods.testLuck(53, 272);

		case 181:
			return Methods.testLuck(312, 45);

		case 182:
			if (potions[0]) {
				return 25;
			} else {
				return 242;
			}

		case 183:
			equipment[8] = false;
			return Methods.choosePath(386, 218, "Go west", "Continue north");

		case 184:
			return Methods.choosePath(323, 149, "Stay with the Barbaian and head north down the lower tunnel",
					"Abandon him by jumping over the pit to head west");

		case 185:
			return Methods.choosePath(318, 47, "Run over the bridge", "Dive into the river");

		case 186:
			return Methods.testLuck(260, 358);

		case 187:
			return Methods.choosePath(360, 280, "Give the man something from your backpack for his services",
					"Walk past him down the tunnel");

		case 188:
			if (knowledge[1]) {
				return 155;
			} else {
				return 224;
			}

		case 189:
			Methods.fight(5, 5, 257, "First ORC", 0);
			return Methods.fight(6, 4, 257, "Second ORC", 0);

		case 190:
			return 50;

		case 191:
			if (Methods.rollDice(2) < 8) {
				return 152;
			} else {
				return 121;
			}

		case 192:
			return Methods.choosePath(120, 292, "Stop and lift it up", "Keep walking");

		case 193:
			return Methods.die();

		case 194:
			return Methods.choosePath(52, 138, 369, "Open the red leather book", "Open the black leather book",
					"Continue north along the tunnel");

		case 195:
			return 382;

		case 196:
			return Methods.fight(11, 11, 364, "MANTICORE", 0);

		case 197:
			return Methods.choosePath(171, 156, 326, "Try to open the door", "Slide the iron plate",
					"Continue north up the tunnel");

		case 198:
			return 230;

		case 199:
			return 74;

		case 200:
			return Methods.choosePath(321, 316, "Pull the drape up",
					"Leave the room and continue north along the tunnel");

		case 201:
			equipment[5] = true;
			return 305;

		case 202:
			return Methods.testLuck(18, 42);

		case 203:
			return Methods.fight(12, 15, 258, "PIT FIEND", 0);

		case 204:
			return Methods.testLuck(131, 199);

		case 205:
			return Methods.choosePath(306, 161, "Attack them", "Try to walk past them");

		case 206:
			return 60;

		case 207:
			return Methods.choosePath(386, 218, "Go west", "Continue north");

		case 208:
			equipment[10] = true;
			return 326;

		case 209:
			Methods.listEquipment("lose");
			return 356;

		case 210:
			return Methods.choosePath(27, 78, "Cut him free from his chains", "Leave the room to head north.");

		case 211:
			return Methods.fight(9, 9, 201, "IVY", 201);

		case 212:
			return 285;

		case 213:
			return Methods.choosePath(108, 14, "Walk west to investigate who or what is making the noise",
					"Continue north");

		case 214:
			return Methods.choosePath(389, 181, "Abandon any weapons before continuing north",
					"Ignore the notice and carry on north");

		case 215:
			return 13;

		case 216:
			return Methods.choosePath(308, 316,
					"Enter her cage with your eyes closed to dispose of her with your sword",
					"Retreat out of the room with your eyes closed to continue north");

		case 217:
			oldEquip[2] = false;
			return 36;

		case 218:
			return Methods.choosePath(65, 252, "Enter the room and take the jewel", "Continue north");

		case 219:
			return Methods.die();

		case 220:
			return Methods.choosePath(61, 346, "Scream as loud as you can", "Try to deaden the bell with your boot");

		case 221:
			return Methods.choosePath(374, 60, "Search the chamber", "Head straight for the archway");

		case 222:
			if (oldEquip[2]) {
				return 196;
			} else {
				return 6;
			}

		case 223:
			return 313;

		case 224:
			return 43;

		case 225:
			return Methods.fight(12, 2, Methods.testLuck(97, 21), "BLOODBEAST", 0);

		case 226:
			if (check[1]) {
				return 83;
			} else {
				return 41;
			}
			// TODO You leave the chamber to continue west

		case 227:
			return 85;

		case 228:
			return Methods.testLuck(150, 33);

		case 229:
			knowledge[1] = true;
			return 107;

		case 230:
			if (potions[2]) {
				Methods.choosePath(88, 5, 385, "Walk up to them", "Try to creep past them",
						"Drink a Doppelganger Potion");
			} else {
				Methods.choosePath(88, 5, "Walk up to them", "Try to creep past them");
			}

		case 231:
			return 110;

		case 232:
			if (oldEquip[0]) {
				return 320;
			} else {
				return 286;
			}

		case 233:
			return Methods.die();

		case 234:
			if (equipment[8]) {
				return 183;
			} else {
				return 207;
			}

		case 235:
			return 73;

		case 236:
			return Methods.fight(9, 2, 314, "IMITATOR", 0);

		case 237:
			return Methods.choosePath(12, 100, "Open the door", "Keep going north");

		case 238:
			equipment[15] = true;
			return 291;

		case 239:
			return Methods.choosePath(102, 344, "Open the door", "Keep walking north");

		case 240:
			return Methods.choosePath(34, 89, "Prise out the right eye", "Climb down the idol");

		case 241:
			return Methods.choosePath(393, 291, "Pull back the curtain and walk through the archway", "Continue north");

		case 242:
			return Methods.testSkill(48, 366);

		case 243:
			return 400;

		case 244:
			knowledge[3] = true;
			return 109;

		case 245:
			return Methods.fight(12, 15, 258, "PIT FIEND", 0);

		case 246:
			return 313;

		case 247:
			return Methods.fight(11, 11, 364, "MANTICORE", 0);

		case 248:
			return 214;

		case 249:
			return Methods.gemSlot();

		case 250:
			return Methods.choosePath(44, 195, 382, "Keep on running", "Turn to attack him with your sword",
					"Tell him you will answer his question");

		case 251:
			equipment[1] = true;
			return 344;

		case 252:
			return 90;

		case 253:
			equipment[5] = false;
			return 315;

		case 254:
			return Methods.fight(7, 11, 76, "ROCK GRUB", 0);

		case 255:
			return Methods.die();

		case 256:
			potions[2] = true;
			return 188;

		case 257:
			equipment[13] = true;
			return 164;

		case 258:
			return Methods.choosePath(95, 248, "Pull the ring", "Leave the pit via the double doors");

		case 259:
			return Methods.choosePath(318, 47, "Run over the bridge", "Dive into the river");

		case 260:
			return Methods.choosePath(166, 140, "Prise out the left eye", "Prise out the right eye");

		case 261:
			return 239;

		case 262:
			return Methods.choosePath(337, 173, 368, "Drink at the fountain on your left",
					"Drink at the fountain on your right", "Continue your walk north");

		case 263:
			return Methods.choosePath(153, 73, "Open the door", "Continue west");

		case 264:
			return Methods.choosePath(130, 31, 155, "Try to talk to them", "Attack them with your sword",
					"Slip by them unnoticed");

		case 265:
			equipment[1] = false;
			return 122;

		case 266:
			equipment[5] = true;
			return 305;

		case 267:
			return Methods.choosePath(352, 68, "Head west", "Head east.");

		case 268:
			return Methods.die();

		case 269:
			if (check[5]) {
				return 127;// TODO You leave the hall, taking the diamond with
							// you.
			} else {
				return Methods.choosePath(127, 330, "Leave the the hall, taking just the diamond with you",
						"Eat the rice and drink the water");
			}

		case 270:
			return 66;

		case 271:
			oldEquip[2] = false;
			return 237;

		case 272:
			return Methods.die();

		case 273:
			gems[6] = true;
			return Methods.choosePath(15, 204, "Get down on all fours and crawl out of the room holding the skull",
					"Replace the skull on the plinth before leaving the room.");

		case 274:
			return Methods.testSkill(238, 359);

		case 275:
			return Methods.testLuck(231, 309);

		case 276:
			return Methods.die();

		case 277:
			return 338;

		case 278:
			return 134;

		case 279:
			return 32;

		case 280:
			return 218;

		case 281:
			equipment[19] = true;
			equipment[2] = true;
			equipment[4] = true;
			return Methods.choosePath(399, 192, "Eat the bread",
					"Just take the mirror and charm and return to the tunnel to head north");

		case 282:
			return Methods.choosePath(22, 388, "Head west with the Barbarian", "Decline his offer and head east alone");

		case 283:
			return 109;

		case 284:
			if (potions[1]) {
				return 398;
			} else {
				return 57;
			}

		case 285:
			gems[4] = true;
			return 237;

		case 286:
			equipment[16] = true;
			return 320;

		case 287:
			return Methods.gemSlot();

		case 288:
			return Methods.choosePath(64, 221, "Put the ring on", "Continue east with Throm");

		case 289:
			return Methods.testLuck(216, 19);

		case 290:
			if (Methods.rollDice(2) == 8) {
				return 152;
			} else {
				return 121;
			}

		case 291:
			return 90;

		case 292:
			return Methods.choosePath(93, 230, "Open the door", "Keep walking along the tunnel");

		case 293:
			return Methods.choosePath(137, 387, "Continue west, following the two sets of footprints",
					"Head north, following the third set of footprints");

		case 294:
			return Methods.fight(12, 2, Methods.testLuck(97, 21), "BLOODBEAST", 0);

		case 295:
			return 206;

		case 296:
			return Methods.choosePath(49, 241, "Draw your sword and look round the corner",
					"Walk back to the junction to head north");

		case 297:
			return 305;

		case 298:
			return Methods.choosePath(304, 279, "Look inside the backpack", "Continue north");

		case 299:
			return Methods.choosePath(126, 41, 83, "Walk over to search the Barbarian", "Walk towards the alcove",
					"Close the door and continue west");

		case 300:
			return Methods.choosePath(141, 327, "Try and smash the mirror again", "Attack the Mirror Demon instead");

		case 301:
			return Methods.choosePath(162, 4, "Crawl back out of the pipe and examine your find",
					"Press on further down the pipe, taking the box with you to examine further");

		case 302:
			return Methods.fight(10, 12, 379, "THROM", 0);

		case 303:
			return 262;

		case 304:
			return 20;

		case 305:
			if (equipment[5]) {
				return 253;
			} else {
				return 148;
			}

		case 306:
			for (int i = 0; i < equipment.length; i++) {
				equipment[i] = false;
			}
			for (int i = 0; i < gems.length; i++) {
				gems[i] = false;
			}
			return 29;

		case 307:
			equipment[11] = true;
			equipment[12] = true;
			return Methods.choosePath(263, 136, "Open the west door", "Open the north door");

		case 308:
			gems[5] = true;
			return 316;

		case 309:
			return Methods.testLuck(231, 193);

		case 310:
			return Methods.choosePath(339, 262, "Open the door to your left", "Open the door to your right");

		case 311:
			return 325;

		case 312:
			return Methods.fight(11, 9, 232, "NINJA", 0);

		case 313:
			return 32;

		case 314:
			return 262;

		case 315:
			if (equipment[10] && equipment[14]) {
				return 129;
			} else {
				return 245;
			}

		case 316:
			return Methods.choosePath(296, 241, "Head west into the new tunnel", "Continue north");

		case 317:
			return Methods.die();

		case 318:
			if (equipment[0]) {
				return 86;
			} else {
				return 276;
			}

		case 319:
			return 285;

		case 320:
			return Methods.choosePath(330, 269, 127, "Eat the rice and drink the water",
					"Rub some of the ointment into your wounds", "Take only the diamond and leave the hall");

		case 321:
			return Methods.choosePath(289, 316, "Continue helping her", "Leave the room and head north up the tunnel");

		case 322:
			return 43;

		case 323:
			return 194;

		case 324:
			if (knowledge[3]) {
				return 256;
			} else {
				return 79;
			}

		case 325:
			return Methods.die();

		case 326:
			switch (Methods.rollDice(1)) {
			case 1:
			case 2:
				return 91;

			case 3:
			case 4:
				return 189;

			case 5:
			case 6:
				return 380;
			}

		case 327:
			return Methods.fight(10, 10, 92, "MIRROR DEMON", 0);

		case 328:
			return Methods.choosePath(125, 99, "Slip out of the chamber through the door in the east wall",
					"Continue the conversation");

		case 329:
			return Methods.die();

		case 330:
			if (check[6]) {
				return 127; // TODO "You leave the hall, taking just the diamond
							// with you."
			} else {
				return Methods.choosePath(269, 127, "Rub some of the ointment into your wounds",
						"Leave the hall, taking just the diamond with you");
			}

		case 331:
			return Methods.fight(8, 6, 71, "SKELETON WARRIOR", 0);

		case 332:
			return Methods.testLuck(53, 272);

		case 333:
			return Methods.die();

		case 334:
			return Methods.die();

		case 335:
			return Methods.testLuck(67, 101);

		case 336:
			return 298;

		case 337:
			if (check[3]) {
				return 368;// TODO You continue north.
			} else {
				return Methods.choosePath(173, 368, "Drink from the other fountain ", "Continue north");
			}

		case 338:
			return Methods.choosePath(123, 282, "Wear the necklace yourself", "Set off north without the necklace");

		case 339:
			if (equipment[9]) {
				return 303;
			} else {
				return 236;
			}

		case 340:
			return 381;

		case 341:
			if (Methods.food > 0) {
				return Methods.choosePath(367, 38, 169, "Talk to him", "Take the bread and water off his tray",
						"Offer him some of your provisions");
			} else {
				return Methods.choosePath(367, 38, "Talk to him", "Take the bread and water off his tray");
			}

		case 342:
			if (equipment[19]) {
				return 294;
			} else {
				return 334;
			}

		case 343:
			return Methods.choosePath(318, 47, "Run over the bridge", "Dive into the river");

		case 344:
			return Methods.choosePath(229, 107, "Walk through the light", "Walk around the light");

		case 345:
			return 252;

		case 346:
			return 362;

		case 347:
			return Methods.die();

		case 348:
			return Methods.testSkill(225, 159);

		case 349:
			return Methods.fight(12, 15, 258, "PIT FIEND", 0);

		case 350:
			return 39;

		case 351:
			if (equipment[10]) {
				return 396;
			} else {
				return 186;
			}

		case 352:
			return Methods.choosePath(254, 68, "Fight the ROCK GRUB", "Run back down the junction to head east");

		case 353:
			return 325;

		case 354:
			return Methods.testSkill(55, 202);

		case 355:
			return 110;

		case 356:
			return Methods.choosePath(170, 192, "Enter the cavern and investigate", "Continue north along the tunnel");

		case 357:
			boolean hasGems = false;
			for (int i = 0; i < gems.length; i++) {
				hasGems = hasGems || gems[i];
			}
			if (hasGems) {
				Methods.choosePath(255, 332, 180, "Run round the side of its pool towards the tunnel",
						"Throw a gem into its pool", "Attack it with your sword");
			} else {
				Methods.choosePath(255, 180, "Run round the side of its pool towards the tunnel",
						"Attack it with your sword");
			}

		case 358:
			return 239;

		case 359:
			return Methods.die();

		case 360:
			Methods.listEquipment("give to the old man");
			return Methods.choosePath(297, 328, 211, "Offer her something from your backpack",
					"Try to talk your way out of giving her anything", "Attack her with your sword");

		case 361:
			return Methods.testLuck(82, 377);

		case 362:
			return 264;

		case 363:
			return 302;

		case 364:
			if (gems[0]) {
				return 31;
			} else {
				return 3;
			}

		case 365:
			return Methods.choosePath(290, 191, 84, "Guess that it will be the same",
					"Guess that it will total less than eight", "Guess that it will total more than eight");

		case 366:
			return Methods.die();

		case 367:
			return Methods.choosePath(244, 109, "Pay for the old man's advice", "Wish him well and continue west");

		case 368:
			return Methods.choosePath(165, 234, "Buy the stilts", "Keep walking north");

		case 369:
			return Methods.fight(10, 11, 288, "CAVE TROLL", 0);

		case 370:
			return Methods.testSkill(104, 342);

		case 371:
			return Methods.testSkill(273, 113);

		case 372:
			return Methods.die();

		case 373:
			return 13;

		case 374:
			return Methods.testLuck(118, 295);

		case 375:
			equipment[9] = true;
			return 110;

		case 376:
			if (gems[2]) {
				return 62;
			} else {
				return 3;
			}

		case 377:
			return 203;

		case 378:
			return Methods.testLuck(112, 209);

		case 379:
			return Methods.choosePath(213, 145, "Walk straight into the tunnel", "Take a punch at the Dwarf");

		case 380:
			Methods.fight(5, 5, 257, "First ORC", 0);
			return Methods.fight(6, 4, 257, "Second ORC", 0);

		case 381:
			return Methods.choosePath(331, 128, "Take the parchment from the skeleton", "Walk over to the alcove");

		case 382:
			return Methods.choosePath(144, 227, 391, "100 pounds", "150 pounds", "200 pounds");

		case 383:
			return 188;

		case 384:
			return 277;

		case 385:
			return Methods.choosePath(318, 47, "Run over the bridge", "Dive into the river");

		case 386:
			return 218;

		case 387:
			return Methods.fight(7, 7, 114, "CAVEMAN", 0);

		case 388:
			return Methods.choosePath(23, 154, "Pull it off the wall to see whether there is a message written on it",
					"Hurry back the tunnel to join the Barbarian");

		case 389:
			oldEquip[0] = false;
			return 181;

		case 390:
			gems[6] = true;
			return Methods.choosePath(15, 204, "Crawl out of the room holding the skull",
					"Replace the skull on the plinth before leaving the room");

		case 391:
			return 100;

		case 392:
			return Methods.gemSlot();

		case 393:
			return Methods.choosePath(274, 291, "Walk across the tightrope to reach the helmet",
					"Return to the tunnel to continue north");

		case 394:
			return Methods.choosePath(59, 14, "Head west", "Return to the junction to head north");

		case 395:
			return 259;

		case 396:
			equipment[10] = false;
			return Methods.choosePath(151, 34, "Prise out the left eye", "Prise out the right eye");

		case 397:
			if (knowledge[2]) {
				return 369; // TODO You continue north with Throm.
			} else {
				Methods.choosePath(52, 369, "Open the red book", "Continue north with Throm");
			}

		case 398:
			return 230;

		case 399:
			return 192;

		case 400:
			return Methods.die();
		}
	*/ } 
	
}
}
