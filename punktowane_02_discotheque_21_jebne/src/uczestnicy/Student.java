package uczestnicy;

import java.util.Arrays;
import java.util.List;

public class Student extends OsobaStudencka {
    private static final List<String> imiona = Arrays.asList("Kazik", "Pawelek", "Janek", "Mati", "Florek", "Milo", "Fifi", "Krzys", "Michal", "Toemk");
    private String imie;

    public Student() {
        super();
        this.imie = imiona.get(rand.nextInt(imiona.size()));
    }
}
