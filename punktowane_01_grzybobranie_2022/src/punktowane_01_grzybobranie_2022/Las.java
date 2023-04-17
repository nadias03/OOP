package punktowane_01_grzybobranie_2022;

import java.util.Random;

public class Las implements GetGrzyb {
	private Grzyb[][] teren;
	
	static final Random rand = new Random();
	
	public Las(int x, int y) {
		if (x <= 0) x = 100;   // x - wiersze
		if (y <= 0) y = 100;   // y - kolumy
		
		int kolumnaBezGrzybow = rand.nextInt(y);
		
		this.teren = new Grzyb[x][y];
		
		// wypelnianie terenu
		for (int i = 0; i < this.teren.length; i++) {
			for (int j = 0; j < this.teren[i].length; j++) {
				double los1 = rand.nextDouble();   // czy wgl grzyb bedzie
				if (los1 < 0.2 && j != kolumnaBezGrzybow) {
					// w polu teren[i][j] na pewno bedzie jakis grzyb
					double los2 = rand.nextDouble();   // jaki muchomor
					if (los2 < 0.25) {
						MuchomorSromotnikowy msr = new MuchomorSromotnikowy();
						this.teren[i][j] = msr;
					} else if (los2 < 0.5) {
						MuchomorCesarski mc = new MuchomorCesarski();
						this.teren[i][j] = mc;
					} else if (los2 < 0.75) {
						MuchomorKolczastoglowy mk = new MuchomorKolczastoglowy();
						this.teren[i][j] = mk;
					} else {
						MuchomorSzarawy msz = new MuchomorSzarawy();
						this.teren[i][j] = msz;
					}
				} else {
					this.teren[i][j] = null;
				}
			}
		}
	}
	
	public Grzyb zwrocGrzyba() {
		int los_i = rand.nextInt(this.teren.length);
		int los_j = rand.nextInt(this.teren[0].length);
		
		Grzyb grzybDoZwrocenia = this.teren[los_i][los_j];
		this.teren[los_i][los_j] = null;
		return grzybDoZwrocenia;
	}
	
}
