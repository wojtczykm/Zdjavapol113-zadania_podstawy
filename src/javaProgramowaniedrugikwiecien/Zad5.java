package javaProgramowaniedrugikwiecien;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System .in);
        System.out.println("please insert first digit: ");
        int firstDigit = scanner.nextInt();
        System.out.println("please insert seceond digit: ");
        int secondDigit = scanner.nextInt();


        int sum = sumOFTheSequence(firstDigit,secondDigit);
        System.out.println("suma wynosi: "+ sum);
    }

    private static int sumOFTheSequence(int firstDigit, int secondDigit) {
        if (firstDigit>secondDigit){
            int temp = firstDigit;//zmienna tymczasowa przechowujaca wartosc
            firstDigit = secondDigit;
            secondDigit = temp;
        }
       int sum = 0;
       for(int i = firstDigit; i<=secondDigit;i++){
        sum+=i;
       }

       //for(;firstDigit<=secondDigit;firstDigit++){
       //    sum+=firstDigit;
       //}

      /*  while(firstDigit<=secondDigit){
            sum += firstDigit;
            firstDigit++;
        }

        do {sum += firstDigit;
            firstDigit++;
        }
        while(firstDigit<=secondDigit);

       */



        return sum;
    }


}
