package com.alom.utility;

import java.util.Random;

public class Utility {
	 public static String getRandPlayerType(String[] playerType)
	    {
	        int randPlayer = new Random().nextInt(playerType.length);
	        return playerType[randPlayer];
	    }
	    public static String getRandWeapon(String[] weapons)
	    {
	        int randWeapon = new Random().nextInt(weapons.length);
	        return weapons[randWeapon];
	    }
}
