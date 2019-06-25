import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        parseInput(input);
        in.close();
    }

    public static void parseInput(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            System.out.println(s);
        } catch (NumberFormatException ex1) {
            System.out.println("Bad String");
        }
    }
}
