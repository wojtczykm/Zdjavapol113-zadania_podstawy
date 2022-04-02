package javaProgramowaniedrugikwiecien;

import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {
       int rangeFrom = 1;
       int rangeTo = 20;

       for(int i = rangeFrom;i <= rangeTo; i++){
           System.out.println(fizzBuzz(i));
       }
    }

    public static String fizzBuzz(int someNumber) {
        if (someNumber % 15 == 0) {
            return "fizzbuzz";
        }
        if (someNumber % 3 == 0) {
            return "fizz";
        }
        if (someNumber % 5 == 0) {
                return "buzz";
        }

            return String.valueOf(someNumber);
        }
    }

