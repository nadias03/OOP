package las;

import elementy.*;

import java.util.Random;

public class Las {
    private Grzyb[][] las;
    static final Random rand = new Random();

    public Las(int x, int y) {
        // x - wiersze
        // y - kolumny
        if (x <= 0) {
            x = 100;
        }

        if (y <= 0) {
            y = 100;
        }

        this.las = new Grzyb[x][y];

        // losowe uzupelnianie lasu
        int kolumnaBezGrzybow = rand.nextInt(y);
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                double los1 = rand.nextDouble();
                if (j != kolumnaBezGrzybow && los1 < 0.2) {
                    double los2 = rand.nextDouble();
                    if (los2 < 0.25) {
                        this.las[i][j] = new MuchomorCesarski();
                    } else if (los2 < 0.5) {
                        this.las[i][j] = new MuchomorKolczastoglowy();
                    } else if (los2 < 0.75) {
                        this.las[i][j] = new MuchomorSromotnikowy();
                    } else {
                        this.las[i][j] = new MuchomorSzarawy();
                    }
                } else {
                    this.las[i][j] = null;
                }
            }
        }
    }

    public Grzyb zwrocLosowegoGrzyba() {
        int wiersz = rand.nextInt(this.las.length);
        int kolumna = rand.nextInt(this.las[0].length);

        Grzyb grzybDoZwrocenia = this.las[wiersz][kolumna];
        this.las[wiersz][kolumna] = null;
        return grzybDoZwrocenia;
    }

}
