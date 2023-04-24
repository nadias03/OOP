package ochrona;

import organizacja.Hol;
import organizacja.RejestrObcych;
import organizacja.Sala;
import uczestnicy.Czlowiek;

public class DuzyOchroniarz extends MalyOchroniarz {
    private RejestrObcych rejestrObcych;

    public DuzyOchroniarz(Sala malaSala, Sala duzaSala, Hol hol) {
        super(malaSala, duzaSala, hol);
        this.rejestrObcych = new RejestrObcych();
    }

//    @Override
//    public boolean check(Czlowiek czlowiek) {
//        // napisac
//    }
}
