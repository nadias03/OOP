package parsing_processing;

public class WrongCheckInCounters extends Exception {
    public WrongCheckInCounters() {
        super("Niepoprawny zakres stoisk check-in, poczatek jest wiekszy od konca!!!");
    }
}
