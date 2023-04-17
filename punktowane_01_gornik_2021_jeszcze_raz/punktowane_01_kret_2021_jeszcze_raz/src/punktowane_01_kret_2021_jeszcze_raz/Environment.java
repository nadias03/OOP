package punktowane_01_kret_2021_jeszcze_raz;

import java.util.Random;

public class Environment {
	ObiektZiemny[][] teren;
	int m, n;
	int liczbaLarw;
	int liczbaDzdzownic;
	static final int wartoscOdzywczaDzdzownicy = 3;
	static Random rand = new Random();
	
	MoleMotion kret;   // WAZNE i dziwne troche ngl
	
	public Environment(int m, int n, int liczbaLarw, int liczbaDzdzownic) {
		this.m = m;
		this.n = n;
		this.liczbaLarw = liczbaLarw;
		this.liczbaDzdzownic = liczbaDzdzownic;
		this.teren = new ObiektZiemny[m][n];
		
		this.stworzTeren();
		
		
	}
	
	public Environment(Gatunek gatunek, int m, int n, int liczbaLarw, int liczbaDzdzownic) {
		this.m = m;
		this.n = n;
		this.liczbaLarw = liczbaLarw;
		this.liczbaDzdzownic = liczbaDzdzownic;
		this.teren = new ObiektZiemny[m][n];
		this.kret = new Kret(gatunek, this.teren);   // WAZNE!!
		
		this.stworzTeren();
		
	}
	
	public void stworzTeren() {
		// rozstawienie larw
		for (int i = 0; i < this.liczbaLarw; i++) {
			int x = rand.nextInt(m);
			int y = rand.nextInt(n);
			while (this.teren[x][y] == null) {
				x = rand.nextInt(m);
				y = rand.nextInt(n);
			}
			
			// tutaj mam pewnosc ze w teren[x][y] nic nie ma
			// stworzenie obiektu larwy
			Larwa larwa = new Larwa(rand.nextInt(3) + 3);
			
			this.teren[x][y] = larwa;
		}
		
		// rozstawienie dzdzownic
		for (int i = 0; i < this.liczbaDzdzownic; i++) {
			int x = rand.nextInt(m);
			int y = rand.nextInt(n);
			while (this.teren[x][y] == null) {
				x = rand.nextInt(m);
				y = rand.nextInt(n);
			}
			
			// tutaj mam pewnosc ze w teren[x][y] nic nie ma
			// stworzenie obiektu dzdzownicy
			Dzdzownica dzdzownica = new Dzdzownica(this.wartoscOdzywczaDzdzownicy);
			
			this.teren[x][y] = dzdzownica;
		}
		
		// uzupelnienie pozostalych pol gleba
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (this.teren[i][j] == null) {
					// stworzenie obiektu gleby
					Gleba gleba = new Gleba(0);
					this.teren[i][j] = gleba;
				}
			}
		}
	}
	
	void runMole() {
		for (int i = 0; i < 10; i++) {
			this.kret.goMole();
			this.wypiszTeren();
		}
	}
	
	public void wypiszTeren() {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (this.teren[i][j] instanceof Gleba) {
					System.out.println("# ");
				} else if (this.teren[i][j] instanceof Dzdzownica) {
					System.out.println("{} ");
				} else if (this.teren[i][j] instanceof Larwa) {
					System.out.println("@ ");
				} else {
					System.out.println("  ");
				}
			}
			System.out.println();
		}
	}
	
}
