package suweniry;

public class Butelka extends Element {
	private RodzajButelki rodzaj;
	
	public Butelka() {
		super(0);   // jakakolwiek wartosc pola wartosc zaraz ja zmienie
		this.rodzaj = RodzajButelki.values()[rand.nextInt(RodzajButelki.values().length)];
		switch(this.rodzaj) {
			case ZWROTNA:
				this.wartosc = 0.5;
				break;
			case BEZZWROTNA:
				this.wartosc = 0.25;
				break;
			case BRAKDANYCH:
				this.wartosc = 0.25;
				break;
		}
	}

	@Override
	public String toString() {
		return "()";
	}
	
	@Override
	public int distance() {
		return rand.nextInt(2, 5);
	}
	
	
}
