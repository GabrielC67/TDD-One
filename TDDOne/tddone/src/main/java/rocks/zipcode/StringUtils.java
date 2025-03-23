package rocks.zipcode;

import java.util.Arrays;

/**
 * EXERCISE 1: StringUtils
 * 
 * Implement the StringUtils class to make all tests pass.
 * The class should have methods to:
 * - reverse a string
 * - count occurrences of a character in a string
 * - check if a string is a palindrome (ignoring case and non-alphanumeric characters)
 */

 // Student must implement this class
public class StringUtils {
    // TODO: Implement the following methods to make the tests pass
    
    public static String reverse(String str) {
        // Your implementation here
        String[] strArr = new String[str.length()];
        String[] strSplit = str.split("");
        for(int i = str.length() - 1, j = 0; i >= 0; i--, j++){
            strArr[j] = strSplit[i];
        }
        return String.join("", strArr);
    }
    
    public static int countOccurrences(String str, char c) {
        // Your implementation here
        return 0;
    }
    
    public static boolean isPalindrome(String str) {
        // Your implementation here
        // Note: Ignoring case and non-alphanumeric characters
        return false;
    }
}

