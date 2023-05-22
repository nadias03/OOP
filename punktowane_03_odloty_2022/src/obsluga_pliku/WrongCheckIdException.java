package obsluga_pliku;

public class WrongCheckIdException extends Exception {

    public WrongCheckIdException() {
        super("Poczatek check id wiekszy od jego konca, przypau!!");
    }
}
