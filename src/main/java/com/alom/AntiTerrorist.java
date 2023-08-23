package com.alom;

public class AntiTerrorist implements Player {
	
	  private final String TASK;
	 private String weapon;
	 
	 public AntiTerrorist() {
			TASK = "DIFFUSE BOMB";
		}
	
	@Override
	public void assignWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
	public void mission() {
		System.out.println("Anti Terrorist "+ TASK + " | with weapon " + weapon);
	}

}
