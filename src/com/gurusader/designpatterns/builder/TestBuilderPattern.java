package com.gurusader.designpatterns.builder;

public class TestBuilderPattern {
	public static void main(String[] args) {
		GuitarBuildDirector guitarBuildDirector = new GuitarBuildDirector(new TelecasterBuilder());
		Guitar telecaster = guitarBuildDirector.construct();
		System.out.println(telecaster);

		guitarBuildDirector.setGuitarBuilder(new LesPaulBuilder());
		Guitar lesPaul = guitarBuildDirector.construct();
		System.out.println(lesPaul);
	}
}
