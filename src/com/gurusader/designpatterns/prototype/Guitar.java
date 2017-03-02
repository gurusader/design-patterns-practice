package com.gurusader.designpatterns.prototype;

// ConcretePrototype
public class Guitar implements MusicalInstrument {
	private String pickup;
	private String tuning;

	public Guitar(String pickup, String tuning) {
		this.pickup = pickup;
		this.tuning = tuning;
	}

	@Override
	public MusicalInstrument clone() throws CloneNotSupportedException {
		return (MusicalInstrument) super.clone();
	}

	@Override
	public String toString() {
		return super.toString() + "(pickup: " + pickup + ", tuning: " + tuning + ")";
	}
}
