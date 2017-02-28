package com.gurusader.designpatterns.templatemethod;

// AbstractClass
public abstract class Phone {
	public abstract void makeCall();
	public abstract void hangUpCall();

	public final void call() {
		makeCall();
		System.out.println("Conversation");
		hangUpCall();
	}
}
