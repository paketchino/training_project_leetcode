package leetcode;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int x) {
        boolean rls = true;
        String number = Integer.toString(x);
        int length = number.length();
        for (int i = 0; i < (length / 2); i++) {
            if (number.charAt(i) != number.charAt(length - i - 1)) {
                return false;
            }
        }
        return rls;
    }
}
