import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {
    @Test public void emptyStringReturnsZero() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("");
        Assert.assertEquals(0, result);
    }

    @Test public void oneReturnsOne() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1");
        Assert.assertEquals(1, result);
    }

    @Test public void threeReturnsThree() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("3");
        Assert.assertEquals(3, result);
    }

    @Test public void oneAndTwoReturnsThree() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1,2");
        Assert.assertEquals(3, result);
    }

    @Test public void threeAndFiveReturnEight() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("3,5");
        Assert.assertEquals(8, result);
    }
}
