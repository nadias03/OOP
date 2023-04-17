package suweniry;

public class Moneta extends PolyskujacyElement {
	
	public Moneta() {
		super(1 + rand.nextDouble() * (5000 - 1));
	}

	@Override
	public String toString() {
		return "O";
	}
	
	
}
