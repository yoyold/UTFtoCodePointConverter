package utfconverter;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a UTF character: ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                System.out.println("Error: No input provided");
                return;
            }

            try {
                int codePoint = UTFConverter.getCodePoint(input);
                System.out.printf("Code Point for '%s' is: U+%X (%d)%n",
                        input, codePoint, codePoint);
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}