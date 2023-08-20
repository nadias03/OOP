package elementy;

import java.util.Random;

public abstract class Grzyb {
    protected Twardosc twardosc;
    protected int masaOwocnika;

    static final Random rand = new Random();

    // konstruktor dla MuchomorCesarski, gdzie twardosc to TWARDY
    public Grzyb(Twardosc twardosc, int minMasaOwocnika, int maxMasaOwocnika) {
        this.twardosc = twardosc;
        this.masaOwocnika = rand.nextInt(minMasaOwocnika, maxMasaOwocnika + 1);
    }

    // konstruktor dla pozostalych muchomorow, gdzie twardosc jest losowana
    public Grzyb(int minMasaOwocnika, int maxMasaOwocnika) {
        this.twardosc = Twardosc.values()[rand.nextInt(Twardosc.values().length)];
        this.masaOwocnika = rand.nextInt(minMasaOwocnika, maxMasaOwocnika + 1);
    }

    public void ugotuj() {
        this.twardosc = Twardosc.MIEKKI;
    }

    @Override
    public String toString() {
        return "Grzyb{" +
                "twardosc=" + twardosc +
                ", masaOwocnika=" + masaOwocnika +
                '}';
    }

    public boolean isTrujacy() {
        return true;
    }
}
