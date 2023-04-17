package punktowane_01_gornik_2021_jeszcze_raz;

public class Uraninit extends RadioaktywnyObiektKopalniany {
	private Forma forma;
	private int radioaktywnosc;
	
	public Uraninit(double wartoscRynkowa) {
		super(wartoscRynkowa, 700, 950);
		this.forma = Forma.values()[rand.nextInt(Forma.values().length)];
		this.radioaktywnosc = rand.nextInt(this.minRadioaktywnosc, this.maxRadioaktywnosc + 1);
	}

	@Override
	public double getModifiedMarketValue() {
		double wynik = this.wartoscRynkowa;
		switch(this.forma) {
			case URANOFAN:
				wynik *= 1.0;
				break;
			case TORBERNIT:
				wynik *= 1.5;
				break;
			case FOUMARIERYT:
				wynik *= 2.5;
				break;
		}
		return wynik;
	}
	
	
}
