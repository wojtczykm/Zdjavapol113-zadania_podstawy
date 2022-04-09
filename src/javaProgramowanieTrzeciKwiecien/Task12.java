package javaProgramowanieTrzeciKwiecien;

import java.util.Scanner;

public class Task12 {
    static Scanner scanner = new Scanner(System .in);
    public static void main(String[] args) {

        String zdanie = sentenceFromUser();
        int ile = howMany();
        String kod = encrypt(zdanie, ile);
        System.out.println("Encrypted text: "+kod);

    }

private static String sentenceFromUser(){

    System.out.println("Please insert your text:");
    String text = scanner.nextLine();
        return text;
}

private static int howMany(){
    System.out.println("Please insert shift: ");
    int thatMany = scanner.nextInt();
    scanner.nextLine();
        return thatMany;
}
    private static String encrypt(String txt, int key ) {
        String encrypted = "";

        for (int i = 0; i < txt.length(); i++)
        {
            if (Character.isUpperCase(txt.charAt(i)))
            {
                int characterIndex = (char)(txt.charAt(i)) - (char)('A');
                int characterShifted = (characterIndex + key) % 26 +  (char)('A');
                encrypted += (char)(characterShifted);
            }
            else if (Character.isLowerCase(txt.charAt(i)))
            {
                int characterIndex = (char)(txt.charAt(i)) - (char)('a');
                int characterShifted = (characterIndex + key) % 26 +  (char)('a');
                encrypted += (char)(characterShifted);
            }
            else if (Character.isDigit(txt.charAt(i)))
            {
                int  characterNew = ((int)(txt.charAt(i)) + key) % 10;
                encrypted += (char)(characterNew);
            }
            else
            {
                encrypted += txt.charAt(i);
            }
        }
        return encrypted;
    }

}
