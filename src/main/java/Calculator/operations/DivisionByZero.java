package Calculator.operations;

public class DivisionByZero extends RuntimeException{
    public DivisionByZero() {
    }

    public DivisionByZero(String message) {
        super(message);
    }
}
