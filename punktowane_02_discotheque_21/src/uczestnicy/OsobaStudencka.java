package uczestnicy;

import java.util.Arrays;
import java.util.List;

public abstract class OsobaStudencka extends Czlowiek {

    public OsobaStudencka() {
        super(rand.nextInt(18, 27));
    }
}
