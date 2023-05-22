package parsing_processing;

public class WrongDateException extends Exception {
    public WrongDateException() {
        super("Data wystawienia dokumentu jest późniejsza niż data uruchomienia programu, cos tu nie gra!!!");
    }
}
