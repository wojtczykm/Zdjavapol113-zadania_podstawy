package javaProgramowanieTrzeciKwiecien;

public class Task8 {

    private static final int VALUE_APPER_A_IN_ASCII = 65;
    private static final int VALUE_APPER_Z_IN_ASCII = 90;
    private static final int VALUE_LOWER_IN_ASCI_A = 97;
    private static final int VALUE_LOWER_IN_ASCII_Z = 122;
    private static final int DIFFRENT_LOWER_AND_UPPER_IN_ASCII = 32;

    public static void main(String[] args) {

        String input = "Ala ma kota i psa";
        String result = replaceChars(input);
        System.out.println(result);

    }
private static String replaceChars(String input){
    if (StringHelper.isValid(input)){
        //String result="";
        StringBuilder resultsb = new StringBuilder();
        for (int i=0; i < input.length(); i++){
           char currentChar = input.charAt(i);

           if (isUpperLetter(currentChar)){
                //result += (char)(currentChar+ DIFFRENT_LOWER_AND_UPPER_IN_ASCII);
                resultsb.append((char)(currentChar+ DIFFRENT_LOWER_AND_UPPER_IN_ASCII));
           }
           else if (isLowerLetter(currentChar)){
               //result += (char)(currentChar-32);
               resultsb.append((char)(currentChar-DIFFRENT_LOWER_AND_UPPER_IN_ASCII));
           }
           else {
               resultsb.append(currentChar);
           }
        }
        return resultsb.toString();
    }
        return input;
}

    private static boolean isLowerLetter(char currentChar) {
        return currentChar >= VALUE_LOWER_IN_ASCI_A && currentChar <= VALUE_LOWER_IN_ASCII_Z;
    }

    private static boolean isUpperLetter(char currentChar) {
        return currentChar >= VALUE_APPER_A_IN_ASCII && currentChar <= VALUE_APPER_Z_IN_ASCII;
    }

}
