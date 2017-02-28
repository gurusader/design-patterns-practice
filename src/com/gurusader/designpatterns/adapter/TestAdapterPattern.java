package com.gurusader.designpatterns.adapter;

public class TestAdapterPattern {
	public static void main(String[] args) {
		CodeEditor codeEditor = new EditorAdapter();
		codeEditor.editCode();
	}
}
