package src.main.com.logesh.strings;

import java.util.ArrayList;

/**
 * This class represents a phone pad with digits mapped to letters.
 * It provides methods to generate all possible combinations of letters for a given set of digits.
 */
public class PhonePad {

    /**
     * The main method to test the functionality of the class.
     *
     * @param args command line arguments (not used in this example)
     */
    public static void main(String[] args) {
        phonepadCombinations("", "19");
        System.out.println(phonepadCombinationsReturn("", "12"));
        System.out.println(phonepadCombinationsCount("", "12"));
    }

    /**
     * Prints all possible combinations of letters for a given set of digits.
     *
     * @param processed the letters already processed
     * @param unprocessed the digits yet to be processed
     */
    static void phonepadCombinations(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        int digit = unprocessed.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            phonepadCombinations(processed + ch, unprocessed.substring(1));
        }
    }

    /**
     * Returns a list of all possible combinations of letters for a given set of digits.
     *
     * @param processed the letters already processed
     * @param unprocessed the digits yet to be processed
     * @return a list of all possible combinations
     */
    static ArrayList<String> phonepadCombinationsReturn(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            ArrayList<String> result = new ArrayList<>();
            result.add(processed);
            return result;
        }
        int digit = unprocessed.charAt(0) - '0';
        ArrayList<String> finalResult = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            finalResult.addAll(phonepadCombinationsReturn(processed + ch, unprocessed.substring(1)));
        }
        return finalResult;
    }

    /**
     * Returns the count of all possible combinations of letters for a given set of digits.
     *
     * @param processed the letters already processed
     * @param unprocessed the digits yet to be processed
     * @return the count of all possible combinations
     */
    static int phonepadCombinationsCount(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            return 1;
        }
        int digit = unprocessed.charAt(0) - '0';
        int count = 0;
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            count = count + phonepadCombinationsCount(processed + ch, unprocessed.substring(1));
        }
        return count;
    }
}
