package com.gurusader.designpatterns.factorymethod;

// Product
public abstract class Car {
	private String model;
	private String engine;

	public abstract void run();

	protected Car(String model, String engine) {
		this.model = model;
		this.engine = engine;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}
}
