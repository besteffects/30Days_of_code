import java.util.Scanner;

import static java.lang.Math.round;
public class Operators {

    // Complete the solve function below.

    private static double solve(double meal_cost, int tip_percent, int tax_percent) {
        return (meal_cost + (meal_cost * tip_percent / 100) + (meal_cost * tax_percent / 100));
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        double totalCost=solve(meal_cost, tip_percent, tax_percent);

        System.out.println(round(totalCost));
        scanner.close();
    }
}

