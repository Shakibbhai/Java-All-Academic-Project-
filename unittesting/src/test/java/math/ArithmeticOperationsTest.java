package math;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for the ArithmeticOperations class.
 */
public class ArithmeticOperationsTest {

    private ArithmeticOperations operations;

    @Before
    public void setUp() throws Exception {
        operations = new ArithmeticOperations();
    }

    @After
    public void tearDown() throws Exception {
        operations = null;
    }

    @Test
    public void testDivide_Valid() {
        double result = operations.divide(10, 2);
        assertEquals(5.0, result, 0.0001);  // Expected result with a delta of 0.0001 for precision
    }

    @Test(expected = ArithmeticException.class)
    public void testDivide_ByZero() {
        operations.divide(10, 0);
    }

    @Test
    public void testMultiply_Valid() {
        int result = operations.multiply(5, 4);
        assertEquals(20, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMultiply_NegativeX() {
        operations.multiply(-1, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMultiply_NegativeY() {
        operations.multiply(5, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMultiply_BothNegative() {
        operations.multiply(-5, -5);
    }

    @Test
    public void testMultiply_ZeroY() {
        int result = operations.multiply(1234, 0);
        assertEquals(0, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMultiply_Overflow() {
        // Test multiplication overflow, should throw IllegalArgumentException
        operations.multiply(Integer.MAX_VALUE, 2);
    }
}
