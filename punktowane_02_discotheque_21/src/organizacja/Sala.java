package organizacja;

import uczestnicy.Czlowiek;

import java.util.LinkedHashSet;

public class Sala {
    private LinkedHashSet<Czlowiek> kolekcjaUczestnikow;
    private final int maksymalnaPojemnosc;

    public Sala(int maksymalnaPojemnosc) {
        this.maksymalnaPojemnosc = maksymalnaPojemnosc;
        this.kolekcjaUczestnikow = new LinkedHashSet<>();
    }

    public void dodajUczestnika(Czlowiek uczestnik) throws ZaDuzoLuduException {
        if (kolekcjaUczestnikow.size() >= this.maksymalnaPojemnosc) {
            throw new ZaDuzoLuduException();
        }

        this.kolekcjaUczestnikow.add(uczestnik);
    }

    public LinkedHashSet<Czlowiek> getKolekcjaUczestnikow() {
        return this.kolekcjaUczestnikow;
    }



}
