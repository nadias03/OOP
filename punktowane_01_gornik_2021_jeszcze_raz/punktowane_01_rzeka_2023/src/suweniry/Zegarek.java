package suweniry;

public class Zegarek extends PolyskujacyElement {
	static int nrSeryjny = 9;
	
	public Zegarek() {
		super(200 + rand.nextDouble() * (250 - 200));
		nrSeryjny += 1;
	}

	@Override
	public String toString() {
		return "*";
	}
	
	
}
