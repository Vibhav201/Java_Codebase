package Math;

import java.util.Scanner;

/*  Problem: There are n bulbs (numbered 1 to n) that are initially off. 
    The bulbs are toggled in the following manner -
     - Toggle all bulbs, then toggle every 2nd bulb, then toggle every
       3rd bulb. Similarly, toggle every 'i'th bulb for all 'i' till 'n'
    Find the bulbs that are on after all 'n' rounds.
*/
public class BulbSwitcher {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /* Approach 1: 
            - Each bulb 'x' will be toggled as many times as the no. of
              factors it has. 
            - So, count the no. of factors for each 'x' from 1 to n
            - At the end, if 'x' has "odd no. of factors", it will be ON. 
              Otherwise, it will be OFF.
            T.C. = O(n.sqrt(n))
        */
        // Function that implements Approach 1 - 
        // bulbSwitch(n);
        /* ✅ Approach 2:
            - Only perfect squares have odd no. of factors. So, only 
              only bulbs like 1, 4, 9, 16, etc. will be ON.
            - Just print all 'x' that are perfect squares until n.
            - If only count of bulbs is needed, so no. of squares less
              than n is (int)(Math.sqrt(n)).
         */
        for (int x = 1; x * x <= n; x++) {
            System.out.print(x * x + " ");
        }
        System.out.println("\nNo. of ON bulbs = " + (int) Math.sqrt(n));
        sc.close();
    }
    /* 
    public static void bulbSwitch(int n)
    {
        int result = 0;
        for (int x = 1; x <= n; x++) {
            int count = countFactors(x);
            if (count % 2 != 0) {
                result++;
                System.out.print(x + " ");
            }
        }
        System.out.println("\n" + result);
    }
    
    public static int countFactors(int n)
    {
        int count = 0, j;
        for (j = 1; j * j < n; j++) {
            if (n % j == 0)
                count += 2;
        }
        if (j * j == n)
            count++;
        return count;
    }
    */
}
