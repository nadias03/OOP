package ludzie;

import towary.TowaryOgolnie;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Random;

public abstract class Podrozny implements Comparable<Podrozny> {
    private static int licznikPodroznych = 0;
    protected int unikalneId;
    protected int wiek;
    protected LinkedHashSet<TowaryOgolnie> mojeTowary;   // linked bo kolejnosc ma znaczenie
    final static Random rand = new Random();

    public Podrozny(int wiek) {
        licznikPodroznych ++;
        this.unikalneId = 31 + 7 * licznikPodroznych;
        this.mojeTowary = new LinkedHashSet<>();
        this.wiek = wiek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Podrozny podrozny = (Podrozny) o;
        return unikalneId == podrozny.unikalneId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(unikalneId);
    }

    public int getWiek(){
        return this.wiek;
    }

    public void setWiek(int wiek){
        this.wiek = wiek;
    }

    @Override
    public int compareTo(Podrozny o) {
        return this.wiek - o.wiek;
    }

    public LinkedHashSet<TowaryOgolnie> getMojeTowary() {
        return this.getMojeTowary();
    }
}
