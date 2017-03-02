package com.gurusader.designpatterns.factorymethod;

// Creator
public abstract class CarFactory {
	public final Car create(String model, String engine) {
		Car car = createCar(model, engine);
		testCar(car);
		return car;
	}

	protected abstract Car createCar(String model, String engine);
	protected abstract void testCar(Car car);
}
