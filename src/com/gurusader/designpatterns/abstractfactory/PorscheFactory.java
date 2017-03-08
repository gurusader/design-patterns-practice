package com.gurusader.designpatterns.abstractfactory;

// ConcreteFactory
public class PorscheFactory implements CarFactory {
	@Override
	public Car createCar(String model) {
		return new Porsche(model);
	}
}
