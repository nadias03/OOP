package elementy;

public class MuchomorSromotnikowy extends Grzyb {
    private Toksyny toksyny;

    public MuchomorSromotnikowy() {
        super(25, 75);
        if (this.masaOwocnika < 50) {
            this.toksyny = Toksyny.ZABOJCZE;
        } else {
            this.toksyny = Toksyny.WYJATKOWOZABOJCZE;
        }
    }

    @Override
    public String toString() {
        return "MuchomorSromotnikowy{" +
                "toksyny=" + toksyny +
                "} " + super.toString();
    }
}
