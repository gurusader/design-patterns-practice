package com.gurusader.designpatterns.bridge;

// RefinedAbstraction
public class Magician extends Hero {
	public Magician(Skill skill) {
		super(skill);
	}

	@Override
	public void useSkill() {
		skill.invoke();
	}
}
