package punktowane_01_kret_2021_jeszcze_raz;

import java.util.Random;

public abstract class ObiektZiemny {
	int wartoscOdzywcza;
	static Random rand = new Random();
	
	public ObiektZiemny(int wartoscOdzywcza) {
		this.wartoscOdzywcza = wartoscOdzywcza;
	}

}
