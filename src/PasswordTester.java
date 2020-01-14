import java.util.Scanner;

public class PasswordTester{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int userP;
        String userPhrase;
        System.out.println("Guess the Password: ");
        userP = scan.nextInt();
        userPhrase = scan.nextLine();
        Password key = new Password(userP, userPhrase );
        System.out.println(key);
    }
}