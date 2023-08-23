package com.alom.flyweight;

import java.util.HashMap;

import com.alom.AntiTerrorist;
import com.alom.Player;
import com.alom.Terrorist;

public class PlayerFactory {

    private static HashMap <String, Player> playerMap =  new HashMap<>();

    public static Player getPlayer(String type) {
        Player p = null;
        if (playerMap.containsKey(type)) {
                p = playerMap.get(type);
        }
        else {
        	if (type.equals("Terrorist")) {
        		p = new Terrorist();
            	System.out.println("Terrorist Has Been Created");
			}else {
				p = new AntiTerrorist();
            	System.out.println("Anti Terrorist Has Been Created");
			}
 
            playerMap.put(type, p);
        }
        return p;
    }
}
