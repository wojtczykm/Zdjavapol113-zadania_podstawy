package javaProgramowanieTrzeciKwiecien;

public class Task1 {
    public static char DEFAULT_CHAR = '\u0000';
    public static void main(String[] args) {

        String input ="domek";
        char result = getLastChar(input);
        System.out.println(result);

        //input = null;
        //result = getLastChar(null);
        //System.out.println(result);

    }
    private static char getLastChar(String input) {
        if (input != null && !input.isBlank()) {
            int lastPosition = input.length() - 1;
            return input.charAt(lastPosition);
        }

        return DEFAULT_CHAR;
    }
}
