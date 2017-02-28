package com.gurusader.designpatterns.templatemethod;

public class TestTemplateMethodPattern {
	public static void main(String[] args) {
		Phone touchScreenPhone = new TouchScreenPhone();
		touchScreenPhone.call();

		System.out.println("");

		Phone physicalButtonPhone = new PhysicalButtonPhone();
		physicalButtonPhone.call();
	}
}
