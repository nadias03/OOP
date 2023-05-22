package loty;

public class Przylot extends Lot {
    private boolean wyladowal;
    private int nrWyjscia;

    public Przylot(String godzina, String skadDokad, String idLotu, String linia, boolean wyladowal, int nrWyjscia) {
        super(godzina, skadDokad, idLotu, linia);
        this.wyladowal = wyladowal;
        this.nrWyjscia = nrWyjscia;
    }

    public boolean czyWyladowal() {
        return this.wyladowal;
    }
}
