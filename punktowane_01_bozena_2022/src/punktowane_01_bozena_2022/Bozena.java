package punktowane_01_bozena_2022;

import java.util.Random;

public class Bozena implements Niszczarka {
	//private ElementPodloza[][] teren;
	private Pole pole;
	
	final Random rand = new Random();
	
//	public Bozena(ElementPodloza[][] teren) {
//		this.teren = teren;
//	}
	
	public Bozena(Pole pole) {
		this.pole = pole;
	}

	@Override
	public void destroyMines() {
		// losowanie wiersza
		int w = rand.nextInt(this.pole.getDlugoscWiersza(0));
		ElementPodloza[] wiersz = this.pole.getWiersz(w);
		
		for (int i = 0; i < wiersz.length; i++) {
			if (wiersz != null) {
				wiersz[i].pressMe();
				wiersz[i] = null;
			}
		}
		
	}
	
	
}
