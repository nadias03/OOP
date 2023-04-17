package suweniry;

public abstract class PolyskujacyElement extends Element {
	protected boolean polysk;
	
	public PolyskujacyElement(double wartosc) {
		super(wartosc);
		double los = rand.nextDouble();
		if (los < 0.5) {
			this.polysk = true;
		} else {
			this.polysk = false;
		}
	}
}
