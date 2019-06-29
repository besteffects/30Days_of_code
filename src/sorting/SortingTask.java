package sorting;

import java.util.Scanner;

/*
Given an array,a , of size n distinct elements, sort the array in ascending
order using the Bubble Sort algorithm above. Once sorted, print the following 3 lines:
1. Array is sorted in numSwaps swaps. where numSwaps is the number of swaps that
took place.
2. First Element: firstElement
where firstElement is the first element in the sorted array.
Last Element: lastElement where lastElement is the last element in the sorted array.
Hint: To complete this challenge, you will need to add a variable that keeps a running tally of all swaps that occur during execution.
 */
public class SortingTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        // Write Your Code Herel
        int totalSwaps = 0;
        for (int i = n - 1; i > 0; i--) {
            int numberOfSwaps = 0;
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    numberOfSwaps++;
                    totalSwaps++;
                }
            }
            if (numberOfSwaps == 0) {
                break;
            }
        }
        System.out.println("Array is sorted in " + totalSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n - 1]);
    }
}
