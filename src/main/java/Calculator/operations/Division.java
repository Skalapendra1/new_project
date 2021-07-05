package Calculator.operations;

public class Division implements Operations {
    @Override
    public void showOperations(Double sl1, Double sl2, String zn) {
        Double res= sl1/sl2;
        System.out.println("Деление - "+res.toString());
    }
}
