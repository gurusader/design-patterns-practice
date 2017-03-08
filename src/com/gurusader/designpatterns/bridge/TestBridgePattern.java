package com.gurusader.designpatterns.bridge;

public class TestBridgePattern {
	public static void main(String[] args) {
		Hero magician = new Magician(new MagicalSkill());
		magician.useSkill();

		Hero warrior = new Warrior(new PhysicalSkill());
		warrior.useSkill();
	}
}
