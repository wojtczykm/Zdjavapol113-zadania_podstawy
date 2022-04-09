package javaProgramowanieTrzeciKwiecien;

import java.util.Scanner;

public class Task10 {
    static Scanner scanner = new Scanner(System .in);
    public static void main(String[] args) {

int ile=howManyWords();
String [] array = getWords(ile);
String ostatnie = getLastLetters(array);
        System.out.println(ostatnie);

    }
    private static int howManyWords(){

        System.out.println("How many words would you like insert?");
        int numOfWordsFromUser = scanner.nextInt();
        scanner.nextLine();
    return numOfWordsFromUser;
    }

    private static String[] getWords(int ileWyrazow){
        String[] array= new String[ileWyrazow];
        for(int i=0;i<ileWyrazow;i++){
            array[i]= scanner.nextLine();
        }
        return array;
    }

    private static String getLastLetters(String[] array){
        StringBuilder last = new StringBuilder();
        for(int i=0;i<array.length;i++){
            String a = array[i];
            char[] b = a.toCharArray();
            last.append(b[b.length - 1]);
        }
        System.out.println(last);
        return "";
    }

}
