package Character_Patterns;

import java.util.Scanner;

/*    n = 7
* * * *   * * * * 
* * *       * * * 
* *           * * 
*               * 
* *           * * 
* * *       * * * 
* * * *   * * * * 
*/

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int st = n / 2 + 1;
        int sp = 1;
        for (int row = 0; row < n; row++) {

            // Solution 1
            // No relation b/w the no. of '*' and current row number
            for (int i = 0; i < st; i++)
                System.out.print("* ");
            for (int i = 0; i < sp; i++)
                System.out.print("  ");
            for (int i = 0; i < st; i++)
                System.out.print("* ");
            System.out.println();

            if (row < n / 2) {
                st--;
                sp += 2;
            }
            else {
                st++;
                sp -= 2;
            }

            /* Solution 2
            // Creating relation between row no. and no. of '*'
            if (row <= n / 2) {
                int currStars = 2 * row + 1; // Relation formula   
                for (int i = 0; i < (n - currStars) / 2 + 1; i++)
                    System.out.print("* ");
                for (int j = 0; j < currStars; j++)
                    System.out.print(" ");
                for (int i = 0; i < (n - currStars) / 2 + 1; i++)
                    System.out.print("* ");
            }
            else {
                int currStars = 2 * (n - row) - 1;
                for (int i = 0; i < (n - currStars) / 2 + 1; i++)
                    System.out.print("* ");
                for (int j = 0; j < currStars; j++)
                    System.out.print(" ");
                for (int i = 0; i < (n - currStars) / 2 + 1; i++)
                    System.out.print("* ");
            }
            System.out.println("");
            */
        }
        sc.close();
    }
}
