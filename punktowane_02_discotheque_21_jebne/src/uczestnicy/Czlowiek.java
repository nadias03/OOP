package uczestnicy;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public abstract class Czlowiek {
    private static int licznik = 0;
    protected int unikalneId;
    protected String imie;
    protected int wiek;
    protected static final List<String> imiona = Arrays.asList("Kot", "Pies", "Pingwin", "Slon", "Zyrafa", "Zolw", "Slimak", "Komar", "Motyl", "Mucha");

    static final Random rand = new Random();

    public Czlowiek(int wiek) {
        licznik ++;
        this.unikalneId = 31 + 7 * licznik;
        this.imie = imiona.get(rand.nextInt(imiona.size()));
        this.wiek = wiek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Czlowiek czlowiek = (Czlowiek) o;
        return unikalneId == czlowiek.unikalneId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(unikalneId);
    }

    public String getImie() {
        return this.imie;
    }

    public int getWiek() {
        return this.getWiek();
    }
}
