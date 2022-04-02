package javaProgramowaniedrugikwiecien;

import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {
        String decision = null;
        String STOP_DECISION = "stop";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("podaj pierwszą liczbę: ");
            float firstDigit = scanner.nextFloat();
            scanner.nextLine();

            System.out.println("podaj operator: ");
            String operator = scanner.nextLine();

            System.out.println("podaj druga liczbę ");
            float secondDigit = scanner.nextFloat();
            scanner.nextLine();

             calculat(firstDigit, secondDigit, operator);
            //System.out.println("result: " + result);

            System.out.println("nowa operacja or stop ?");
            decision=scanner.nextLine();
        }
        while (!STOP_DECISION.equals(decision));
    }

    private static void calculat(float firstNum, float secondNum, String operrator) {
        float result=0;
        boolean isresult=true;
        if(operrator.equals("+")){
            result=firstNum+secondNum;
        }
        else if (operrator.equals("-")){
            result=firstNum-secondNum;
        }
        else if (operrator.equals("*")){
            result=firstNum*secondNum;
        }
        else if (operrator.equals("/")) {
                if(secondNum==0){
                    System.out.println("wrong operation");
                    isresult = false;
                }
                else {
                    result = firstNum / secondNum;
                }
        }
        else {
            isresult= false;
            System.out.println("operator not exist");
        }

        if(isresult) {
            System.out.println("result: " + result);
        }
    }
}
