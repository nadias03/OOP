package loty;

public class Przylot extends Lot {
    private boolean wyladowal;
    private Integer nrWyjscia;

    public Przylot(String godzina, String skadDokad, String idLotu, String linia, boolean wyladowal, Integer nrWyjscia) {
        super(godzina, skadDokad, idLotu, linia);
        this.wyladowal = wyladowal;
        this.nrWyjscia = nrWyjscia;
    }

    public boolean isWyladowal() {
        return this.wyladowal;
    }
}
