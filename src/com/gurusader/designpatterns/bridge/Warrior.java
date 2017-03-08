package com.gurusader.designpatterns.bridge;

// RefinedAbstraction
public class Warrior extends Hero {
	protected Warrior(Skill skill) {
		super(skill);
	}

	@Override
	public void useSkill() {
		skill.invoke();
	}
}
