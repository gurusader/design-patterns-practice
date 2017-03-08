package com.gurusader.designpatterns.abstractfactory;

// Product
public abstract class Car {
	private String model;

	protected Car(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public abstract void run();
}
