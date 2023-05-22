package parsing_processing;

import dokumenty.Dokument;
import dokumenty.Faktura;

import java.util.*;

public class AccountingProofProcessor {
    List<Dokument> accountingProofs;

    public AccountingProofProcessor(List<Dokument> accountingProofs) {
        this.accountingProofs = accountingProofs;
    }

    public List<Faktura> getOrderedInvoices() {
        List<Faktura> result = new ArrayList<>();

        for (Dokument d : this.accountingProofs) {
            if (d instanceof Faktura && d.getKwota() > 40) {
                result.add((Faktura) d);
            }
        }

        Collections.sort(result);

        return result;
    }

    public void printAmountOfAccountingProofsByDay() {
        Map<Date, Integer> dowodyKsiegowe = new HashMap<>();

        for (Dokument d : this.accountingProofs) {
            Date data = d.getData();
            if (dowodyKsiegowe.containsKey(data)) {
                dowodyKsiegowe.put(data, dowodyKsiegowe.get(data) + 1);   // srednio to rozumiem
            } else {
                dowodyKsiegowe.put(data, 1);
            }
        }

        System.out.println("Liczba wystawionych dowodow ksiegowych w poszczegolnych dniach wynosi: ");
        System.out.println(dowodyKsiegowe);
    }
}
