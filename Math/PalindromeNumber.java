package Math;

import java.util.Scanner;
// Problem: Check whether a given integer is a palindrome or not.

/* Approach: Reverse second half of the number and then compare 
it to the first half.
    - For even no. of digits (1221), compare the two halfs.
    - For odd no. of digits (12321), the reversed half will have
      1 more digit than the first half, i.e. the middle digit, so 
      remove it and then compare.
  Example: 1221, 12 == 12 -> Palindrome
           12321, 12 == 123/10 -> Palindrome      
 */

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x < 0 || x != 0 && x % 10 == 0)
            System.out.println("Not a Palindrome");
        else {
            int num = x;
            int reversed = 0;
            while (num > reversed) {
                // Reversing the second half
                reversed = reversed * 10 + num % 10;
                num /= 10;
            }
            if (num == reversed || num == (reversed / 10))
                System.out.println("Its a Palindrome");
            else
                System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}
