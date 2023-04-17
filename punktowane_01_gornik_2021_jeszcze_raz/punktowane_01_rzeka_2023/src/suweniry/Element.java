package suweniry;

import java.util.Random;

public abstract class Element {
	protected double wartosc;
	
	static final Random rand = new Random();
	
	public Element(double wartosc) {
		this.wartosc = wartosc;
	}
	
	public int distance() {
		return 1;
	}
}
