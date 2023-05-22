package obsluga_pliku;

import loty.Lot;
import loty.Przylot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightsProcessor {
    List<Lot> allFlights;

    public FlightsProcessor(List<Lot> allFlights) {
        this.allFlights = allFlights;
    }

    public List<Przylot> getExpectedArrivals() {
        List<Przylot> przylotyNieWyladowane = new ArrayList<>();

        for (Lot f : this.allFlights) {
            if (f instanceof Przylot && !(((Przylot) f).czyWyladowal())) {
                przylotyNieWyladowane.add((Przylot) f);
            }
        }

        return przylotyNieWyladowane;
    }

    public List<Lot> getFlightsOrdered() {
        List<Lot> posortowane = new ArrayList<>();
        posortowane.addAll(this.allFlights);
        Collections.sort(posortowane);
        return posortowane;
    }
}
