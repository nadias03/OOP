package punktowane_01_bozena_2022;

import java.util.Random;

public class Pole {
	private ElementPodloza[][] teren = new ElementPodloza[100][100];
	
	static final Random rand = new Random();
	
	public Pole() {
		// wypelnianie terenu pola
		for (int i = 0; i < this.teren.length; i++) {
			for (int j = 0; j < this.teren[i].length; j++) {
				double los1 = rand.nextDouble();
				if (los1 < 0.4) {
					double los2 = rand.nextDouble();
					if (los2 < 0.25) {   // mina przeciwpiechotna
						MinaPrzeciwPiechotna mp = new MinaPrzeciwPiechotna();
						double los3 = rand.nextDouble();
						if (los3 < 0.9) {
							mp.armMe();
						}
						this.teren[i][j] = mp;
					} else if (los2 < 0.5) {   // mina przeciwczłogowa
						MinaPrzeciwCzolgowa mc = new MinaPrzeciwCzolgowa();
						double los3 = rand.nextDouble();
						if (los3 < 0.9) {
							mc.armMe();
						}
						this.teren[i][j] = mc;
					} else if (los2 < 0.75) {   // trawa
						Trawa t = new Trawa();
						this.teren[i][j] = t;
					} else {   // purchawka
						Purchawka p = new Purchawka();
						this.teren[i][j] = p;
					}
				} else {
					this.teren[i][j] = null;
				}
			}
		}
	}
	
	public int getDlugoscWiersza(int i) {
		return this.teren[i].length;
	}
	
	public ElementPodloza[] getWiersz(int i) {
		return this.teren[i];
	}
}
