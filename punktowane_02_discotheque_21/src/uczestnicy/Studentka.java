package uczestnicy;

import java.util.Arrays;
import java.util.List;

public class Studentka extends OsobaStudencka {
    private static final List<String> imiona = Arrays.asList("Jola", "Amelka", "Nela", "Pati", "Monia", "Frania", "Nati", "Karo", "Ola", "Basia");
    private String imie;

    public Studentka() {
        super();
        this.imie = imiona.get(rand.nextInt(imiona.size()));
    }
}
