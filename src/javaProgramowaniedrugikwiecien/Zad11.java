package javaProgramowaniedrugikwiecien;

import java.util.Random;
import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {

        int comp = getDigitFromComp();
        int user;
        boolean ifSame;
        do {
            user = digitFromUser();
            ifSame = ifTheSameDigits(user, comp);
        }
        while (!ifSame);
    }

    private static int getDigitFromComp() {
        Random r = new Random();
        int randomDigit = r.nextInt(101);

        return randomDigit;
    }

    private static int digitFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę jaką myslisz, że wylosował komputer");
        int guessNumber = scanner.nextInt();
        return guessNumber;
    }

    private static boolean ifTheSameDigits(int user, int comp) {
        if (user == comp) {
            System.out.println("Bingo");
            return true;
        } else if (user > comp)
            System.out.println("too much");
        else {
            System.out.println("not enough");
        }
        return false;
    }
}