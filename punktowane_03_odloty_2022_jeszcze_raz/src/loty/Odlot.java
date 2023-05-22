package loty;

public class Odlot extends Lot {
    private Status status;
    private String checkIn;

    public Odlot(String godzina, String skadDokad, String idLotu, String linia, Status status, String checkIn) {
        super(godzina, skadDokad, idLotu, linia);
        this.status = status;
        this.checkIn = checkIn;
    }
}
