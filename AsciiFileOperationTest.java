package com.company;

import org.junit.Test;

public class AsciiFileOperationTest {

   @Test
    public void testReverseSingleLine() {
        assertEquals( "!dlroW ,olleH", FileProcessor.reverseContent("Hello, World!"));
    }

    @Test
    public void testReverseMultipleLines() {
        String input = "Hello, World!\nWelcome to TDD.\n";
        String expectedOutput = "\n.DDT ot emocleW\n!dlroW ,olleH";
        assertEquals( expectedOutput, FileProcessor.reverseContent(input));
    }

    @Test
    public void testReverseEmptyString() {
        assertEquals( "", FileProcessor.reverseContent(""));
    }

    @Test
    public void testReverseSpecialCharacters() {
        assertEquals("%$#@!54321", FileProcessor.reverseContent("12345!@#$%"));
    }

}
