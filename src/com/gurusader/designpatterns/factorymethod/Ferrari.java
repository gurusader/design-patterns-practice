package com.gurusader.designpatterns.factorymethod;

// ConcreteProduct
public final class Ferrari extends Car {
	Ferrari(String model, String engine) {
		super(model, engine);
	}

	@Override
	public void run() {
		System.out.println(getModel() + " runs using " + getEngine() + " engine.");
	}
}
