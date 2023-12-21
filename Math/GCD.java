package Math;

import java.util.Scanner;
// Problem: Find the GCD of two numbers

/* Approach: The Euclidean Algorithm
    - gcd(a, b) = gcd(a % b, b)   where a > b 
    - We reduce our problem until a % b is zero.
    - Then, the last divisor (when a % b became 0) i.e. 'b' will be the GCD.
    T.C. = O(log(min(a, b)))
 */

public class GCD {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Iterative Implementation of Euclidean Algorithm
        int remainder = a % b;
        while (remainder != 0) {
            remainder = a % b;
            a = b;
            b = remainder;
        }
        System.out.println(a + " is our GCD");
        sc.close();
    }
}
