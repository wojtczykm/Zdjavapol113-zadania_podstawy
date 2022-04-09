package javaProgramowanieTrzeciKwiecien;

import java.util.Arrays;

public class Task16 {
    public static void main(String[] args) {
        int[] firstArray = {12,7,19};
        int[] secondArray = { 12,7,19,33,5};

        System.out.println(Arrays.toString(firstArray));
        int [] array2 = change(firstArray);
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(secondArray));
        int [] array3 = changeAll(secondArray);
        System.out.println(Arrays.toString(array3));

    }

private static int[] change(int[]array){

            int temp =0;
            temp= array[0];
            array[0]=array[array.length-1];
            array[array.length-1] =temp;

        return array;
}

    private static int[] changeAll(int[]array){

        int temp =0;

        for (int i=0;i<array.length/2;i++){
            temp= array[i];
        array[i]=array[array.length-1-i];
        array[array.length-1-i] =temp;
        }

        return array;
    }

}
