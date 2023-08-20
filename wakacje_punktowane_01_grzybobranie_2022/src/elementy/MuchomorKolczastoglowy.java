package elementy;

public class MuchomorKolczastoglowy extends Grzyb {

    public MuchomorKolczastoglowy() {
        super(25, 50);
    }

    @Override
    public String toString() {
        return "MuchomorKolczastoglowy{} " + super.toString();
    }

    @Override
    public boolean isTrujacy() {
        return false;
    }
}
