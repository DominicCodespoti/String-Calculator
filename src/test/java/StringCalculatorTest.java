import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {
    @Test
    public void emptyStringReturnsZero() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("");
        Assert.assertEquals(0, result);
    }

    @Test
    public void oneReturnsOne() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1");
        Assert.assertEquals(1, result);
    }

    @Test
    public void threeReturnsThree() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("3");
        Assert.assertEquals(3, result);
    }

    @Test
    public void oneAndTwoReturnsThree() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1,2");
        Assert.assertEquals(3, result);
    }

    @Test
    public void threeAndFiveReturnEight() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("3,5");
        Assert.assertEquals(8, result);
    }

    @Test
    public void oneAndTwoAndThreeReturnsSix() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1,2,3");
        Assert.assertEquals(6, result);
    }

    @Test
    public void threeAndFiveAndThreeAndNineReturnTwenty() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("3,5,3,9");
        Assert.assertEquals(20, result);
    }

    @Test
    public void oneAndTwoAndNewlineAndThreeReturnSix() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1,2\n3");
        Assert.assertEquals(6, result);
    }

    @Test
    public void threeAndNewlineAndFiveAndNewlineAndThreeAndNineReturnTwenty() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("3\n5\n3,9");
        Assert.assertEquals(20, result);
    }

    @Test
    public void oneAndTwoWithDelimitersReturnThree() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("//;\n1;2");
        Assert.assertEquals(3, result);
    }

    @Test
    public void oneAndTwoAndThreeWithNegatives() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("-1,2,-3");
        Assert.assertEquals(2, result);
    }

    @Test
    public void ignoreOverThousands() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1000,1001,2");
        Assert.assertEquals(2, result);
    }

    @Test
    public void longDelimiters() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("//[***]\n1***2***3");
        Assert.assertEquals(6, result);
    }

    @Test
    public void multipleDelimiters() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("//[*][%]\n1*2%3");
        Assert.assertEquals(6, result);
    }

    @Test
    public void multipleLongDelimiters() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("//[***][#][%]\n1***2#3%4");
        Assert.assertEquals(10, result);
    }

    @Test
    public void numberDelimiters() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("//[*1*][%]\n1*1*2%3");
        Assert.assertEquals(6, result);
    }
}
