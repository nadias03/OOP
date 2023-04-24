package uczestnicy;

import java.util.Arrays;
import java.util.List;

public class CzlowiekZZewnatrz extends Czlowiek {
    private static final List<String> imiona = Arrays.asList("Klaudia", "Milosz", "Miley", "Gucio", "Aniuta", "Rysiu", "Kuba", "Zosia", "Malgosia", "Aleksandra");
    private String imie;

    public CzlowiekZZewnatrz() {
        super(rand.nextInt(16, 41));
        this.imie = imiona.get(rand.nextInt(imiona.size()));
    }
}
