package javaProgramowanieTrzeciKwiecien;

import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {

        int[] inputs = {12, -7, 19, -5};
        int lenghtOfNewArray = isMinus(inputs);
        int [] array = createNewArrayOfMinus(inputs,lenghtOfNewArray);
        System.out.println(Arrays.toString(array));
    }

    private static int isMinus(int[] inputs) {
        int counter = 0;
        for (int element : inputs) {
            if (element < 0) {
                counter++;
            }
        }
        return counter;
    }

    private static int[] createNewArrayOfMinus(int[] inputs, int lenghtOfNewArray) {
        int[] result = new int[lenghtOfNewArray];
        int j=0;
        for (int i = 0; i < inputs.length; i++) {
            if(inputs[i]<0){
                result[j]=inputs[i];
                j++;
            }
        }
        return result;
    }
}
