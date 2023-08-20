import elementy.Grzyb;
import konsument_grzybow.Konsument;
import konsument_grzybow.TooBigNValueException;
import las.Las;

public class Main {
    public static void main(String[] args) throws TooBigNValueException {
        System.out.println("jajebie");
        Las las = new Las(5, 6);
        Grzyb losowyGrzyb = las.zwrocLosowegoGrzyba();
        Konsument konsument = new Konsument(las, 5, 6);
        konsument.konsumujGrzyby(54);

        // wywala wyjatki jebne

    }
}