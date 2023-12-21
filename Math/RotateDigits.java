package Math;

import java.util.Scanner;

// Problem: Rotate the digits of N by K. 
//   If K is -ve, left rotate. Otherwise, right rotate.

/* Approach:  Just split the integer into a k-digit part 
   and a (n-k) digit part using Modulo. Then, combine them.
   e.g. 12345, k = 3
    Split into 12 (n-k digits) & 345 (k digits).
    Then, 345*100 + 12 = 34512 is the rotated number.
*/
public class RotateDigits {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        String num = scn.nextLine();
        int k = scn.nextInt();

        int length = num.length();
        k = k % length; // If k > no. of digits
        if (k < 0) // Handling negative rotation
            k = length + k;

        int n = Integer.parseInt(num); // O(n)
        int divisor = (int) (Math.pow(10, k));
        int multiplier = (int) (Math.pow(10, length - k));
        int rotPart = n % divisor;
        n /= divisor;
        int result = rotPart * multiplier + n;

        System.out.println(result);
        scn.close();
    }
}
