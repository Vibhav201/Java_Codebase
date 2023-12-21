package Math;

import java.util.Scanner;
// Problem: Find the total sum of divisors for all 'i' from 1 to n.
// e.g. n = 4, result = 4+2+1 + 3+1 + 2+1 + 1 = 15

/* Approach: Each number `x` from 1 to n comes a total of (n/x) times
   in the factors list.
   For n=6, result = 33
    6 -> 1 2 3 6    
    5 -> 1 5
    4 -> 1 2 4
    3 -> 1 3
    2 -> 1 2
    1 -> 1 
 */
public class SumOfDivisors {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for (int x = 1; x <= n; x++) {
            // Every integer x is added n/x times to the final answer
            result += x * (n / x);
            // Equivalent unoptimised alternative to this statement
            // for(int f=x; f <= n; f+=x)
            //     result += x;
        }
        System.out.println(result);
        sc.close();
    }
}