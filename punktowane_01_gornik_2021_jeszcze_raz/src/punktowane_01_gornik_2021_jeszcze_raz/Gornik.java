package punktowane_01_gornik_2021_jeszcze_raz;

public class Gornik {
	private double income = 0;
	private Korytarz[] szyb;   // moze sie cos odjebac tu
	
	public Gornik(Korytarz[] szyb) {
		this.szyb = szyb;
	}
	
	public void goMiner() {
		for (int i = 0; i < this.szyb.length; i++) {
			if (this.szyb[i] != null) {
				for (int j = 0; j < this.szyb[i].korytarz.length; j++) {
					if (this.szyb[i].korytarz[j] != null) {
						this.income += this.szyb[i].korytarz[j].getModifiedMarketValue();
						this.szyb[i].korytarz[j] = null;
					}
				}
			}
		}
	}
	
}
