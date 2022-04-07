package javaProgramowaniedrugikwiecien;

public class Zad12 {
    public static void main(String[] args) {
        int x = 17;
        int y = 4;
        int wynik = modulo(x, y);
        System.out.println(wynik);
        ifTheSame(x,y);
    }

    private static int modulo(int a, int b) {
        int c = (a / b);
        int result = a-(c*b);
        return result;
    }

    private static boolean ifTheSame(int a, int b){
        int result = a%b;
        int doporownania= modulo(a,b);
        if (result == doporownania) {
            System.out.println("takie same wyniki");
            return true;
        }
        else{
            System.out.println("daje rozne wyniki");
        }
        return false;
    }
}
