import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Token {
    static String allSigns = "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz".toUpperCase() + "0123456789" + "!@#$%^&*()";
    static Random random = new Random();
    static int SIZE = allSigns.length();
    static String TOKEN = "";

    public static void main(String[] args) {
        System.out.println("Enter number of signs in your token");
        System.out.println("You can enter only 5, 10 or 15");
        tokenGenerator();
    }

    public static String tokenGenerator() {
        Scanner scanner = new Scanner(System.in);
        try {
            int numberOfSigns = scanner.nextInt();
            if (numberOfSigns == 5 || numberOfSigns == 10 || numberOfSigns == 15) {
                for (int i = 0; i < numberOfSigns; ++i) {
                    char sign = allSigns.charAt(random.nextInt(SIZE));
                    TOKEN = TOKEN += sign;
                }
                System.out.println("Your token is: " + TOKEN);
                return TOKEN;
            } else {
                System.out.println("Enter a proper value: 5, 10 or 15");
                System.out.println("Please try again");
            }
            return tokenGenerator();
        } catch (InputMismatchException e) {
            System.out.println("You can use integers only, please try again");
            tokenGenerator();
        }
        return TOKEN;
    }
}
