import dokumenty.Dokument;
import dokumenty.Faktura;
import parsing_processing.AccountingProofParser;
import parsing_processing.AccountingProofProcessor;
import parsing_processing.WrongDateException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws WrongDateException, ParseException {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
//        try {
//            Date data = dateFormat.parse("16-05-2022");
//            System.out.println(data);
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }


        AccountingProofParser parser = new AccountingProofParser();
        List<Dokument> transakcje = parser.parseAccountingProofs("data.txt");

        AccountingProofProcessor processor = new AccountingProofProcessor(transakcje);
        List<Faktura> posortowaneFaktury = processor.getOrderedInvoices();
        System.out.println(posortowaneFaktury);
        processor.printAmountOfAccountingProofsByDay();

        // wywala blad nie dziala parsowanie daty



    }
}