package Math;

import java.util.Scanner;
// Problem: Print the digits of a number

/* Approach: Just divide the number by 10^(x-1), where x is the 
   number of digits, to get the first digit. Repeat this to get 
   the rest of the digits.
*/
public class DigitsOfANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if (n == 0)
            System.out.println(0);

        // Count Digits
        int count = 0, temp = n;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        int divisor = (int) (Math.pow(10, count - 1)); // 10^(count-1)
        while (divisor != 0) {
            int dig = n / divisor;
            System.out.print(dig + " ");
            // Reducing the no. to access the next digit
            n = n % divisor;
            divisor /= 10;
        }
        scn.close();
    }
}
