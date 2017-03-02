package com.gurusader.designpatterns.builder;

// ConcreteBuilder
public class TelecasterBuilder implements GuitarBuilder {
	private Guitar guitar;

	public TelecasterBuilder() {
		guitar = new Guitar();
	}

	@Override
	public GuitarBuilder buildNeck() {
		guitar.setNeck("Maple");
		return this;
	}

	@Override
	public GuitarBuilder buildFingerBoard() {
		guitar.setFingerBoard(null);
		return this;
	}

	@Override
	public GuitarBuilder buildBody() {
		guitar.setBody("Alder");
		return this;
	}

	@Override
	public GuitarBuilder buildPickup() {
		guitar.setPickup("SSS");
		return this;
	}

	@Override
	public Guitar getGuitar() {
		return guitar;
	}
}
