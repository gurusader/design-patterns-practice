package com.gurusader.designpatterns.prototype;

// Prototype
public interface MusicalInstrument extends Cloneable {
	MusicalInstrument clone() throws CloneNotSupportedException;
}
