package src.main.com.logesh.strings;

import java.util.ArrayList;

/**
 * This class contains methods to generate all subsequences of a given string.
 */
public class SubSeq {

    /**
     * The main method to test the subseq and subseqArr methods.
     *
     * @param args command line arguments (not used in this method)
     */
    public static void main(String[] args) {
        subseq("", "abc");
        System.out.println(subseqArr("", "abc"));
    }

    /**
     * Prints all subsequences of the given string.
     *
     * @param processed the string that has already been processed
     * @param unprocessed the string that has not been processed yet
     */
    public static void subseq(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char first = unprocessed.charAt(0);
        subseq(processed + first, unprocessed.substring(1));
        subseq(processed, unprocessed.substring(1));
    }

    /**
     * Returns an ArrayList containing all subsequences of the given string.
     *
     * @param processed the string that has already been processed
     * @param unprocessed the string that has not been processed yet
     * @return an ArrayList of all subsequences
     */
    public static ArrayList<String> subseqArr(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            ArrayList<String> result = new ArrayList<>();
            result.add(processed);
            return result;
        }
        char first = unprocessed.charAt(0);
        ArrayList<String> left = subseqArr(processed + first, unprocessed.substring(1));
        ArrayList<String> right = subseqArr(processed, unprocessed.substring(1));
        left.addAll(right);
        return left;
    }
}
