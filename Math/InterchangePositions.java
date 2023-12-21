package Math;

import java.util.Scanner;

/* Problem: Interchange position and values of the digits of a number, 
   where the number consists of unique digits from 1 to the length of
   the number, like 123456. Invalid input example, 54322.
     For ex, n = 21453    // For digit 3, position is 1
     positions = 54321

        result = 23154    // For position 3, digit is 1 
     positions = 54321
*/
public class InterchangePositions {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if (n == 0)
            System.out.println(0);

        int value = 1;
        int result = 0;
        while (n != 0) {
            int pos = n % 10;
            int multiplier = (int) Math.pow(10, pos - 1);
            result = result + value * multiplier;
            value++;
            n /= 10;
        }
        System.out.println(result);
        scn.close();
    }
}
