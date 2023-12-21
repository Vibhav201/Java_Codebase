package Math;

import java.util.Arrays;
import java.util.Scanner;

// Problem: Count no. of prime numbers from 1 to n

/* ✅ Approach 1: Sieve of Eratosthenes 
   // T.C. - O(n.log(log n)), S.C. - O(n)
    - Create a boolean array of size n+1, each index represents a number
      from 0 to n. Initially, all values are true.
    - Start from 2 (sieveArr[2] == true) and mark all indices that are 
      multiples of 2 as composite (false).
    - Continue doing this for all 'i' for which sieveArr[i] == true,
      until n. 
    - Increase the count of primes each time you encounter an i with 
      sieveArr[i].
*/

public class CountPrimes {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        // Sieve of Eratosthenes
        boolean[] sieve = new boolean[n + 1];
        Arrays.fill(sieve, true);

        for (int i = 2; i < n; i++) {
            if (sieve[i] == true) {
                System.out.print(i + " ");
                count++;
                for (int j = i + i; j < n; j += i)
                    sieve[j] = false;
            }
        }
        /* Approach 2: Check from 2 to n for primes
            // T.C. = O(n.sqrt(n)), S.C. = O(1)
        for (int i = 2; i < n; i++) {
            if (isPrime(i))
                count++;
        }
        */
        System.out.print("\nTotal no. of primes: " + count);
        sc.close();
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n)
    {
        // Checking if any number from 2 to sqrt(n) divides n
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
