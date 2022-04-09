package javaProgramowanieTrzeciKwiecien;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        String zdanie = getSentenseFromUser();
        double wynik = percent(zdanie);

        System.out.println(wynik);

    }

    private static String getSentenseFromUser(){
        Scanner scanner = new Scanner((System .in));
        System.out.println("Użytkowniku podaj zdanie");
        String sentence = scanner.nextLine();
        return sentence;
    }

    private static int[] howManyLetter(String sentence){
        int counterOfLetter=0;
        int counterOfSpace=0;

            for (char c : sentence.toCharArray()) {
                if (c == ' ') {
                    counterOfSpace++;
                }
                else {
                    counterOfLetter++;
                }
            }
            int [] array ={counterOfLetter,counterOfSpace};

            return array;

    }

    private static double percent(String senstence){
        int [] array2 = howManyLetter(senstence);
        int letters = array2[0];
        int spaces = array2[1];
        int both = spaces+letters;

        double dzielenie = (double)spaces/both;
        return dzielenie*100;

    }
}
