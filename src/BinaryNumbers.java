import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BinaryNumbers {
    private static final Scanner scanner = new Scanner(System.in);


    private static int findMaxConsBinNumber(int n) {
        List<Integer> myList = new ArrayList<>();
        int remainder = 0;
        while (n > 0) {
            remainder = n % 2;
            n = n / 2;
            //Insert remainder to front of a list or push onto a stack
            myList.add(remainder);
        }
        Collections.reverse(myList);
        System.out.println(myList);
        int sum = 0;
        int onesCountInRow =0;
        for (int i = 0; i < myList.size(); i++) {
            // If 1 is found, increment count
            // and update sum if count becomes
            // more
            if (myList.get(i)==1) {
                onesCountInRow ++;
                if (sum<onesCountInRow){
                    sum = onesCountInRow;
                }
            } else {
                // Reset count when 0 is found
                onesCountInRow=0;
            }
        }
        System.out.println("sum of 1= "+sum);
        return sum;
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        // Print list or stack
        findMaxConsBinNumber(n);
        scanner.close();
    }

}
