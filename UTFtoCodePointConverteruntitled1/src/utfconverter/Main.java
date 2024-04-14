package utfconverter;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import static utfconverter.UTFtoCodePointConverter.convertToCodePoint;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a UTF character: ");
        String utfCharacter = scanner.next();

        try {
            int codePoint = convertToCodePoint(utfCharacter);
            System.out.println("Code Point for " + utfCharacter + " is: " + codePoint);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}