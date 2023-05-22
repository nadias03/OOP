import loty.Przylot;
import parsing_processing.FlightsParser;

import loty.Lot;
import parsing_processing.FlightsProcessor;
import parsing_processing.WrongCheckInCounters;

import java.util.List;

public class Main {
    public static void main(String[] args) throws WrongCheckInCounters {
        FlightsParser parser = new FlightsParser();
        List<Lot> loty = parser.parseFlights("data.txt");

        FlightsProcessor processor = new FlightsProcessor(loty);
        List<Przylot> przewidywanePrzyloty = processor.getExpectedArrivals();
        System.out.println(przewidywanePrzyloty);
        List<Lot> posortowaneLoty = processor.getFlightsOrdered();
        System.out.println(posortowaneLoty);
    }
}