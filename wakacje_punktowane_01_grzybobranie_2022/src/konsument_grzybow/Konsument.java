package konsument_grzybow;

import elementy.Grzyb;
import las.Las;

public class Konsument {
    private Las las;

    public Konsument(Las las, int x, int y) {
        this.las = new Las(x, y);
    }

    public void konsumujGrzyby(int n) throws TooBigNValueException {
        if (n <= 50 || n >= 100) {
            throw new TooBigNValueException();
        } else {
            for (int i = 0; i < n; i++) {
                Grzyb losowyGrzyb = this.las.zwrocLosowegoGrzyba();
                losowyGrzyb.ugotuj();
                if (!zjedz(losowyGrzyb)) {
                    break;
                }
            }
        }
    }

    public boolean zjedz(Grzyb grzyb) {
        if (grzyb.isTrujacy()) {
            System.out.println("Uuuups!");
            return false;
        }
        return true;
    }
}
