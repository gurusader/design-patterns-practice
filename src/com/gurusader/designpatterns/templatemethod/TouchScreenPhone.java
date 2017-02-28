package com.gurusader.designpatterns.templatemethod;

// ConcreteClass
public class TouchScreenPhone extends Phone {
	@Override
	public void makeCall() {
		System.out.println("Touch number and call button on screen keypad.");
	}

	@Override
	public void hangUpCall() {
		System.out.println("Touch end call button on screen keypad.");
	}
}
