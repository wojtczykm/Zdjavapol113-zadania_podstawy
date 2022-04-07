package javaProgramowaniedrugikwiecien;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {

        float a = getFirstNumFromUser();
        char b = getMAthsChar();
        if(validationChar(b)){
            float c = getSecondNumFromUser();
            validationNum(a, c);
            float wynik = calc(a, b, c);
            System.out.println("wynik twojego działania to :" + wynik);
        }







    }

    private static float getFirstNumFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj pierwszą liczbę");
        float firstNum = scanner.nextFloat();
        return firstNum;
    }

    private static char getMAthsChar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj znak działania matematycznego");
        char mathChar = scanner.next().charAt(0);
        return mathChar;
        }

    private static float getSecondNumFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj druga liczbę");
        float secondNumm = scanner.nextFloat();
        return secondNumm;
    }

    private static void validationNum(float first, float second){

        if (second==0){
            System.out.println("działanie nie zgodne z matemtycznymi wtycznymi");
        }


    }
    private static boolean validationChar(char letter){

        switch (letter) {
            case '+':
            case '-':
            case '*':
            case '/':
                return true;
            default:
                System.out.println("wrong operator");
                return false;
        }

    }

    private static float calc(float pierwsza, char znak, float druga){
        float wynik=0;
        if (znak=='+'){
            wynik = pierwsza + druga;
        } else if (znak == '-') {
        wynik = pierwsza - druga;
        }
        else if (znak == '*') {
            wynik = pierwsza * druga;
        }
        else if (znak == '/') {
            wynik = pierwsza / druga;
        }
        return wynik;
    }
}