package punktowane_01_kret_2021_jeszcze_raz;

public class Gleba extends ObiektZiemny {
	double gestosc;
	
	public Gleba(int wartoscOdzywcza) {
		super(wartoscOdzywcza);
		this.gestosc = 1.4 + rand.nextDouble() * (2.4 - 1.4);
		
	}
}
