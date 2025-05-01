package math;

import io.FileIO;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ArrayOperationsTest {

    private ArrayOperations arrayOperations;
    private FileIO fileIO;
    private MyMath myMath;

    @Before
    public void setUp() {
        arrayOperations = new ArrayOperations();
        fileIO = mock(FileIO.class);
        myMath = mock(MyMath.class);
    }

    @Test
    public void testFindPrimesInFile_withMixedNumbers() {
        String filepath = "test.txt";
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        when(fileIO.readFile(filepath)).thenReturn(numbers);
        when(myMath.isPrime(2)).thenReturn(true);
        when(myMath.isPrime(3)).thenReturn(true);
        when(myMath.isPrime(4)).thenReturn(false);
        when(myMath.isPrime(5)).thenReturn(true);
        when(myMath.isPrime(6)).thenReturn(false);
        when(myMath.isPrime(7)).thenReturn(true);
        when(myMath.isPrime(8)).thenReturn(false);
        when(myMath.isPrime(9)).thenReturn(false);
        when(myMath.isPrime(10)).thenReturn(false);
        when(myMath.isPrime(11)).thenReturn(true);

        int[] result = arrayOperations.findPrimesInFile(fileIO, filepath, myMath);
        int[] expected = {2, 3, 5, 7, 11};

        assertArrayEquals(expected, result);
    }

    @Test
    public void testFindPrimesInFile_withNoPrimes() {
        String filepath = "test2.txt";
        int[] numbers = {4, 6, 8, 9, 10};

        when(fileIO.readFile(filepath)).thenReturn(numbers);
        for (int num : numbers) {
            when(myMath.isPrime(num)).thenReturn(false);
        }

        int[] result = arrayOperations.findPrimesInFile(fileIO, filepath, myMath);
        assertArrayEquals(new int[0], result);
    }

    @Test
    public void testFindPrimesInFile_withEmptyFile() {
        String filepath = "empty.txt";
        when(fileIO.readFile(filepath)).thenReturn(new int[0]);

        int[] result = arrayOperations.findPrimesInFile(fileIO, filepath, myMath);
        assertArrayEquals(new int[0], result);
    }
    @Test
    public void testFindPrimesInFile_withDuplicates() {
        String filepath = "duplicates.txt";
        int[] numbers = {2, 3, 3, 5, 2};

        when(fileIO.readFile(filepath)).thenReturn(numbers);
        when(myMath.isPrime(2)).thenReturn(true);
        when(myMath.isPrime(3)).thenReturn(true);
        when(myMath.isPrime(5)).thenReturn(true);

        int[] result = arrayOperations.findPrimesInFile(fileIO, filepath, myMath);
        int[] expected = {2, 3, 3, 5, 2};

        assertArrayEquals(expected, result);
    }
}
