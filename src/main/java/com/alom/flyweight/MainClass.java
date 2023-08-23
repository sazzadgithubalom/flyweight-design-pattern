package com.alom.flyweight;

import com.alom.Player;
import com.alom.utility.Utility;

public class MainClass {
    private static String[] playerType = {"Terrorist", "AntiTerrorist"};
    private static String[] weapons = {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};
  
  
    public static void main(String args[]) {
        for (int i = 0; i < 10; i++) {
            Player player = PlayerFactory.getPlayer(Utility.getRandPlayerType(playerType));
            player.assignWeapon(Utility.getRandWeapon(weapons));
  
            player.mission();
            System.out.println(player);
        }
    }
   
}

