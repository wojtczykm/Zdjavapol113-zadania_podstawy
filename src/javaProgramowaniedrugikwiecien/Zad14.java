package javaProgramowaniedrugikwiecien;

import java.util.Scanner;

public class Zad14 {

    public static final double MIN_AMOUNT = 100.00;
    public static final double MAX_AMOUNT = 10000.00;
    public static final double SET_MIN_AMOUNT = 1000.00;
    public static final double SET_MAX_AMOUNT = 5000.00;
    public static final int MIN_INSTALLMENTS = 6;
    public static final int MAX_INSTALLMENTS = 48;
    public static final int SET_MIN_INSTLLMENTS = 18;
    public static final int SET_MAX_INSTALLMENTS = 36;

    public static void main(String[] args) {

        double amount = getAmountFromClient();
        int installments = getInstallmentFromClient();

        double montlyRate = amountWithInterest(amount,installments);
        System.out.println("Single instalment: "+montlyRate);

    }

    private static double getAmountFromClient(){
        Scanner scanner = new Scanner(System .in);
        System.out.println("what loan amount do you want?");
        double amountFromUser = scanner.nextDouble();
        scanner.nextLine();
        if(amountFromUser<= MIN_AMOUNT){
            amountFromUser= SET_MIN_AMOUNT;
            System.out.println("Amount is too low. Default value 1000,00 was set");
        }
        else if(amountFromUser>= MAX_AMOUNT){
            amountFromUser= SET_MAX_AMOUNT;
            System.out.println("Amount is too big. Default value 5000,00 was set");
        }
        return amountFromUser;
    }
    private static int getInstallmentFromClient(){
        Scanner scanner = new Scanner(System .in);

        System.out.println("how many installments do you want?");
        int installmentFromUser = scanner.nextInt();
        scanner.nextLine();
        if(installmentFromUser<= MIN_INSTALLMENTS){
            installmentFromUser= SET_MIN_INSTLLMENTS;
            System.out.println("Installments is too low. Default value 18 was set");
        }
        else if(installmentFromUser>= MAX_INSTALLMENTS){
            installmentFromUser= SET_MAX_INSTALLMENTS;
            System.out.println("Installments is too big. Default value 36 was set");
        }
        return installmentFromUser;
    }

    private static double amountWithInterest(double amount, int installment){
        double interesetForClient=0.0;
        double allAmountPerMonth=0.0;
        if (installment>=6&&installment<=12){
            interesetForClient = amount*2.5/100;
        }
        else if (installment>=13&&installment<=24) {
            interesetForClient = amount*5/100;
        }
        else if (installment>=25&&installment<=48) {
            interesetForClient = amount*10/100;
        }
        return allAmountPerMonth = (amount+interesetForClient)/installment;
    }

    }




