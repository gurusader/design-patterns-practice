package com.gurusader.designpatterns.abstractfactory;

// ConcreteFactory
public class FerrariFactory implements CarFactory {
	@Override
	public Car createCar(String model) {
		return new Ferrari(model);
	}
}
