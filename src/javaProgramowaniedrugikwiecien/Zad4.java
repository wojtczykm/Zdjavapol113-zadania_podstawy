package javaProgramowaniedrugikwiecien;

import java.util.Scanner;

public class Zad4 {
    private static final Scanner scanner = new Scanner(System .in);
    private static final double BMI_MINRANGE = 18.5;//TE STAŁE PISZEMY
    private static final double BMI_MAXRANGE = 24.9;
    // WIELKIMI LITERAMI I ODDZIELAMY JE PODŁOGAMI
    //trzeba zmienic public na private

    public static void main(String[] args) {
        float weightFomUser = getWeightFomUser();
        int heighttFomUser = getHeighttFomUser();
        float bmi = calcluateBMI(weightFomUser, heighttFomUser);
        displayBMIResult(bmi);
    }

    private static float getWeightFomUser() {
        System.out.println("podaj wagę w kg: ");
        return scanner.nextFloat();//może taki zapis być bo nic z tą zmienna tutaj nie robimy
    }

    private static int getHeighttFomUser() {
        System.out.println("podaj wzrost w cm: ");
        return scanner.nextInt();
    }

    private static float calcluateBMI(float weightFomUser, int heighttFomUser ){
        //weight/height[m]^2
        float heightInMeter = heighttFomUser/100F;
        //float heightInMeter = (float)heighttFomUser/100;
        return weightFomUser / (float)Math.pow(heightInMeter, 2);
    }

    private static void displayBMIResult(float BMI){
        if(BMI< BMI_MINRANGE || BMI> BMI_MAXRANGE) {//po najechaniu i zaznaczeniu liczby
            // ctrl+alt+C nadaje nazwe
            //zmiennej i tworzy zmienna stałą na górze
            //shift+F6 zmienia nazwe jesli utworzylismy bledna
            //zmiana jest brana wszedzie pod uwage

            System.out.println("BMI incorrect "+BMI);
        }
        else {
            System.out.println("BMI correct "+BMI);
        }

    }



}
