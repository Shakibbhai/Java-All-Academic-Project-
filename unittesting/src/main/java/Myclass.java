import math.ArithmeticOperations;
import org.junit.Test;
import static org.junit.Assert.*;

public class Myclass {

    ArithmeticOperations operations = new ArithmeticOperations();

    // Test normal divisio
    @Test
    public void testDivide_Valid() {
        double result = operations.divide(10, 2);
        assertEquals(5.0, result, 0.0001);
    }

    // Test division by zero (should throw ArithmeticException)
    @Test(expected = ArithmeticException.class)
    public void testDivide_ByZero() {
        operations.divide(10, 0);
    }

    // Test normal multiplication
    @Test
    public void testMultiply_Valid() {
        int result = operations.multiply(5, 4);
        assertEquals(20, result);
    }

    // Test multiplication with x negative (should throw IllegalArgumentException)
    @Test(expected = IllegalArgumentException.class)
    public void testMultiply_NegativeX() {
        operations.multiply(-1, 5);
    }

    // Test multiplication with y negative (should throw IllegalArgumentException)
    @Test(expected = IllegalArgumentException.class)
    public void testMultiply_NegativeY() {
        operations.multiply(5, -1);
    }

    // Test multiplication with both negative (should throw IllegalArgumentException)
    @Test(expected = IllegalArgumentException.class)
    public void testMultiply_BothNegative() {
        operations.multiply(-5, -5);
    }

    // Test multiplication with y = 0 (should return 0)
    @Test
    public void testMultiply_ZeroY() {
        int result = operations.multiply(1234, 0);
        assertEquals(0, result);
    }

    // Test multiplication overflow (should throw IllegalArgumentException)
    @Test(expected = IllegalArgumentException.class)
    public void testMultiply_Overflow() {
        operations.multiply(Integer.MAX_VALUE, 2);
    }
}
