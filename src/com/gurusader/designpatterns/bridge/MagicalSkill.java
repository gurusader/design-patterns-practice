package com.gurusader.designpatterns.bridge;

// ConcreteImplementor
public class MagicalSkill implements Skill {
	@Override
	public void invoke() {
		System.out.println("Magical skill is invoked.");
	}
}
