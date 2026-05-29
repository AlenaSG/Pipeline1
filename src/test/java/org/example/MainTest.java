package org.example;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    void testMainOutput() {
        // Capture the console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // run the main method
        Main.main(new String[]{});

        // verify the result (trimming to ignore line breaks)
        assertEquals("Hello, World!", outputStream.toString().trim());

        // reset the System.out
        System.setOut(System.out);
    }

}
