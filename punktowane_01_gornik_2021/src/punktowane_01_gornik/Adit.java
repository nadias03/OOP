package punktowane_01_gornik;

import java.util.Arrays;
import java.util.Random;

public class Adit {
	int maksDystansKorytarze;
	int dlugoscKorytarza;
	int liczbaKorytarzy;
	ObiektyKopalniane[][] teren;   // CZY DOBRY TYP ??; dwuwymiarowa tablica reprezentyjaca szyb wraz z korytarzami
	
	Gornik gornik;   // odnosnik gornika do klasy Adit
	
	static final Random rand = new Random();
	
	public Adit(int maksDystansKorytarze, int dlugoscKorytarza, int liczbaKorytarzy) {
		this.maksDystansKorytarze = maksDystansKorytarze;
		this.dlugoscKorytarza = dlugoscKorytarza;
		this.liczbaKorytarzy = liczbaKorytarzy;
		
		int dlugoscSzybu = this.maksDystansKorytarze * (this.liczbaKorytarzy + 1);
		this.teren = new ObiektyKopalniane[dlugoscSzybu][];
		
		this.gornik = new Gornik(teren);
		
		int indPopKorytarza = 0;
		for (int i = 0; i < this.liczbaKorytarzy; i++) {
			int jakDaleko = rand.nextInt(this.maksDystansKorytarze) + 1;   // nowy korytarz bedzie pod indeksem indPopKorytarza + jakDaleko
			
			// wypelnianie korytarza
			ObiektyKopalniane[] korytarz = new ObiektyKopalniane[this.dlugoscKorytarza];
			double los;
			for (int j = 0; j < this.dlugoscKorytarza; j++) {
				los = rand.nextDouble();   // losowanie wartosci od 0 do 1 (wlacznie)
				if (los < 0.1) {
					korytarz[j] = new Uraninit(50);
				} else if (los < 0.3) {
					korytarz[j] = new Chalkolit(50);
				} else {
					korytarz[j] = new Skala();
				}
			}
			
			// wstawianie korytarza do terenu
			teren[indPopKorytarza + jakDaleko] = korytarz;
			indPopKorytarza += jakDaleko;
		}
	}
	
	public void wypiszTeren() {   // metoda ktora pozwoli wywolac prywatna metode stworzTeren
		this.stworzTeren();
	}

	private void stworzTeren() {
		for (int i = 0; i < this.teren.length; i++) {
			if (this.teren[i] == null) {
				System.out.print("null");   
			} else {
				System.out.print("-> ");
				for (int j = 0; j < this.teren[i].length; j++) {
					if (this.teren[i][j] == null) {
						System.out.print(" ");
					} else {
						System.out.print(this.teren[i][j].bazowaWartoscRynkowa);
					}
				}
			}
			System.out.println();
		}
	}
	
	
}
