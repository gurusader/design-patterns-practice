package com.gurusader.designpatterns.singleton;

// Singleton
public class LazyHoldInitialization {
	private LazyHoldInitialization() {
	}

	private static class LazyHolder {
		private static final LazyHoldInitialization INSTANCE = new LazyHoldInitialization();
	}

	public static LazyHoldInitialization getInstance() {
		return LazyHolder.INSTANCE;
	}
}
