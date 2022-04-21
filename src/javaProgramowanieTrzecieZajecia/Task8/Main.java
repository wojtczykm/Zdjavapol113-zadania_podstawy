package javaProgramowanieTrzecieZajecia.Task8;

public class Main {
    public static void main(String[] args) {
        Author autor = new Author("kowalski","polskie");
        Author autor1 = new Author("sienkiewicz","hiszpanskie");
        Author autor2 = new Author("iksinski","włoskie");


        Poem [] poems = new Poem[3];
        poems[0] = new Poem(autor,125);
        poems[1] = new Poem(autor1, 250);
        poems[2] = new Poem(autor2, 300);
    }


    private static String getSurname(Poem[] poems){
        int max=0;
        String author = null;
        for(Poem poem:poems){
            int currentStrophNum = poem.getStropheNumbers();
            if(max < currentStrophNum){
                max = currentStrophNum;
                author = poem.getCreator().getSurname();
            }
        }
        return author;
    }




}




