package HomeJob_11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LetterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();

        Map<Character, Integer> letterCount = new HashMap<>();

        for (int i = 0; i < sentence.length(); i++) {
            char letter = sentence.charAt(i);
            if (Character.isLetter(letter)) {
                if (letterCount.containsKey(letter)) {
                    letterCount.put(letter, letterCount.get(letter) + 1);
                } else {
                    letterCount.put(letter, 1);
                }
            }
        }

        System.out.println("Letter counts:");
        for (char letter : letterCount.keySet()) {
            int count = letterCount.get(letter);
            System.out.println(letter + ": " + count);
        }
    }
}

