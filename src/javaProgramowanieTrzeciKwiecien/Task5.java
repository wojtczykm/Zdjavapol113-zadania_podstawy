package javaProgramowanieTrzeciKwiecien;

public class Task5 {
    public static void main(String[] args) {
    String input ="kupa jeza nietoprza";
    char letter = 'a';
    int result = howManyCharisInWord(input,letter);
        System.out.println(result);

    }

private static int howManyCharisInWord(String input, char searchcharacter){
    if (StringHelper.isValid(input) && input.contains(String.valueOf(searchcharacter))){
        int count = 0;
        for(int i = 0; i<input.length(); i++)
        {
            if(input.charAt(i)==searchcharacter)
                count++;
        }
        return count;
        }
    return 0;
}

}
