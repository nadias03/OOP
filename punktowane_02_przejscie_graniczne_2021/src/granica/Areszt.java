package granica;

import ludzie.Podrozny;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Areszt {
    private List<Podrozny> kolekcjaAresztowanychPodroznych;

    public Areszt() {
        kolekcjaAresztowanychPodroznych = new ArrayList<>();
    }

    public void dodajDoAresztu(Podrozny podrozny) {
        if (podrozny.getWiek() < 18){
            throw new ArithmeticException("Ten podróżny jest niepełnoletni!!");
        }
        kolekcjaAresztowanychPodroznych.add(podrozny);
        Collections.sort(kolekcjaAresztowanychPodroznych);

    }
}
