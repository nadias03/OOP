package organizacja;

import uczestnicy.Czlowiek;
import uczestnicy.CzlowiekZZewnatrz;
import uczestnicy.Student;
import uczestnicy.Studentka;

import java.util.LinkedList;

public class Hol {
    private LinkedList<Czlowiek> kolekcjaUczestnikow;

    public Hol() {
        this.kolekcjaUczestnikow = new LinkedList<>();

        // wypelnienie kolekcji uczestnikow
        this.wypelnijKolekcjeUczestnikow();
    }

    private void wypelnijKolekcjeUczestnikow() {
        // studenci (33)
        for (int i = 0; i < 33; i++){
            this.kolekcjaUczestnikow.add(new Student());
        }

        // studentki (33)
        for (int i = 0; i < 33; i++) {
            this.kolekcjaUczestnikow.add(new Studentka());
        }

        // ludzie z zewnatrz (33_
        for (int i = 0; i < 33; i++) {
            this.kolekcjaUczestnikow.add(new CzlowiekZZewnatrz());
        }
    }

    public LinkedList<Czlowiek> getKolekcjaUczestnikow() {
        return this.kolekcjaUczestnikow;
    }
}
