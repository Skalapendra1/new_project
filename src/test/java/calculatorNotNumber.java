import org.junit.Assert;
import org.junit.Test;

public class calculatorNotNumber {
    @Test(expected = NumberFormatException.class)
    public void resultMultiplicate() {
        Double sl1 = Double.parseDouble("1");
        Double sl2 = Double.parseDouble("q");
        Double res = sl1 + sl2;
        Assert.assertEquals("Что-то не так", res, 8, 0);

    }

    @Test(expected = NumberFormatException.class)
    public void resultAddition() {
        Double sl1 = Double.parseDouble("/");
        Double sl2 = Double.parseDouble("q");
        Double res = sl1 + sl2;
        Assert.assertEquals("Что-то не так", res, 8, 0);

    }
    @Test(expected = NumberFormatException.class)
    public void resultDivision() {
        Double sl1 = Double.parseDouble("x");
        Double sl2 = Double.parseDouble("5");
        Double res = sl1 + sl2;
        Assert.assertEquals("Что-то не так", res, 8, 0);

    }
}