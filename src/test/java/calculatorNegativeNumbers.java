import Calculator.Calculator;
        import Calculator.operations.*;
        import org.junit.Assert;
        import org.junit.Test;

        import static org.junit.Assert.assertEquals;
        import static org.junit.Assert.assertTrue;
public class calculatorNegativeNumbers {


    @Test
    public void resultSubtraction() {
        Operations subtraction = new Subtraction();
        double res = subtraction.showOperations(-8.0, -3.0, "-");
        assertEquals("Что-то пошло не так", -5.0, res, 0.0);
    }

    @Test
    public void resultAddition() {
        Operations addition = new Addition();
        double res = addition.showOperations(-8.0, -3.0, "+");
        assertEquals("Что-то пошло не так", -11.0, res, 0.0);
    }

    @Test
    public void resultMultiplication() {
        Operations multiplication = new Multiplication();
        double res = multiplication.showOperations(-8.0, -3.0, "*");
        assertEquals("Что-то пошло не так", 24.0, res, 0.0);
    }

    @Test
    public void resultDivision() {
        Operations division = new Division();
        double res = division.showOperations(-9.0, -3.0, "/");
        assertEquals("Что-то пошло не так", 3.0, res, 0.0);
    }

}
