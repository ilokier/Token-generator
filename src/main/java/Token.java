import java.util.*;

public class Token {
    public static List<Integer> allSigns = new ArrayList();
    static Random random = new Random();
    String tok = "";
    int numberOfSigns = 0;

    public static void fillListWithChars(int start, int end) {
        for (int j = start; j <= end; j++) {
            allSigns.add(j);
        }
    }

    public int pickNumberOfSignsInToken() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of signs in your token. You can choose 5, 10 or 15");
        try {
            int numberOfSigns = scanner.nextInt();
            switch (numberOfSigns) {
                case 5:
                    tokenGenerator(5);
                    break;
                case 10:
                    tokenGenerator(10);
                    break;
                case 15:
                    tokenGenerator(15);
                    break;
                default:
                    System.out.println("Please provide a proper value: 5, 10 or 15. Try again");
                    pickNumberOfSignsInToken();
            }
        } catch (InputMismatchException e) {
            System.out.println("You can use integers only. Try again");
            pickNumberOfSignsInToken();
        }
        return numberOfSigns;
    }

    public void tokenGenerator(int numberOfSigns) {
        for (int i = 0; i < numberOfSigns; i++) {
            int randomInt = allSigns.get(random.nextInt(allSigns.size()));
            char randomChar = (char) randomInt;
            tok = randomChar + tok;
        }
        System.out.println("Your token is " + tok);
    }
}
