// Question  number 9 of leetcode (EASY)
class Palindrome9 {
    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        String reverse = new StringBuilder(str).reverse().toString();
        if (str.equals(reverse)) {

            return true;
        } else {

            return false;
        }
    }

    public static void main(String[] args) {
        int x = 121;

        System.out.println(isPalindrome(x));
    }
}