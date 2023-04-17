package punktowane_01_gornik;

public class Uraninit extends RadioaktywneObiektyKopalniane {
	Forma forma;
	
	public Uraninit(double bazowaWartoscRynkowa) {
		super(bazowaWartoscRynkowa);
		double los = rand.nextDouble(0, 1);
		
		int wybor = rand.nextInt(Forma.values().length);   // WAZNE!!
		this.forma = Forma.values()[wybor];                // WAZNE!!
		
//		if (los < 1/3) {
//			this.forma = "uranofan";
//		} else if (los < 2/3) {
//			this.forma = "torbernit";
//		} else {
//			this.forma = "foumarieryt";
//		}
	}

	@Override
	public double getModifiedMarketValue() {
		double wynik = this.bazowaWartoscRynkowa;
		switch(this.forma) {
			case URANOFAN:
				wynik *= 1;
				break;
			case TORBERNIT:
				wynik *= 1.5;
			case FOUMARIERYT:
				wynik *= 2.5;
		}
		return 0;
	}
	
	
}
