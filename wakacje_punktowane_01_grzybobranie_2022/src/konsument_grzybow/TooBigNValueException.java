package konsument_grzybow;

public class TooBigNValueException extends Exception {

    public TooBigNValueException() {
        super("Too many or too few loop rotations!! The number should be between 50 and 100!!");
    }
}
