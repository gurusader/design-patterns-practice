package com.gurusader.designpatterns.builder;

// Builder
public interface GuitarBuilder {
	GuitarBuilder buildNeck();
	GuitarBuilder buildFingerBoard();
	GuitarBuilder buildBody();
	GuitarBuilder buildPickup();
	Guitar getGuitar();
}
