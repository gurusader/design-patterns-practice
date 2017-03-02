package com.gurusader.designpatterns.prototype;

// Prototype
public interface MusicalInstrument extends Cloneable {
	void play();
	MusicalInstrument clone() throws CloneNotSupportedException;
}
