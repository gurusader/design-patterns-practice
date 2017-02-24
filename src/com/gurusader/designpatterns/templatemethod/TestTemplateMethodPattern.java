package com.gurusader.designpatterns.templatemethod;

public class TestTemplateMethodPattern {
	public static void main(String[] args) {
		AbstractPhone touchScreenPhone = new TouchScreenPhone();
		touchScreenPhone.call();

		System.out.println("");

		AbstractPhone physicalButtonPhone = new PhysicalButtonPhone();
		physicalButtonPhone.call();
	}
}
