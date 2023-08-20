package elementy;

public class MuchomorCesarski extends Grzyb {

    public MuchomorCesarski() {
        super(Twardosc.TWARDY, 50, 75);
    }

    @Override
    public String toString() {
        return "MuchomorCesarski{} " + super.toString();
    }

    @Override
    public boolean isTrujacy() {
        return false;
    }
}
