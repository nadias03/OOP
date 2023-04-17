package punktowane_01_gornik_2021_jeszcze_raz;

public class Chalkolit extends RadioaktywnyObiektKopalniany {
	
	public Chalkolit(double wartoscRynkowa) {
		super(wartoscRynkowa, 700, 950);
	}

	@Override
	public double getModifiedMarketValue() {
		return this.wartoscRynkowa;
	}
	
	
	
	
}
