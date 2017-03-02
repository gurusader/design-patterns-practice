package com.gurusader.designpatterns.builder;

// Director
public class GuitarBuildDirector {
	private GuitarBuilder guitarBuilder;

	public GuitarBuildDirector(GuitarBuilder guitarBuilder) {
		this.guitarBuilder = guitarBuilder;
	}

	public void setGuitarBuilder(GuitarBuilder guitarBuilder) {
		this.guitarBuilder = guitarBuilder;
	}

	public Guitar construct() {
		return guitarBuilder.buildNeck()
							.buildFingerBoard()
							.buildBody()
							.buildPickup()
							.getGuitar();
	}
}
