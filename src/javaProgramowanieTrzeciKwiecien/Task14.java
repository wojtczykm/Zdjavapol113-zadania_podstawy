package javaProgramowanieTrzeciKwiecien;

public class Task14 {
    public static void main(String[] args) {
        int[] inputs = {12, -7, 19, -5};
int lenghtOfNewArray=isMinus(inputs);
if(lenghtOfNewArray>0){


}


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

    private static int[] createNewArrayOfMinus(int[] inputs, int lenghtOfNewArray){
        int[] result = new int[lenghtOfNewArray];
        for(int i=0; i< inputs.length; ){
        }

        return null;


    }



}
