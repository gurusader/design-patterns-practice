package com.gurusader.designpatterns.adapter;

// Adapter
public class EditorAdapter extends TextEditor implements CodeEditor {
	@Override
	public void editCode() {
		editText();
		System.out.println("Highlight syntax");
	}
}
