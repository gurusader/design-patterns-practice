package com.gurusader.designpatterns.prototype;

public class TestPrototypePattern {
	public static void main(String[] args) {
		try {
			MusicalInstrument guitar1 = new Guitar("SSS", "Standard");
			System.out.println(guitar1);

			MusicalInstrument guitar1Clone = guitar1.clone();
			System.out.println(guitar1Clone);

			MusicalInstrument guitar2 = new Guitar("HH", "Drop D");
			System.out.println(guitar2);

			MusicalInstrument guitar2Clone = guitar2.clone();
			System.out.println(guitar2Clone);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
