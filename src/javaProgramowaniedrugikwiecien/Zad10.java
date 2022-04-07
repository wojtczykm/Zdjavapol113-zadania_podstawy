package javaProgramowaniedrugikwiecien;
import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {

        int digit = numFromUser();
        sum(digit);

    }

    private static int numFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe całkowitą");
        int userNumber = scanner.nextInt();
        return userNumber;
    }

private static int sum(int number){
    String text = String.valueOf(number);
    int suma = 0;
    for (int i = 0; i<text.length(); i++) {
        char letter = text.charAt(i);
        int digit = Character.getNumericValue( letter );
        suma = suma + digit;
    }
    System.out.println("Suma wszystkich cyfr to: "+suma);
    return suma;
    }
}
