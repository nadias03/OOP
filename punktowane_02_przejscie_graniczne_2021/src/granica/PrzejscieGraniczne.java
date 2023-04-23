package granica;

import ludzie.Podrozny;
import ludzie.Przemytnik;
import ludzie.Szpieg;
import ludzie.Turysta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PrzejscieGraniczne {
    private List<Podrozny> kolekcjaPodroznych;
    private List<Celnik> kolekcjaCelnikow;
    private Areszt areszt;

    static final Random rand = new Random();

    public PrzejscieGraniczne() {
        this.kolekcjaPodroznych = new ArrayList<>();
        this.kolekcjaCelnikow = new ArrayList<>();

        // uzupelnienie kolekcji Podroznych

        // Turysci
        for (int i = 0; i < 50; i++) {
            this.kolekcjaPodroznych.add(new Turysta());
        }

        // Szpiedzy
        for (int i = 0; i < 50; i++) {
            this.kolekcjaPodroznych.add(new Szpieg());
        }

        // Przemytnicy
        for (int i = 0; i < 50; i++) {
            this.kolekcjaPodroznych.add(new Przemytnik());
        }

        // przemieszanie kolekcji
        Collections.shuffle(kolekcjaPodroznych);


        this.areszt = new Areszt();
        for (int i = 0; i < 5; i++) {
            this.kolekcjaCelnikow.add(new Celnik(this.areszt));
        }
    }

    public void doJob() {
        for (Podrozny p : kolekcjaPodroznych) {
            int losCelnik = rand.nextInt(5);
            Celnik celnik = kolekcjaCelnikow.get(losCelnik);
            celnik.control(p);
            kolekcjaCelnikow.remove(losCelnik);
        }
    }

}
