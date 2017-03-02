package com.gurusader.designpatterns.builder;

// ConcreteBuilder
public class LesPaulBuilder implements GuitarBuilder {
	private Guitar guitar;

	public LesPaulBuilder() {
		guitar = new Guitar();
	}

	@Override
	public GuitarBuilder buildNeck() {
		guitar.setNeck("Mahogany");
		return this;
	}

	@Override
	public GuitarBuilder buildFingerBoard() {
		guitar.setFingerBoard("Rosewood");
		return this;
	}

	@Override
	public GuitarBuilder buildBody() {
		guitar.setBody("Mahogany");
		return this;
	}

	@Override
	public GuitarBuilder buildPickup() {
		guitar.setPickup("HH");
		return this;
	}

	@Override
	public Guitar getGuitar() {
		return guitar;
	}
}
