import java.util.Scanner;
/*
Your local library needs your help! Given the expected and actual return dates for a library book, create a program that
calculates the fine (if any). The fee structure is as follows:
1. If the book is returned on or before the expected return date, no fine will be charged (i.e.: fine=0).
2. If the book is returned after the expected return day but still within the same calendar month and year
 as the expected return date, fine=15 Hackosx(number of days late).
3. If the book is returned after the expected return month but still within the same calendar year as the
 expected return date, the fine=500Hackosx(the number of months late).
4. If the book is returned after the calendar year in which it was expected, there is a fixed fine of
10000Hackos.
Input format:
The first line contains 3 space-separated integers denoting the respective day, month,
and year on which the book was actually returned.
The second line contains 3 space-separated integers denoting the respective day, month, and year on which the book was expected to be returned (due date).
 */

public class NestedLogic {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int dayReturned = scanner.nextInt();
        int monthReturned = scanner.nextInt();
        int yearReturned = scanner.nextInt();
        int dayExpected = scanner.nextInt();
        int monthExpected = scanner.nextInt();
        int yearExpected = scanner.nextInt();
        int fine=0;

        int yearsLate = yearReturned - yearExpected;
        int monthsLate = monthReturned - monthExpected;
        int daysLate = dayReturned - dayExpected;
                if (yearsLate < 0) {
                    System.out.println(fine);
                } else {
                    if (yearsLate > 0) {
                        fine = 10000;
                    } else if (monthsLate > 0) {
                        fine = 500 * monthsLate;
                    } else if (daysLate > 0 && monthsLate == 0) {
                        fine = 15 * daysLate;
                    }
                    System.out.println(fine);
                }
            }
        }
/*
 Possible solution
        if (yearsLate < 0&&monthsLate<0 &&daysLate<0) {
            System.out.println(fine);
        } else if (yearsLate > 0) {
                fine = 10000;
            System.out.println(fine);
            }
        else if (monthsLate > 0 && yearsLate == 0) {
                fine = 500 * monthsLate;
            System.out.println(fine);
            }
        else if (daysLate > 0 && monthsLate == 0 && yearsLate == 0) {
                fine = 15 * daysLate;
            System.out.println(fine);
            }

        }
    }
*/
