package runningTime_PrimeNumbers;
import java.util.Scanner;

/*
A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself.
Given a number,n , determine and print whether it's  Prime or Not prime.
 */
public class PrimeNumbers {
    public static void main(String[] args) {
        // Enter your code here. Read input from STDIN. Print output to STDOUT.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //number of test cases
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();// numbers we test
            if (a==1){
                System.out.println("Not prime");
                continue;
            }
            boolean hasDivisors = false;
            for (int j = 2; j * j <= a; j++) {
                if (a%j== 0) {
                    System.out.println("Not prime");
                    hasDivisors = true;
                    break;
                }
            }

            if (!hasDivisors) {
                System.out.println("Prime");
            }
        }
        sc.close();
    }
}

