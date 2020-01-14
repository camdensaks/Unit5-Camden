public class CoinTester{
    public static void main(String []args){
        final int goal = 3;
        int count1 = 0;
        int count2 = 0;

        Coin coin1 = new Coin(123);
        Coin coin2 = new Coin(131);

        coin1.unlock(123);
        coin2.unlock(131);

            coin1.Flip();
            coin2.Flip();
            System.out.println("Coin 1 = " + coin1);
            System.out.println("Coin 2 = " + coin2);

        if(count1 == goal){
            System.out.println("Coin 1 Wins!");
        }

        if(count2 == goal){
            System.out.println("Coin 2 Wins!");
        }
    }


}