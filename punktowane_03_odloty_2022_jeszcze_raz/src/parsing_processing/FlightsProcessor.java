package parsing_processing;

import loty.Lot;
import loty.Przylot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightsProcessor {
    List<Lot> kolekcjaLotow;

    public FlightsProcessor(List<Lot> kolekcjaLotow) {
        this.kolekcjaLotow = kolekcjaLotow;
    }

    public List<Przylot> getExpectedArrivals() {
        // wyizolowuje i zwraca liste referencji na przyloty samolotów, ktore jeszcze nie wyladowaly
        List<Przylot> wynik = new ArrayList<>();

        for (Lot lot : this.kolekcjaLotow) {
            if (lot instanceof Przylot && !((Przylot) lot).isWyladowal()) {
                wynik.add((Przylot) lot);
            }
        }

        return wynik;
    }

    public List<Lot> getFlightsOrdered() {
        // zwraca loty z pola "allFlights" posortowana rosnaco po dlugosci zapisu "id lotu"
        List<Lot> result = new ArrayList<>();
        result.addAll(this.kolekcjaLotow);
        Collections.sort(result);
        return result;
    }
}
