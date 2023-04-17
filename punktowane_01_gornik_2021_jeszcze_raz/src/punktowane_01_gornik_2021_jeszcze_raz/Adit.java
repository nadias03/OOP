package punktowane_01_gornik_2021_jeszcze_raz;

import java.util.Random;

public class Adit {
	private int maxDystans;
	private int dlugoscKorytarza;
	private int liczbaKorytarzy;
	private Korytarz[] szyb;
	Gornik gornik;
	
	final Random rand = new Random();
	
	public Adit(int maxDystans, int dlugoscKorytarza, int liczbaKorytarzy) {
		this.maxDystans = maxDystans;
		this.dlugoscKorytarza = dlugoscKorytarza;
		this.liczbaKorytarzy = liczbaKorytarzy;
		
		int dlugoscSzybu = this.maxDystans * (this.liczbaKorytarzy + 1);
		this.szyb = new Korytarz[dlugoscSzybu];
		this.wypelnijSzyb();
		
		this.gornik = new Gornik(this.szyb);
	}
	
	private void wypelnijSzyb() {
		int poprzedni = 0;
		for (int i = 0; i < this.liczbaKorytarzy; i++) {
			int nastepny = poprzedni + rand.nextInt(1, this.maxDystans);
			this.szyb[nastepny] = new Korytarz(this.dlugoscKorytarza);
			poprzedni = nastepny;
		}
	}
	
	public void wypiszAdit() {
		for (int i = 0; i < this.szyb.length; i++) {
			if (szyb[i] == null) {
				System.out.println("null");
			} else {
				System.out.println("-> ");
				for (int j = 0; j < this.dlugoscKorytarza; j++) {
					System.out.print(szyb[i].korytarz[j]);
				}
			}
			System.out.println();
		}
	}

}
