package utfconverter;

import java.io.IOException;

public class UTFConverter {
    /**
     * Converts a string to its Unicode code point.
     * @param input The input string
     * @return The Unicode code point of the character
     * @throws IOException If the input is invalid
     */
    public static int getCodePoint(String input) throws IOException {
        if (input == null || input.isEmpty()) {
            throw new IOException("Input cannot be empty");
        }

        // Get the code point count
        int codePointCount = input.codePointCount(0, input.length());

        if (codePointCount > 1) {
            System.out.println("Warning: Multiple characters provided, using only the first one");
            // Get just the first code point
            return input.codePointAt(0);
        } else {
            // Handle a single code point correctly, even if it's a surrogate pair
            return input.codePointAt(0);
        }
    }
}