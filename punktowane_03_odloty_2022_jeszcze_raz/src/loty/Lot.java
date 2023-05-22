package loty;

import java.util.Objects;

public abstract class Lot implements Comparable<Lot> {
    private String godzina;
    private String skadDokad;
    private String idLotu;
    private String linia;

    public Lot(String godzina, String skadDokad, String idLotu, String linia) {
        this.godzina = godzina;
        this.skadDokad = skadDokad;
        this.idLotu = idLotu;
        this.linia = linia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lot lot = (Lot) o;
        return Objects.equals(idLotu, lot.idLotu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLotu);
    }

    @Override
    public int compareTo(Lot o) {
        return this.idLotu.compareTo(o.idLotu);
    }
}
