package dokumenty;

import java.util.Date;
import java.util.Objects;

public class Paragon extends Dokument {
    private int nrParagonu;
    private boolean czyFiskalny;

    public Paragon(String nip, String opis, double kwota, Date data, int nrParagonu, boolean czyFiskalny) {
        super(nip, opis, kwota, data);
        this.nrParagonu = nrParagonu;
        this.czyFiskalny = czyFiskalny;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paragon paragon = (Paragon) o;
        return nrParagonu == paragon.nrParagonu;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nrParagonu);
    }
}
