package com.gurusader.designpatterns.templatemethod;

// ConcreteClass
public class PhysicalButtonPhone extends Phone {
	@Override
	public void makeCall() {
		System.out.println("Click number and call button on physical keypad.");
	}

	@Override
	public void hangUpCall() {
		System.out.println("Click end call button on physical keypad.");
	}
}
