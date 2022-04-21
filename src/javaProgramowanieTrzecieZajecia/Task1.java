package javaProgramowanieTrzecieZajecia;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

   private static final String EMAIL_VALIDATOR = "[a-zA-Z0-9_.-]+@[a-z]+(\\.[a-z]*)?";
//[\\w\\d_.-]+@[\\w]+(\.[\\w]*)?
    public static void main(String[] args) {
        System.out.println( "sda@com: "+ isValidFormat("sda@com"));
        System.out.println( "sda@com.pl: "+ isValidFormat("sda@com.pl"));

    }

    private  static boolean isValidFormat(String emailAdress){
        Pattern pattern = Pattern.compile(EMAIL_VALIDATOR);//buduje wzorzec z regexem
        return pattern.matcher(emailAdress).matches();

        //Matcher matcher = pattern.matcher(emailAdress);
        //return matcher.matches();


    }

}
