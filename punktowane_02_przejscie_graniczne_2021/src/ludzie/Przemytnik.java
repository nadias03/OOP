package ludzie;

import towary.Towar;
import towary.TrefnyTowar;

public class Przemytnik extends PodroznyUzbrojony {

    public Przemytnik() {
        super(rand.nextInt(35, 76));
        int ileTowarow = rand.nextInt(31);
        for (int i = 0; i < ileTowarow; i++) {
            double los = rand.nextDouble();
            if (los < 0.4) {
                this.mojeTowary.add(new TrefnyTowar());
            } else {
                this.mojeTowary.add(new Towar());
            }
        }
    }
}
