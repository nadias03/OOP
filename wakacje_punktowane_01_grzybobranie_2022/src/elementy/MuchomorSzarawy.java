package elementy;

public class MuchomorSzarawy extends Grzyb {
    private Toksyny toksyny;
    private final int ROK_ODKRYCIA_GATUNKU = 1783;

    public MuchomorSzarawy() {
        super(25, 75);
    }

    @Override
    public void ugotuj() {
        super.ugotuj();
        this.toksyny = Toksyny.NIEOBECNE;
    }

    @Override
    public String toString() {
        return "MuchomorSzarawy{" +
                "toksyny=" + toksyny +
                ", ROK_ODKRYCIA_GATUNKU=" + ROK_ODKRYCIA_GATUNKU +
                "} " + super.toString();
    }

    @Override
    public boolean isTrujacy() {
        switch (this.toksyny) {
            case TRUJACE -> {
                return true;
            } case ZABOJCZE -> {
                return true;
            } case WYJATKOWOZABOJCZE -> {
                return true;
            } case NIEOBECNE -> {
                return false;
            } default -> {
                return true;
            }
        }
    }
}
