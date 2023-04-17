package punktowane_01_gornik;

public class Gornik {
	double income = 0;
	ObiektyKopalniane[][] teren;
	
	public Gornik(ObiektyKopalniane teren[][]) {
		this.teren = teren;
	}
	
	public void goMiner() {
		for (int i = 0; i < teren.length; i ++) {
			if (this.teren[i] != null) {   
				for (int j = 0; j < teren[i].length; j++) {
					if (this.teren[i][j] != null) {
						income += this.teren[i][j].getModifiedMarketValue();
						this.teren[i][j] = null;
					}
				}
			}
		}
	}

}
