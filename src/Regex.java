import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/*
Task:
Consider a database table, Emails, which has the attributes First Name and Email ID. Given N rows
of data simulating the Emails table, print an alphabetically-ordered list of people whose email
 address ends in @gmail.com.

Input Format
The first line contains an integer, N, total number of rows in the table.
Each of the subsequent lines contains space-separated strings denoting a
person's first name and email ID, respectively.

Output format:
Print an alphabetically-ordered list of first names for every user with a gmail account. Each name must be printed on a new line.

Sample Input:
6
riya riya@gmail.com
julia julia@julia.me
julia sjulia@gmail.com
julia julia@gmail.com
samantha samantha@gmail.com
tanya tanya@gmail.com

Sample Output:
julia
julia
riya
samantha
tanya

 */
public class Regex {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];
        }

        scanner.close();
    }
}
