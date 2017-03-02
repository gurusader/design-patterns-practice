package com.gurusader.designpatterns.prototype;

public class TestPrototypePattern {
	public static void main(String[] args) {
		try {
			MusicalInstrument guitar1 = new Guitar("SSS", "Standard");
			guitar1.play();

			MusicalInstrument guitar1Clone = guitar1.clone();
			guitar1Clone.play();

			MusicalInstrument guitar2 = new Guitar("HH", "Drop D");
			guitar2.play();

			MusicalInstrument guitar2Clone = guitar2.clone();
			guitar2Clone.play();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
