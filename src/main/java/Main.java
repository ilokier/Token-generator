public class Main {


    public static void main(String[] args) {
        Token token = new Token();
        token.fillListWithChars(33, 41);
        token.fillListWithChars(64, 90);
        token.fillListWithChars(97, 122);
        int numberOfSigns = token.pickNumberOfSignsInToken();
        token.tokenGenerator(numberOfSigns);
    }
}
