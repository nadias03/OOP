package modelowaniewycinkarzeki;

import suweniry.*;
import java.util.Random;

public class WycinekRzeki1 {
	protected Element[][] wycinek;
	
	final Random rand = new Random();
	
	public WycinekRzeki1(int szerokosc, int dlugosc) {
		// wyjatek szerokosc i dlugosc miedzy 1 a 100
		this.wycinek = new Element[szerokosc][dlugosc];
		this.wypelnijWycinek();
		
	}
	
	private void wypelnijWycinek() {
		for (int i = 0; i < this.wycinek.length; i++) {
			for (int j = 0; j < this.wycinek[i].length; j++) {
				double los = rand.nextDouble();
				if (los < 0.1) {
					this.wycinek[i][j] = new Moneta();
				} else if (los < 0.2) {
					this.wycinek[i][j] = new Zegarek();
				} else if (los < 0.3) {
					this.wycinek[i][j] = new ZegarekPodwodny();
				} else if (los < 0.4) {
					this.wycinek[i][j] = new But();
				} else if (los < 0.5) {
					this.wycinek[i][j] = new Butelka();
				} else {
					this.wycinek[i][j] = null;
				}
			}
		}
	}
	
	public void moveAll() {
		for (int i = 0; i < this.wycinek.length; i++) {
			for (int j = 0; j < this.wycinek[i].length; j++) {
				int ilePrzesunac = this.wycinek[i][j].distance();
				if (j + ilePrzesunac < this.wycinek[0].length) {
					if (this.wycinek[i][j + ilePrzesunac] == null) {
						this.wycinek[i][j + ilePrzesunac] = this.wycinek[i][j];
						this.wycinek[i][j] = null;
					}
				} else {
					this.wycinek[i][j] = null;
				}
			}
		}
	}

}
