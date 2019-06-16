import java.io.IOException;
import java.util.Scanner;
//This is an algorithmic concept that involves splitting a problem into two parts:
//        a base case and a recursive case. The problem is divided into smaller subproblems
//        which are then solved recursively until such time as they are small enough and meet
//        some base case; once the base case is met, the solutions for each subproblem are
//        combined and their result is the answer to the entire problem.
//
//        If the base case is not met, the function's recursive case calls the function
//        again with modified values. The code must be structured in such a way that the
//        base case is reachable after some number of iterations, meaning that each subsequent
//        modified value should bring you closer and closer to the base case; otherwise, you'll
//        be stuck in the dreaded infinite loop!
public class Recursion {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the factorial function below.
    public static int factorial(int n) {
        //base case
        if (n <= 1) {
            return 1;
        }
        //Recursive case
        else {
            //Factorial(4)=4*Factorial(3)
            //4*3*Factorial(2)
            //4*3*2*Factorial(1)
            //4*3*2*1
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int result = factorial(n);
        System.out.println(result);
        scanner.close();
    }
}
