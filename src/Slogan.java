public class Slogan{
    private int count = 0;
    private String phrase;

    public Slogan(String phrase){
        count++;
        this.phrase = phrase;
    }

    public String toString(){
        return phrase;
    }
    public static int getCount(){
        return count;
    }
}