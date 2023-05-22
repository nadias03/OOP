package parsing_processing;

import dokumenty.Dokument;
import dokumenty.Faktura;
import dokumenty.Paragon;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class AccountingProofParser {

    public List<Dokument> parseAccountingProofs(String fileName) throws WrongDateException {
        File file = new File("." + File.separator + "resources" + File.separator + fileName);
        List<Dokument> transakcje = new LinkedList<>();
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        try (Scanner scanner = new Scanner(file, StandardCharsets.UTF_8)) {
            scanner.useDelimiter("\n");

            while (scanner.hasNextLine()) {
                String linia = scanner.nextLine();
                String pola[] = linia.split("---");

                if (pola[0].length() <= 4) {   // paragon
                    int nrParagonu = Integer.parseInt(pola[0]);
                    boolean czyFiskalny = Boolean.parseBoolean(pola[1]);
                    String nip = pola[2];
                    String opis = pola[3];
                    double kwota = Double.parseDouble(pola[4]);
                    Date data = dateFormat.parse(pola[5]);

                    if (data.after(currentDate)) {
                        throw new WrongDateException();
                    } else {
                        Paragon paragon = new Paragon(nip, opis, kwota, data, nrParagonu, czyFiskalny);
                        transakcje.add(paragon);
                    }
                } else if (pola[0].length() <= 8) {   // faktura
                    String idFaktury = pola[0];
                    String nip = pola[1];
                    String opis = pola[2];
                    double kwota = Double.parseDouble(pola[3]);
                    Date data = dateFormat.parse(pola[4]);   // PARSOWANIE DATY MI NIE DZIALA

                    if (data.after(currentDate)) {
                        throw new WrongDateException();
                    } else {
                        Faktura faktura = new Faktura(nip, opis, kwota, data, idFaktury);
                        transakcje.add(faktura);
                    }
                } else {
                    throw new IllegalArgumentException("Invalid argument, lecz sie");
                }
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return transakcje;
    }
}
