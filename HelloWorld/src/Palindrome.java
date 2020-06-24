public class Palindrome 
{
    /**
     * This program lets the user input some text and
     * prints out whether or not that text is a palindrome.
     */
    public static void main(String[] args)
    {
        String text = "WeddeW";
        if(isPalindrome(text))
        {
            System.out.println("Your word " + text + " is a palindrome!");
        }
        else
        {
            System.out.println("Your word " + text + " is NOT a palindrome!");
        }
    }

    /**
     * This method determines if a String is a palindrome,
     * which means it is the same forwards and backwards.
     * 
     * @param text The text we want to determine if it is a palindrome.
     * @return A boolean of whether or not it was a palindrome.
     */
    private static boolean isPalindrome(String text)
    {
        String reversed = reverse(text);
        if(text.equals(reversed))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * This method reverses a String.
     * 
     * @param text The string to reverse.
     * @return The new reversed String.
     */
    private static String reverse(String text)
    {
        String result = "";
        for(int i = text.length() - 1; i >= 0; i--)
        {
            char cur = text.charAt(i);
            result += cur;
        }
        return result;
    }
}