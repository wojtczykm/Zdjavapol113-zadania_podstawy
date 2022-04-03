package javaProgramowanieTrzeciKwiecien;

public class Task5 {
    public static void main(String[] args) {
    String input ="kupa jeza nietoprza";
    int result = howManyCharisInWord(input,'a');
        System.out.println(result);

    }

private static int howManyCharisInWord(String input, char a){
    if (StringHelper.isValid(input)){
        int count = 0;
        for(int i = 0; i<input.length(); i++)
        {
            if(input.charAt(i)=='a')
                count++;
        }
        return count;
        }
    return 0;
}

}
