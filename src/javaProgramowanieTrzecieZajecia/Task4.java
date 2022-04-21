package javaProgramowanieTrzecieZajecia;

import java.util.regex.Pattern;

public class Task4 {

    private static final String REGEX = "a+ psik|Psik";//[pP] zamiast |Psik
    //private static final String REGEX = "a{1,} [pP]sik";

    public static void main(String[] args) {

        System.out.println(isContains("a psik"));
        System.out.println(isContains("a Psik"));
        System.out.println(isContains("aaa psik"));
        System.out.println();
        System.out.println(isContains("psik"));
        System.out.println(isContains("dummy value"));
        System.out.println(isContains("A psik"));

    }

    private static boolean isContains(String input) {
        Pattern pattern = Pattern.compile(REGEX);//buduje wzorzec z regexem
        return pattern.matcher(input).matches();
    }
}
