package javaProgramowaniedrugikwiecien;

import java.util.Scanner;

public class Zad13 {

    public static void main(String[] args) {

        float srednia = average();
        System.out.println("srednia: " + srednia);

    }

    private static float average() {
        int counterAll = 0;
        int counterPlus = 0;
        float average1 = 0;
        int digit = 0;
        int suma = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("podaj liczbę");
            digit = scanner.nextInt();
            scanner.nextLine();
            counterAll++;
            if (digit == 0) {
                System.out.println("podałęś 0, koniec programu");
            } else {
                if (digit % 2 == 0) {
                    {
                        counterPlus++;
                    }
                    suma += digit;
                } else {
                    suma += digit;
                }
                average1 = (float) suma / counterAll;
            }
        }
        while (digit != 0);
        System.out.println("ilość liczb: " + (--counterAll));
        System.out.println("ilość liczb parzystych: " + counterPlus);
        return average1;
    }
}
