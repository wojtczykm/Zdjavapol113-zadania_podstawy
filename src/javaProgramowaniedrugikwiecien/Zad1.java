package javaProgramowaniedrugikwiecien;

public class Zad1 {
    public static void main(String[] args) {

        displayWordUsingDecimalFormat();
        System.out.println();
        displayWordUsingBinarylFormat();
        System.out.println();
        displayWordUsingHexFormat();



    }

    private static void displayWordUsingDecimalFormat(){
        char s = 83;
        char d = 68;
        char a = 65;

        System.out.print(s);
        System.out.print(d);
        System.out.print(a);

    }

    private static void displayWordUsingBinarylFormat(){
        char s = 0b01010011; //0b prefix przed kodem binarnym, zeby mogł odczytać kod jako litery
        char d = 0b01000100;
        char a = 0b01000001;

        System.out.print(s);
        System.out.print(d);
        System.out.print(a);

    }
    private static void displayWordUsingHexFormat(){
        char s = 0x53;//prefix 0x do kodu Hex
        char d = 0x44;
        char a = 0X41;

        System.out.print(s);
        System.out.print(d);
        System.out.print(a);

    }



}
