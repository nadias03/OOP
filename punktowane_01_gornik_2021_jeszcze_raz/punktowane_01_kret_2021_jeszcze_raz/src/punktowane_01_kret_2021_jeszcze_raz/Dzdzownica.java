package punktowane_01_kret_2021_jeszcze_raz;

public class Dzdzownica extends ZywyObiektZiemny {
	
	public Dzdzownica(int wartoscOdzywcza) {
		super(wartoscOdzywcza);
		this.masa = 0.5 + rand.nextDouble(1.0 - 0.5);
	}

}
