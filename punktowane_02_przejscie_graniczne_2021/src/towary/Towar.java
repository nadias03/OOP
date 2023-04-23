package towary;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Towar extends TowaryOgolnie {
    private static final List<String> rodzajeTowarow = Arrays.asList("woda", "kanapka", "laptop", "zasilacz", "mysz", "ksiazka");
    private String nazwa;

    final static Random rand = new Random();

    public Towar() {
        int i = rand.nextInt(rodzajeTowarow.size());
        this.nazwa = rodzajeTowarow.get(i);
        this.setWartoscCzarnorynkowa(0);
    }
}
