package src.main.com.logesh.strings;


public class Stream {
    public static void main(String[] args) {
        skip("","abcdfddaabc");
        System.out.println(skip("abca"));
        System.out.println(skipApple("ahdapplebc"));
        System.out.println(skipAppButNotApple("abcappleapp"));
    }

    /**
 * This method recursively processes a string by skipping over occurrences of the character 'a'
 * and accumulating the remaining characters in a new string.
 *
 * @param processed The string that has already been processed, initially an empty string.
 * @param unprocessed The string that still needs to be processed.
 *
 * @return The final processed string after skipping over all occurrences of 'a'.
 *
 * @throws IllegalArgumentException if either of the input strings is null.
 */
/**
 * This method recursively processes a string by skipping over occurrences of the character 'a'
 * and accumulating the remaining characters in a new string.
 *
 * @param processed The string that has already been processed, initially an empty string.
 * @param unprocessed The string that still needs to be processed.
 *
 * @return The final processed string after skipping over all occurrences of 'a'.
 *
 * @throws IllegalArgumentException if either of the input strings is null.
 */
public static void skip(String processed ,String unprocessed){
    // Check if the unprocessed string is empty
    if(unprocessed.isEmpty()) {
        // Print the final processed string
        System.out.println(processed);
        // Return from the method
        return;
    }

    // Get the first character of the unprocessed string
    char first=unprocessed.charAt(0);

    // Check if the first character is 'a'
    if(first == 'a'){
        // Skip over 'a' by recursively calling the method with the unprocessed string excluding the first character
        skip(processed,unprocessed.substring(1));
    }else{
        // Accumulate the non-'a' character by recursively calling the method with the processed string including the first character
        skip(processed+first,unprocessed.substring(1));
    }
}
    /**
 * This method recursively processes a string by skipping over occurrences of the character 'a'
 * and accumulating the remaining characters in a new string.
 *
 * @param unprocessed The string that still needs to be processed.
 *
 * @return The final processed string after skipping over all occurrences of 'a'.
 *
 * @throws IllegalArgumentException if the input string is null.
 */
public static String skip(String unprocessed){

    // Check if the unprocessed string is empty
    if(unprocessed == null) {
        throw new IllegalArgumentException("Input string cannot be null");
    }

    if(unprocessed.isEmpty()) {
        // Return an empty string when the unprocessed string is empty
        return "";
    }

    // Get the first character of the unprocessed string
    char first=unprocessed.charAt(0);

    // Check if the first character is 'a'
    if(first == 'a'){
        // Skip over 'a' by recursively calling the method with the unprocessed string excluding the first character
        return skip(unprocessed.substring(1));
    }else{
        // Accumulate the non-'a' character by recursively calling the method with the processed string including the first character
        return first+skip(unprocessed.substring(1));
    }
}

    /**
 * This method recursively processes a string by skipping over occurrences of the substring "apple"
 * and accumulating the remaining characters in a new string.
 *
 * @param unprocessed The string that still needs to be processed.
 *
 * @return The final processed string after skipping over all occurrences of "apple".
 *
 * @throws IllegalArgumentException if the input string is null.
 */
public static String skipApple(String unprocessed){

    // Check if the unprocessed string is empty
    if(unprocessed == null) {
        throw new IllegalArgumentException("Input string cannot be null");
    }

    // Check if the unprocessed string is empty
    if(unprocessed.isEmpty()) {
        // Return an empty string when the unprocessed string is empty
        return "";
    }

    // Check if the unprocessed string starts with "apple"
    if(unprocessed.startsWith("apple")){
        // Skip over "apple" by recursively calling the method with the unprocessed string excluding the first 5 characters
        return skip(unprocessed.substring(5));
    }else{
        // Accumulate the non-"apple" character by recursively calling the method with the processed string including the first character
        return unprocessed.charAt(0)+skipApple(unprocessed.substring(1));
    }
}

    /**
 * This method recursively processes a string by skipping over occurrences of the substring "app"
 * but not "apple", and accumulating the remaining characters in a new string.
 *
 * @param unprocessed The string that still needs to be processed.
 *
 * @return The final processed string after skipping over all occurrences of "app" but not "apple".
 *
 * @throws IllegalArgumentException if the input string is null.
 */
public static String skipAppButNotApple(String unprocessed){

    // Check if the unprocessed string is empty
    if(unprocessed.isEmpty()) {
        // Return an empty string when the unprocessed string is empty
        return "";
    }

    // Get the first character of the unprocessed string
    char first=unprocessed.charAt(0);

    // Check if the unprocessed string starts with "app" but not "apple"
    if(unprocessed.startsWith("app") && !unprocessed.startsWith("apple")){
        // Skip over "app" by recursively calling the method with the unprocessed string excluding the first 3 characters
        return skipAppButNotApple(unprocessed.substring(3));
    }else{
        // Accumulate the non-"app" character by recursively calling the method with the processed string including the first character
        return first+skipAppButNotApple(unprocessed.substring(1));
    }
}


}
