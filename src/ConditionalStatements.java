import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/*
Given an integer,N, perform the following conditional actions:
If N is odd, print Weird
IfN is even and in the inclusive range 2 of to 5, print Not Weird
If N is even and in the inclusive range of 6 to 20, print Weird
If is even and greater than 20, print Not Weird
*/

public class ConditionalStatements {
/* I've made c complex solution on purpose, for better understanding of what is going on in statements
It could be simplified:
if( N%2 == 1 || (N > 5 && N < 21)){
System.out.println("Weird");
}
else{
System.out.println("Not Weird");
}
*/
    void someMethod(int N) {
        if ((N%2 == 1) || (N%2 == 0 && (N > 5 && N<21))) {
            System.out.println("Weird");
        }
        if ((N%2 == 0) && ((N>1 && N<6)||N>20) ) {
            System.out.println("Not Weird");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        ConditionalStatements myObj = new ConditionalStatements();
        myObj.someMethod(N);


    }
}
