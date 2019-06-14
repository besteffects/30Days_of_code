import java.util.*;


public class Arrays {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        // System.out.println(n);
        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = n-1; i >=0; i--) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;

            System.out.print(arrItem+" ");
        }
        scanner.close();
    }
}