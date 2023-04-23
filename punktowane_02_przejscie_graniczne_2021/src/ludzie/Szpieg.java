package ludzie;

import towary.Towar;
import towary.TrefnyTowar;

public class Szpieg extends PodroznyUzbrojony {

    public Szpieg() {
        super(rand.nextInt(35, 76));
        int ileTowarow = rand.nextInt(2, 4);
        for (int i = 0; i < ileTowarow; i++) {
            this.mojeTowary.add(new Towar());
        }
    }
}
