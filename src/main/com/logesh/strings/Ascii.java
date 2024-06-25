package src.main.com.logesh.strings;

/**
 * This class contains methods to generate all possible subsequences of a given string.
 */
public class Ascii {

    /**
     * The main method to test the subseqAscii method.
     *
     * @param args command line arguments (not used in this case)
     */
    public static void main(String[] args) {
        subseqAscii("", "abc");
    }

    /**
     * This method generates all possible subsequences of a given string.
     *
     * @param processed The string that has already been processed.
     * @param unprocessed The string that still needs to be processed.
     */
    public static void subseqAscii(String processed, String unprocessed) {
        // Base case: if the unprocessed string is empty, print the processed string and return.
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        // Get the first character of the unprocessed string.
        char first = unprocessed.charAt(0);

        // Recursive case:
        // 1. Add the first character to the processed string and process the remaining characters.
        subseqAscii(processed + first, unprocessed.substring(1));

        // 2. Process the remaining characters without adding the first character to the processed string.
        subseqAscii(processed, unprocessed.substring(1));

        // 3. Add the ASCII value of the first character to the processed string and process the remaining characters.
        subseqAscii(processed + (first + 0), unprocessed.substring(1));
    }
}
