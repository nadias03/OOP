package punktowane_01_gornik;

public class Chalkolit extends RadioaktywneObiektyKopalniane {
	
	public Chalkolit(double bazowaWartoscRynkowa) {
		super(bazowaWartoscRynkowa);
	}

	@Override
	public double getModifiedMarketValue() {
		return this.bazowaWartoscRynkowa;
	}
	
	
	
}
