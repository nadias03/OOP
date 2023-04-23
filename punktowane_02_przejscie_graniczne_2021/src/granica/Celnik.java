package granica;

import ludzie.Podrozny;
import towary.Towar;
import towary.TowaryOgolnie;
import towary.TrefnyTowar;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;

public class Celnik {
    private List<Podrozny> podrozni;
    private Areszt areszt;


    public Celnik(Areszt areszt) {
        this.areszt = areszt;
    }

    public void control(Podrozny podrozny) {
        Random rand = new Random();
        double los = rand.nextDouble();
        if (los < 0.2) {
            LinkedHashSet<TowaryOgolnie> towaryPodroznika = podrozny.getMojeTowary();
            int sumaWartCzarTrefTow = 0;
            for (TowaryOgolnie t : towaryPodroznika) {
                if (t instanceof TrefnyTowar) sumaWartCzarTrefTow += t.getWartoscCzarnorynkowa();
            }

            if (sumaWartCzarTrefTow > 5000) {
                areszt.dodajDoAresztu(podrozny);
            }
        }
    }

}
