import java.util.Scanner;

public class Zad2 {
    private static final float PI = 3.14F;//tworzenie stałych
    //wtedy gdy jakiegos parametru uzywamy czesto

    public static void main(String[] args) {
        float radius = getDiameterFromUser() / 2;
        float areaofACircle = calculateAreaofACircle(radius);
        float circumferenceofACircle = calculateCircumferenceofACircle(radius);
        System.out.println("circumference "+circumferenceofACircle);
        System.out.println("area "+areaofACircle);
    }

    private static float getDiameterFromUser(){
        Scanner scanner = new Scanner(System .in);
        System.out.print("Please insert diameter:");
        //float diameterFromUser = scanner.nextFloat();
        //return diameterFromUser;
    return scanner.nextFloat();
    }

    private static float calculateCircumferenceofACircle(float radius){
        return 2 * (float)Math.PI * radius;
        //return 2 * PI * radius;
    }

    private static float calculateAreaofACircle(float radius){
        return (float)(Math.PI * Math.pow(radius, 2));//musi być rzutowanie bo Pi jest double
        //return PI * radius * radius;
    }



}
