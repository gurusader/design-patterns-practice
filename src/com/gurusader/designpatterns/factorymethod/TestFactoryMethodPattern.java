package com.gurusader.designpatterns.factorymethod;

public class TestFactoryMethodPattern {
	public static void main(String[] args) {
		CarFactory ferrariFactory = new FerrariFactory();

		Car ferrari488 = ferrariFactory.create("Ferrari 488 GTB", "V8 twin turbo");
		ferrari488.run();

		Car ferrari458 = ferrariFactory.create("Ferrari 458 Italia", "V8 natural aspirated");
		ferrari458.run();
	}
}
