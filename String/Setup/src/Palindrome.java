public class Palindrome {
    static boolean isPalindrome(String str) {
        for (int i = 0; i <= str.length() / 2; i++) {
            char l = str.charAt(i);
            char r = str.charAt(str.length() - 1 - i);
            if (l != r) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        // String str = new String ("abcdcba"); //why waste space creating new obj agar
        // already heap me rakha hoga aisa kuch toh
        String str = "abcdcba";
        System.out.println(isPalindrome(str));
    }
}
