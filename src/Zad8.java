import java.util.Scanner;

public class Zad8 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("podaj licznę dodatnią");
            int numberFromUsera = scanner.nextInt();

            if (numberFromUsera < 2) {
                System.out.println("brak liczb pierwszych");
            } else {
                System.out.println("Range from  " + 0 + " to " + numberFromUsera + ":");
                for (int i = 2; i <= numberFromUsera; i++) {
                    if (isNumPrimeNumber(i)) {
                        System.out.print(i+" ");
                    }
                }
            }
        }

        public static boolean isNumPrimeNumber(int n) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0 ) {
                    return false;
                }
            }
            return true;
        }
    }
