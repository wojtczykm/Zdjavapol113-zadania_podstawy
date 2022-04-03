package javaProgramowanieTrzeciKwiecien;

public class Task2 {

    public static void main(String[] args) {
        String input ="programowanie";
        String prefix ="pro";

        boolean result = isWordContains(input,prefix);
        System.out.println(result);

    }
    private static boolean isWordContains(String input, String prefix) {
        if ( StringHelper.isValid(input) && StringHelper.isValid(prefix)) {
            return input.startsWith(prefix);
        }
        return false;
    }
}
