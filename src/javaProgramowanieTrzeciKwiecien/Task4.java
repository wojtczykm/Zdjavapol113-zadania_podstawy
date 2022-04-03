package javaProgramowanieTrzeciKwiecien;

public class Task4 {

    public static final String REPLECMAENT = "-STOP-";

    public static void main(String[] args) {

        String input = "Ala ma kota. Ale, Ala ma kota.";
        String result = replace(input);
        System.out.println(result);

    }

    private static String replace(String input) {
        if (StringHelper.isValid(input)) {
        /*return input
            .replace(".", REPLECMAENT)
            .replace(",",REPLECMAENT);*/
            return input.replaceAll("[,.]", REPLECMAENT);

        }
        return input;
    }
}
