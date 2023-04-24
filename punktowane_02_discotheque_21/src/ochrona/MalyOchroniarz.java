package ochrona;

import organizacja.Sala;
import organizacja.Hol;
import organizacja.ZaDuzoLuduException;
import uczestnicy.Czlowiek;

import java.util.Random;
import java.util.TooManyListenersException;

public class MalyOchroniarz {
    protected Sala malaSala;
    protected Sala duzaSala;
    protected Hol hol;

    public MalyOchroniarz(Sala malaSala, Sala duzaSala, Hol hol) {
        this.malaSala = malaSala;
        this.duzaSala = duzaSala;
        this.hol = hol;
    }

    public boolean check(Czlowiek czlowiek) {
        if (czlowiek.getWiek() >= 18) {
            Random rand = new Random();
            double los = rand.nextDouble();
            if (los < 0.5) {   // mala sala
                try {
                    this.malaSala.dodajUczestnika(czlowiek);
                } catch (ZaDuzoLuduException zaDuzo) {
                    zaDuzo.printStackTrace();
                    return false;
                }
                return true;
            } else {  // duza sala
                try {
                    this.duzaSala.dodajUczestnika(czlowiek);
                } catch (ZaDuzoLuduException zaDuzo) {
                    zaDuzo.printStackTrace();
                    return false;
                }
                return true;
            }
        }
        return false;
    }

}
