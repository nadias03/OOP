package ludzie;

import towary.Towar;
import towary.TrefnyTowar;

public class Turysta extends Podrozny {

    public Turysta() {
        super(rand.nextInt(14, 61));
        int ileTowarow = rand.nextInt(10, 21);
        for (int i = 0; i < ileTowarow; i++) {
            double los = rand.nextDouble();
            if (los < 0.1) {   // towar trefny
                this.mojeTowary.add(new TrefnyTowar());
            } else {
                this.mojeTowary.add(new Towar());
            }
        }
    }
}
