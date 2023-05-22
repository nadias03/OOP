package dokumenty;

import java.util.Date;

public abstract class Dokument {
    private String nip;
    private String opis;
    private double kwota;
    private Date data;

    public Dokument(String nip, String opis, double kwota, Date data) {
        this.nip = nip;
        this.opis = opis;
        this.kwota = kwota;
        this.data = data;
    }

    public double getKwota() {
        return this.kwota;
    }

    public Date getData() {
        return this.data;
    }
}
