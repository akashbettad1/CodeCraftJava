package codingpractices;

public class StringPalindromeCheck {

    /**
     * Checks if the provided string is a palindrome.
     *
     * A palindrome is a string that reads the same forward and backward,
     * ignoring case and spaces.
     *
     * @param value the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public boolean checkStringPalindrome(String value) {

        if (value == null || value.isEmpty()) {
            return false;
        }

        value = value.trim().toLowerCase();

        int length = value.length();
        for (int i = 0; i < length /2; i++) {
            if (value.charAt(i) != value.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        StringPalindromeCheck palindromeCheck = new StringPalindromeCheck();
        System.out.println(palindromeCheck.checkStringPalindrome("madam"));
        System.out.println(palindromeCheck.checkStringPalindrome("Aabbaa"));
        System.out.println(palindromeCheck.checkStringPalindrome("racecar"));
        System.out.println(palindromeCheck.checkStringPalindrome("Palindrome"));
    }
}