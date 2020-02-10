import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

//Create a Calculator class. This should have functions for Add, Subtract, Multiply and Divide. Your methods should take in two ints to perform the calculations on (except the Divide method. This should take two doubles as arguments).



public class CalculatorTest {

    @Test
    public void can_add() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    public void can_subtract() {
        assertEquals(1, Calculator.subtract(3, 2));
    }

    @Test
    public void can_multiply() {
        assertEquals(6, Calculator.multiply(3, 2));
    }

    @Test
    public void can_divide() {
        assertEquals(2.00,Calculator.divide(20.00, 10.00), 0.01);
    }
}
