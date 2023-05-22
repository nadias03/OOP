package parsing_processing;

import loty.Lot;
import loty.Odlot;
import loty.Przylot;
import loty.Status;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlightsParser {

    public List<Lot> parseFlights(String fileName) throws WrongCheckInCounters {
        File file = new File("." + File.separator + "resources" + File.separator + fileName);
        List<Lot> operacjeLotnicze = new ArrayList<>();

        try (Scanner scanner = new Scanner(file, StandardCharsets.UTF_8)) {
            scanner.useDelimiter("\n");

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] pola = line.split("###");

                if (pola[0].equals("O")) {   // odlot
                    String godzina = pola[1];
                    String skadDokad = pola[2];
                    String idLotu = pola[3];
                    String linia = pola[4];
                    String statusString = pola[5];
                    String checkIn = pola[6];

                    Status status;
                    if (statusString.equals("started")) {
                        status = Status.STARTED;
                    } else if (statusString.equals("boarding")) {
                        status = Status.BOARDING;
                    } else if (statusString.equals("canceled")) {
                        status = Status.CANCELLED;
                    } else {
                        throw new IllegalArgumentException("Invalid status: " + statusString);
                    }

                    String[] fromTo = checkIn.split("-");
                    Integer c1 = Integer.parseInt(fromTo[0]);
                    Integer c2 = Integer.parseInt(fromTo[1]);

                    if (c1 > c2) {
                        throw new WrongCheckInCounters();
                    }

                    Odlot odlot = new Odlot(godzina, skadDokad, idLotu, linia, status, checkIn);
                    operacjeLotnicze.add(odlot);

                } else if (pola[0].equals("P")) {   // przylot
                    String godzina = pola[1];
                    String skadDokad = pola[2];
                    String idLotu = pola[3];
                    String linia = pola[4];
                    boolean wyladowal = Boolean.parseBoolean(pola[5]);
                    Integer nrWyjscia = Integer.parseInt(pola[6]);

                    Przylot przylot = new Przylot(godzina, skadDokad, idLotu, linia, wyladowal, nrWyjscia);
                    operacjeLotnicze.add(przylot);
                } else {
                    throw new IllegalArgumentException("Invalid flight type: " + pola[0]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return operacjeLotnicze;
    }
}
