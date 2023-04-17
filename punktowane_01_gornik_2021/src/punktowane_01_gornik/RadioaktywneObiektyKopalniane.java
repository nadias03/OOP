package punktowane_01_gornik;

public abstract class RadioaktywneObiektyKopalniane extends ObiektyKopalniane {
	int radioaktywnosc;

	public RadioaktywneObiektyKopalniane(double bazowaWartoscRynkowa) {
		super(bazowaWartoscRynkowa);
		this.radioaktywnosc = rand.nextInt(250) + 700;
	}
	
}
