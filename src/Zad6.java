import java.util.Scanner;

public class Zad6 {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        for(int i=1;i<5;i++){
            int multipluy= 5*i;
            System.out.println("5 x "+ i + " = " + multipluy);
        }

        printMultiplicationTable(6, 2, 5);

    }

    public static void printMultiplicationTable(int multiplier, int minMultiplicand, int maxMultiplicand) {
        for (int i = minMultiplicand; i <= maxMultiplicand; i++) {
            int result = multiplier * i;
            System.out.println(multiplier + " x " + i + " = " + result);
        }
    }
}

