package com.gurusader.designpatterns.bridge;

// ConcreteImplementor
public class PhysicalSkill implements Skill {
	@Override
	public void invoke() {
		System.out.println("Physical Skill is invoked.");
	}
}
