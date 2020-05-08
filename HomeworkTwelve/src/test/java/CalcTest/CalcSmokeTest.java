package CalcTest;

import Calculator.CalculatorLogic;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;


public class CalcSmokeTest {

    private CalculatorLogic calc = new CalculatorLogic();

    @Test(enabled = true, groups = "CalculatorTest")
    public void testAddition() throws Exception {
        assertThat(CalculatorLogic.addition(2,3), Matchers.equalTo(5));
    }
    @Test(enabled = true, groups = "CalculatorTest")
    public void testSubtraction() throws Exception {
        assertThat(CalculatorLogic.subtraction(10,3), Matchers.equalTo(7));
    }
    @Test(enabled = true, groups = "CalculatorTest")
    public void testMultiplication() throws Exception {
        assertThat(CalculatorLogic.multiplication(2,3), Matchers.equalTo(6));
    }

    @Test(enabled = true, groups = "CalculatorTest")
    public void testDivision() throws Exception {
        assertThat(CalculatorLogic.division(5,2), Matchers.<Double>equalTo(2.5));
    }

    @Test(enabled = true, expectedExceptions = {Exception.class, ArithmeticException.class})
    public void exceptionTestTwo() throws Exception {
        CalculatorLogic.division(0, 9);
        throw new Exception();
    }

}

