package com.gurusader.designpatterns.abstractfactory;

public class TestAbstractFactoryPattern {
	public static void main(String[] args) {
		CarFactory ferrariFactory = new FerrariFactory();
		Car ferrari458 = ferrariFactory.createCar("Ferrari 458");
		ferrari458.run();

		CarFactory porscheFactory = new PorscheFactory();
		Car porsche911 = porscheFactory.createCar("Porsche 911");
		porsche911.run();
	}
}
