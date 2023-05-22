import loty.Lot;
import loty.Przylot;
import obsluga_pliku.FlightsParser;
import obsluga_pliku.FlightsProcessor;
import obsluga_pliku.WrongCheckIdException;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FlightsParser flightsParser = new FlightsParser();

        List<Lot> loty = null;
        try {
            loty = flightsParser.parseFile("dane.txt");
        } catch (WrongCheckIdException e) {
            e.printStackTrace();
        }

        FlightsProcessor flightsProcessor = new FlightsProcessor(loty);
        List<Przylot> expPrzyloty = flightsProcessor.getExpectedArrivals();
        List<Lot> sortLoty = flightsProcessor.getFlightsOrdered();

        System.out.println("Przewidywane przyloty: ");
        System.out.println(expPrzyloty);
        System.out.println();
        System.out.println("Posortowane loty: ");
        System.out.println(sortLoty);
    }
}