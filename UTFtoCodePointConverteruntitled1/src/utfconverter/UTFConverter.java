package utfconverter;

import java.io.IOException;

public class UTFConverter {
    /**
     * Converts a string to its Unicode code point.
     * @param input The input string (should contain a single character)
     * @return The Unicode code point of the first character
     * @throws IOException If the input is invalid
     */
    public static int getCodePoint(String input) throws IOException {
        if (input == null || input.isEmpty()) {
            throw new IOException("Input cannot be empty");
        }

        // If the input has multiple characters, only use the first one
        if (input.length() > 1) {
            System.out.println("Warning: Multiple characters provided, using only the first one");
            input = input.substring(0, 1);
        }

        // Use Java's built-in code point functionality
        return input.codePointAt(0);
    }
}