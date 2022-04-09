package javaProgramowanieTrzeciKwiecien;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        getStringFromUser();

    }

    private static void getStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        String fromUser;
        String theLongest = "";

        do {
            System.out.print("Please insert your text: ");
            fromUser = scanner.nextLine();
            System.out.println(fromUser.length());
            if (fromUser.equals("")) {
                System.out.println("Not input");
            }
            else if (fromUser.equals("stop")) {
                System.out.println(theLongest);
            }
            else {
                if (theLongest.length() < fromUser.length()) {
                    theLongest = fromUser;
                }
            }
        }
        while (!fromUser.equals("stop"));
    }
}