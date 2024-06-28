package src.main.com.logesh.strings;

import java.util.ArrayList;

/**
 * This class contains methods to generate all permutations of a given string.
 */
public class Permutations {

    /**
     * Main method to test the permutation methods.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        permutation("", "abc");
        System.out.println(permutationReturnArray("", "abc"));
        System.out.println(countTotalPermutations("", "abc"));
    }

    /**
     * Prints all permutations of a given string.
     *
     * @param processed   the string that has already been processed
     * @param unprocessed the string that still needs to be processed
     */
    static void permutation(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        for (int i = 0; i <= processed.length(); i++) {
            String f = processed.substring(0, i);
            String s = processed.substring(i, processed.length());
            permutation(f + ch + s, unprocessed.substring(1));
        }
    }

    /**
     * Returns an ArrayList of all permutations of a given string.
     *
     * @param processed   the string that has already been processed
     * @param unprocessed the string that still needs to be processed
     * @return ArrayList of all permutations
     */
    static ArrayList<String> permutationReturnArray(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            ArrayList<String> result = new ArrayList<>();
            result.add(processed);
            return result;
        }
        ArrayList<String> finalResult = new ArrayList<>();
        char ch = unprocessed.charAt(0);
        for (int i = 0; i <= processed.length(); i++) {
            String f = processed.substring(0, i);
            String s = processed.substring(i, processed.length());
            finalResult.addAll(permutationReturnArray(f + ch + s, unprocessed.substring(1)));
        }
        return finalResult;
    }

    /**
     * Counts the total number of permutations of a given string.
     *
     * @param processed   the string that has already been processed
     * @param unprocessed the string that still needs to be processed
     * @return the total number of permutations
     */
    static int countTotalPermutations(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = unprocessed.charAt(0);
        for (int i = 0; i <= processed.length(); i++) {
            String f = processed.substring(0, i);
            String s = processed.substring(i, processed.length());
            count = count + countTotalPermutations(f + ch + s, unprocessed.substring(1));
        }
        return count;
    }
}
