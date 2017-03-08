package com.gurusader.designpatterns.abstractfactory;

// ConcreteProduct
public class Ferrari extends Car {
	Ferrari(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println(getModel() + " is running.");
	}
}
