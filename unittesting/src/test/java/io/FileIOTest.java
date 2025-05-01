package io;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.URL;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class FileIOTest {

    private FileIO fileIO;

    @Before
    public void setUp() throws Exception {
        fileIO = new FileIO();
    }

    @After
    public void tearDown() throws Exception {
        fileIO = null;
    }

    private String getPath(String fileName) {
        URL resource = getClass().getClassLoader().getResource(fileName);
        assertNotNull("Test file not found: " + fileName, resource);
        try {
            return Paths.get(resource.toURI()).toString();
        } catch (Exception e) {
            throw new RuntimeException("Failed to convert URL to path", e);
        }
    }


    @Test
    public void testReadFileWithValidData() {
        int[] result = fileIO.readFile(getPath("grades_valid.txt"));
        int[] expected = {3, 9, 0, 2, 10, 9, 3, 8, 0, 3}; // ✅ Update this to match your file content
        assertArrayEquals(expected, result);
    }


    @Test
    public void testReadFileWithInvalidEntries() {
        int[] result = fileIO.readFile(getPath("grades_invalid.txt"));
        int[] expected = {3, 9, 2, 10, 8, 0, 3}; // ✔️ Only valid integers retained
        assertArrayEquals(expected, result);
    }

    @Test
    public void testReadEmptyFileThrowsException() {
        try {
            fileIO.readFile(getPath("empty_file.txt"));
            fail("Expected IllegalArgumentException for empty file");
        } catch (IllegalArgumentException e) {
            assertEquals("Given file is empty", e.getMessage());
        }
    }

    @Test
    public void testNonExistingFileThrowsException() {
        try {
            fileIO.readFile("nonexistent.txt");
            fail("Expected IllegalArgumentException for non-existing file");
        } catch (IllegalArgumentException e) {
            assertEquals("Input file does not exist", e.getMessage());
        }
    }
}
