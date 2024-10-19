public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        // Check if x is negative or a multiple of 10 or is not 0
        if (x < 0 || (x % 10 == 0) && x != 0) {
            return false;
        }
        // when x is a single digit
        if (x == 0 || x == 1) {
            return true;
        }
        int revertedNumber = 0;
        int num = x;
        while (num > revertedNumber) {
            // get the last digit of x
            // and add it to the reverted number
            int lastDigit = num % 10;
            revertedNumber = revertedNumber * 10 + lastDigit;
            // Get the whole number without the last digit
            // and divide it by 10
            // to remove the last digit
            num /= 10;
        }
        // return true if the number is a palindrome
        return num == revertedNumber || num == revertedNumber / 10;
    }
}
