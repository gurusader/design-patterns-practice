package com.gurusader.designpatterns.singleton;

// Singleton
public class StaticBlockInitialization {
	private static StaticBlockInitialization instance;

	private StaticBlockInitialization() {
	}

	static {
		try {
			instance = new StaticBlockInitialization();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static StaticBlockInitialization getInstance() {
		return instance;
	}
}
