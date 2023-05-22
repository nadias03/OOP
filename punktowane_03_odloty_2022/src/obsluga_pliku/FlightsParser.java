package obsluga_pliku;


import loty.Lot;
import loty.Odlot;
import loty.Przylot;
import loty.Status;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlightsParser {
    public ArrayList<Lot> parseFile(String fileName) throws WrongCheckIdException {
        File file = new File("." + File.separator + "resources" + File.separator + fileName);
        ArrayList<Lot> listaLotow = new ArrayList<>();

        try (Scanner scanner = new Scanner(file, StandardCharsets.UTF_8)) {
            scanner.useDelimiter("\n");

            while (scanner.hasNextLine()) {
                String linie = scanner.nextLine();
                String[] pola = linie.split("###");

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
                    } else if (statusString.equals("canceled")) {
                        status = Status.CANCELED;
                    } else if (statusString.equals("boarding")) {
                        status = Status.BOARDING;
                    } else {
                        throw new IllegalArgumentException("Invalid status: " + statusString);
                    }

                    String[] checkIdCounters = checkIn.split("-");
                    int c1 = Integer.parseInt(checkIdCounters[0]);
                    int c2 = Integer.parseInt(checkIdCounters[1]);

                    if (c1 > c2) {
                        throw new WrongCheckIdException();
                    }

                    Odlot odlot = new Odlot(godzina, skadDokad, idLotu, linia, status, checkIn);
                    listaLotow.add(odlot);
                } else if (pola[0].equals("P")) {   // przylot
                    String godzina = pola[1];
                    String skadDokad = pola[2];
                    String idLotu = pola[3];
                    String linia = pola[4];
                    boolean wyladowal = Boolean.parseBoolean(pola[5]);
                    int nrWyjscia = Integer.parseInt(pola[6]);

                    Przylot przylot = new Przylot(godzina, skadDokad, idLotu, linia, wyladowal, nrWyjscia);
                    listaLotow.add(przylot);
                } else {
                    throw new IllegalArgumentException("Invalid argument: " + pola[0]);
                }
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaLotow;
    }


}
