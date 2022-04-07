package javaProgramowanieTrzeciKwiecien;

public class Task13 {
    public static void main(String[] args) {
        //dwa sposoby tworzenia tablic
        int[] inputs = {2, 19, 7};
        int[] inputs1 = new int[3];
        inputs1[0] = 5;
        System.out.println(getMinValue(inputs));
        System.out.println(getMaxValue(inputs));
        System.out.println(sum(inputs));

    }

    private static int getMinValue(int[] inputs) {
        int minValue = inputs[0];
       /* for (int i = 0; i < inputs.length; i++) {
            int currenElement = inputs[i];
            if (currenElement < minValue) {
                minValue = currenElement;
            }
        }*/

        for (int element : inputs) {
            if (element < minValue) {
                minValue = element;
            }
        }
        return minValue;
    }

    private static int getMaxValue(int[] inputs) {
        int maxValue = inputs[0];
        for (int element : inputs) {
            if (element >maxValue) {
                maxValue = element;
            }
        }
        return maxValue;
    }

    private static int sum(int[] inputs) {
        int sum = 0;
        for (int i : inputs) {
            sum += i;
        }
        return sum;

    }
}
