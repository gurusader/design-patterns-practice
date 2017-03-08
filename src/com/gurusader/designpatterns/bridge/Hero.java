package com.gurusader.designpatterns.bridge;

// Abstraction
public abstract class Hero {
	protected Skill skill;

	protected Hero(Skill skill) {
		this.skill = skill;
	}

	public abstract void useSkill();
}
