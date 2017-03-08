package com.gurusader.designpatterns.singleton;

// Singleton
public class LazyInitialization {
	private static LazyInitialization instance;

	private LazyInitialization() {
	}

	public static LazyInitialization getInstance() {
		if (instance == null) {
			instance = new LazyInitialization();
		}

		return instance;
	}

	public static synchronized LazyInitialization getInstanceThreadSafe() {
		if (instance == null) {
			instance = new LazyInitialization();
		}

		return instance;
	}
}
