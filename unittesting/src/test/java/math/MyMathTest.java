package math;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyMathTest {

    private MyMath myMath;

    @Before
    public void setUp() throws Exception {
        myMath = new MyMath();
    }

    @After
    public void tearDown() throws Exception {
        myMath = null;
    }

    @Test
    public void testFactorialForZero() {
        assertEquals(1, myMath.factorial(0));
    }

    @Test
    public void testFactorialForOne() {
        assertEquals(1, myMath.factorial(1));
    }

    @Test
    public void testFactorialForSmallNumber() {
        assertEquals(2, myMath.factorial(2));
    }

    @Test
    public void testFactorialForMediumNumber() {
        assertEquals(120, myMath.factorial(5));
    }

    @Test
    public void testFactorialForUpperBound() {
        assertEquals(479001600, myMath.factorial(12));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialForNegativeNumber() {
        myMath.factorial(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialForNumberAboveUpperBound() {
        myMath.factorial(13);
    }

    @Test
    public void testIsPrimeForTwo() {
        assertTrue(myMath.isPrime(2));
    }

    @Test
    public void testIsPrimeForSmallPrime() {
        assertTrue(myMath.isPrime(3));
    }

    @Test
    public void testIsPrimeForMediumPrime() {
        assertTrue(myMath.isPrime(17));
    }

    @Test
    public void testIsPrimeForLargePrime() {
        assertTrue(myMath.isPrime(7919));
    }

    @Test
    public void testIsPrimeForSmallNonPrime() {
        assertFalse(myMath.isPrime(4));
    }

    @Test
    public void testIsPrimeForMediumNonPrime() {
        assertFalse(myMath.isPrime(15));
    }

    @Test
    public void testIsPrimeForLargeNonPrime() {
        assertFalse(myMath.isPrime(7920));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPrimeForOne() {
        myMath.isPrime(1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPrimeForNegativeNumber() {
        myMath.isPrime(-5);
    }
}