import Calculator.Calculator;
import Calculator.operations.*;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class calculatorFractionalNumber {


    @Test
    public void resultSubtraction() {
        Operations subtraction = new Subtraction();
        double res = subtraction.showOperations(-8.28, 3.75, "-");
        assertEquals("Что-то пошло не так", -12.03, res, 0.0);
    }

    @Test
    public void resultAddition() {
        Operations addition = new Addition();
        double res = addition.showOperations(8.28, 3.75, "+");
        assertEquals("Что-то пошло не так", 12.03, res, 0.0);
    }

    @Test
    public void resultMultiplication() {
        Operations multiplication = new Multiplication();
        double res = multiplication.showOperations(8.28, 3.75, "*");
        assertEquals("Что-то пошло не так", 31.05, res, 0.0000001);
    }

    @Test
    public void resultDivision() {
        Operations division = new Division();
        double res = division.showOperations(-8.635, 3.14, "/");
        assertEquals("Что-то пошло не так", -2.75, res, 0.0);
    }
    @Test
    public void NotNumber() {
        Operations division = new Division();
        double res = division.showOperations(-8.635, 3.14, "/");
        assertEquals("Что-то пошло не так", -2.75, res, 0.0);
    }

}

