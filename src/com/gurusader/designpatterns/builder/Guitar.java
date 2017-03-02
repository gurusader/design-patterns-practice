package com.gurusader.designpatterns.builder;

// Product
public class Guitar {
	private String neck;
	private String fingerBoard;
	private String body;
	private String pickup;

	public String getNeck() {
		return neck;
	}

	public void setNeck(String neck) {
		this.neck = neck;
	}

	public String getFingerBoard() {
		return fingerBoard;
	}

	public void setFingerBoard(String fingerBoard) {
		this.fingerBoard = fingerBoard;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getPickup() {
		return pickup;
	}

	public void setPickup(String pickup) {
		this.pickup = pickup;
	}

	@Override
	public String toString() {
		return "[Neck: " + neck + "], [Finger Board: " + fingerBoard + "], [Body: " + body + "], [Pickup: " + pickup + "]";
	}
}
