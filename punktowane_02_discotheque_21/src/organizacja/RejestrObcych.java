package organizacja;

import uczestnicy.Czlowiek;
import uczestnicy.CzlowiekZZewnatrz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class RejestrObcych {
    private HashMap<String, Set<Czlowiek>> rejestrObcych;   // nw czy tu nie powinien byc CzlowiekZZewnatrz

    public RejestrObcych() {
        this.rejestrObcych = new HashMap<>();
    }

    public boolean czyDodacOsobeDoRejestru(Czlowiek czlowiek) {
        Set<String> imiona = this.rejestrObcych.keySet();
        Iterator<String> iterator = imiona.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().equals(czlowiek.getImie())) {
                return false;
            }
        }
        return true;
    }

    public void dodajDoRejestru(Czlowiek czlowiek, Sala sala) {
        if (czyDodacOsobeDoRejestru(czlowiek)) {
            this.rejestrObcych.put(czlowiek.getImie(), sala.getKolekcjaUczestnikow());
        }
    }

}
