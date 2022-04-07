package javaProgramowanieTrzeciKwiecien;

public class Task11 {
    public static void main(String[] args) {
        String input = "ala";
        boolean result = isPalindrome(input);
        System.out.println(result);

    }

    private static boolean isPalindrome(String input) {
        return new StringBuilder(input)
                .reverse()
                .toString()
                .equals(input);
    }
}
