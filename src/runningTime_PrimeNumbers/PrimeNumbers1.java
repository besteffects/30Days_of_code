package runningTime_PrimeNumbers;

import java.util.Scanner;

public class PrimeNumbers1 {
    public static void main(String[] args) {
        // Enter your code here. Read input from STDIN. Print output to STDOUT.

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //number of test cases
        for (int i = 0; i < a; i++) {
            int flag = 0;
            long n = sc.nextLong();// numbers we test
            if (n == 0 || n == 1) {
                System.out.println("Not prime");
            } else {
                for (int j = 2; j*j <= n; j++) {
                    if (n % j == 0) {
                        System.out.println("Not prime");
                        flag = 1;
                        break;
                    }

                }

                if (flag == 0) {
                    System.out.println("Prime");
                }
            }
        }
        sc.close();
    }
}