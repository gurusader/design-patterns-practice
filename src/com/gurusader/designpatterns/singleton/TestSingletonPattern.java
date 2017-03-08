package com.gurusader.designpatterns.singleton;

public class TestSingletonPattern {
	public static void main(String[] args) {
		EagerInitialization ei1 = EagerInitialization.getInstance();
		EagerInitialization ei2 = EagerInitialization.getInstance();
		System.out.println("ei1: " + ei1);
		System.out.println("ei2: " + ei2);
		System.out.println("");

		StaticBlockInitialization sbi1 = StaticBlockInitialization.getInstance();
		StaticBlockInitialization sbi2 = StaticBlockInitialization.getInstance();
		System.out.println("sbi1: " + sbi1);
		System.out.println("sbi2: " + sbi2);
		System.out.println("");

		LazyInitialization li1 = LazyInitialization.getInstance();
		LazyInitialization li2 = LazyInitialization.getInstanceThreadSafe();
		System.out.println("li1: " + li1);
		System.out.println("li2: " + li2);
		System.out.println("");

		LazyHoldInitialization lhi1 = LazyHoldInitialization.getInstance();
		LazyHoldInitialization lhi2 = LazyHoldInitialization.getInstance();
		System.out.println("lh1: " + lhi1);
		System.out.println("lh2: " + lhi2);
	}
}
