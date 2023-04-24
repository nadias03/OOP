package dyska;

import ochrona.DuzyOchroniarz;
import ochrona.MalyOchroniarz;
import organizacja.Hol;
import organizacja.Sala;

public class Dyskoteka {
    private Hol hol;
    private Sala malaSala;
    private Sala duzaSala;
    private MalyOchroniarz malyOchroniarz;
    private DuzyOchroniarz duzyOchroniarz;

    public Dyskoteka() {
        this.hol = new Hol();
        this.malaSala = new Sala(51);
        this.duzaSala = new Sala(75);
        this.malyOchroniarz = new MalyOchroniarz(this.malaSala, this.duzaSala, this.hol);
        this.duzyOchroniarz = new DuzyOchroniarz(this.malaSala, this.duzaSala, this.hol);
    }

}
