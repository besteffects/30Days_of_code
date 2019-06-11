import java.io.*;
import java.util.*;

public class LetsReview {

    private static void printString(String myString) {
        char[] myCharArray = myString.toCharArray();
        String s1 = "";
        String s2 = "";
        for (int i = 0; i < myString.length(); i++) {
            // Print each sequential character on the same line
            // Print a newline
            if (i % 2 == 0) {
                s1=s1+myCharArray[i];
            }
            if (i % 2 == 1) {
                s2+=myCharArray[i];
            }
        }
        System.out.println(s1+" "+s2);
        }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfTestCases = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
      //  System.out.println(numberOfTestCases);
        for (int i = 0; i < numberOfTestCases; i++) {
            String myString = scanner.nextLine();
            printString(myString);
        }
        scanner.close();
    }
}

/*import java.io.*;
        import java.util.*;

public class LetsReview {

    private static void printString(String myString) {
        char[] myCharArray = myString.toCharArray();
        for (int i = 0; i < myString.length(); i++) {
            // Print each sequential character on the same line
            // Print a newline
            if (i % 2 == 0) {
                System.out.print(myCharArray[i]);
            }
        }
        System.out.print(" ");
        for (int i = 0; i < myString.length(); i++) {
            // Print each sequential character on the same line
            // Print a newline
            if (i % 2 == 1) {
                System.out.print(myCharArray[i]);
            }
        }
        System.out.println();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfTestCases = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        //  System.out.println(numberOfTestCases);
        for (int i = 0; i < numberOfTestCases; i++) {
            String myString = scanner.nextLine();
            printString(myString);
        }
        scanner.close();
    }
}*/
