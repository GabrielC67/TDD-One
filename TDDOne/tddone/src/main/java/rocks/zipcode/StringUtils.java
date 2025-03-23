package rocks.zipcode;

import java.util.Objects;

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
        String[] strArr = reverseString(str);
        return String.join("", strArr);
    }


    public static int countOccurrences(String str, char c) {
        int counter = 0;
        for (char s : str.toCharArray()) {
            if (Objects.equals(c, s)) {
                counter++;
            }
        }
        return counter;
    }
    
    public static boolean isPalindrome(String str) {
        // Your implementation here
        // Note: Ignoring case and non-alphanumeric characters
        String[] strArr = reverseString(str);
        String palindrome = String.join("",strArr);
        StringBuilder newPalindrome = new StringBuilder();
        for (int j = 0; j < palindrome.length(); j++) {
            boolean b1 = Character.isDigit(palindrome.charAt(j));
            boolean b2 = Character.isAlphabetic(palindrome.charAt(j));
//
            if (b1 || b2){
                newPalindrome.append(palindrome.charAt(j));
            }
        }
        StringBuilder newStrBuilder = new StringBuilder();
        for (int k = 0; k < str.length(); k++) {
            boolean b3 = Character.isDigit(str.charAt(k));
            boolean b4 = Character.isAlphabetic(str.charAt(k));
            if (b3 || b4){
                newStrBuilder.append(str.charAt(k));
            }
        }
        String newStr = newStrBuilder.toString();
        String palinStr = newPalindrome.toString();

        return newStr.equalsIgnoreCase(palinStr);
    }

    private static String[] reverseString(String str) {
        String[] strArr = new String[str.length()];
        String[] strSplit = str.split("");
        for(int i = str.length() - 1, j = 0; i >= 0; i--, j++){
            strArr[j] = strSplit[i];
        }
        return strArr;
    }
}

