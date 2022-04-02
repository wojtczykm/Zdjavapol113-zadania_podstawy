package javaProgramowaniedrugikwiecien;

public class Zad8RozwiazanieTrenera {
    public static void main(String[] args) {
        int rangeFrom = 0;
        int rangeTo = 15;

        for(int i = rangeFrom; i <= rangeTo; i++){
            if(isPrimeNumber(i))
                System.out.println(i);
        }
    }

    private static boolean isPrimeNumber(int number) {

        if (number<2){
            return false;
        }

        for ( int i = 2; i<= number/2; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
