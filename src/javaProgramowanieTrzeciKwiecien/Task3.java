package javaProgramowanieTrzeciKwiecien;

public class Task3 {
    public static void main(String[] args) {

        String input = "ala ma kota";
        String word = "ma";

        int result = getIndex(input, word);
        System.out.println(result);

    }

    private static int getIndex(String input, String word) {
        if (StringHelper.isValid(input) && StringHelper.isValid(word)) {
            /*boolean result = input.contains(word);
            if (result) {
                return input.indexOf(word);
            }
        }*/
        }
        return input.indexOf(word);
    }



}