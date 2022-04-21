package javaProgramowanieTrzecieZajecia;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("To start timing press ENTER");//jest print wiec nizej jest wywołanie nowej lini
        //żeby program czekał na enter
        scanner.nextLine();
        LocalTime startTime = LocalTime.now();//klasa LocalTime
        //.now to metoda klasy

        System.out.print("To stop timing press ENTER");
        scanner.nextLine();
        LocalTime stopTime = LocalTime.now();
        //użyte duration bo nie mozemy odejmowac prosto localtimów
        long durationInSeconds = Duration.between(startTime, stopTime).toSeconds();
        System.out.println("Total time: " + durationInSeconds + " sec.");
    }
}


