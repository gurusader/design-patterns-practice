package com.gurusader.designpatterns.abstractfactory;

// ConcreteProduct
public class Porsche extends Car {
	Porsche(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println(getModel() + " is running.");
	}
}
