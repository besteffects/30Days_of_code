import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Loops {
    static void loops(int n) {
        int endOfI = 10;
        for(int i = 1; i <=endOfI; i++){
            if (n>1&&n<21) {
                System.out.println(n + " x " + i + " = "+ ( i * n ));
            }

        }

    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        loops(n);
        scanner.close();
    }
}
