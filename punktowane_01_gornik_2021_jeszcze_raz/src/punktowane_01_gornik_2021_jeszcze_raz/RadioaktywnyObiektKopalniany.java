package punktowane_01_gornik_2021_jeszcze_raz;

public abstract class RadioaktywnyObiektKopalniany extends ObiektKopalniany {
	protected int maxRadioaktywnosc;
	protected int minRadioaktywnosc;
	
	public RadioaktywnyObiektKopalniany(double wartoscRynkowa, int maxRadioaktywnosc, int minRadioaktywnosc) {
		super(wartoscRynkowa);
		this.maxRadioaktywnosc = maxRadioaktywnosc;
		this.minRadioaktywnosc = minRadioaktywnosc;
	}
	
}
