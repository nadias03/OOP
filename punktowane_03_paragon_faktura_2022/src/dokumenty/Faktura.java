package dokumenty;

import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

public class Faktura extends Dokument implements Comparable<Faktura> {
    private String idFaktury;

    public Faktura(String nip, String opis, double kwota, Date data, String idFaktury) {
        super(nip, opis, kwota, data);
        this.idFaktury = idFaktury;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faktura faktura = (Faktura) o;
        return Objects.equals(idFaktury, faktura.idFaktury);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFaktury);
    }

    @Override
    public int compareTo(Faktura o) {
        return this.idFaktury.compareTo(o.idFaktury);
    }
}
