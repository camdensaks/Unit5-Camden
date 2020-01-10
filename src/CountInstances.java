public class CountInstances {
    public static void main(String[] args) {
        Slogan obj;
        obj = new Slogan("Clap on, clap off");
        System.out.println(obj);
        System.out.println("Slogans created: " + Slogan.getCount());
    }
}