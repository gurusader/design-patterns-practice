package com.gurusader.designpatterns.factorymethod;

// ConcreteCreator
public class FerrariFactory extends CarFactory {
	@Override
	protected Car createCar(String model, String color) {
		return new Ferrari(model, color);
	}

	@Override
	protected void testCar(Car car) {
		System.out.println("Test " + car.getModel() + " on Maranello circuit.");
	}
}
