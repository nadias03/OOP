package punktowane_01_gornik_2021_jeszcze_raz;

import java.util.Random;

public class Korytarz {
	ObiektKopalniany[] korytarz;
	
	final Random rand = new Random();
	
	public Korytarz(int dlugoscKorytarza) {
		this.korytarz = new ObiektKopalniany[dlugoscKorytarza];
		this.wypelnijKorytarz();
		
	}
	
	private void wypelnijKorytarz() {
		for (int i = 0; i < this.korytarz.length; i++) {
			double los = rand.nextDouble();
			if (los < 0.1) {   // uraninit
				Uraninit u = new Uraninit(50);
				this.korytarz[i] = u;
			} else if (los < 0.3) {   // chalkolit
				Chalkolit ch = new Chalkolit(50);
				this.korytarz[i] = ch;
			} else {   // skala
				Skala s = new Skala();
				this.korytarz[i] = s;
			}
		}
	}
}
