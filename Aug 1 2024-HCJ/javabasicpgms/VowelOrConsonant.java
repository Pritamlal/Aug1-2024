import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a single letter: ");
        String input = scn.next(); // Read input as a String

        // Check if the input length is 1 to ensure a single character was entered
        if (input.length() == 1) {
            char letter = Character.toLowerCase(input.charAt(0)); // Extract the first character and convert to lowercase

            // Check if the character is a letter
            if (Character.isLetter(letter)) {
                if (isVowel(letter)) {
                    System.out.println(letter + " is a vowel.");
                } else {
                    System.out.println(letter + " is a consonant.");
                }
            } else {
                System.out.println("The input is not a valid letter.");
            }
        } else {
            System.out.println("Please enter only a single letter.");
        }

        scn.close();
    }

    // Method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
