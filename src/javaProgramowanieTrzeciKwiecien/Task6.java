package javaProgramowanieTrzeciKwiecien;

public class Task6 {
    public static void main(String[] args) {
        String input = "kupa jeza nietoprza";
        char letter = 'p';
        int result = numberOfIndex(input, letter);
        System.out.println(result);
    }

    private static int numberOfIndex(String input, char searchLetter) {
        if (StringHelper.isValid(input)) {
            String singleChar = (String.valueOf(searchLetter));
            return input.indexOf(singleChar);
        }
        return -1;
    }
}
