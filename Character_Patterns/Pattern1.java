package Character_Patterns;

import java.util.Scanner;
/*  n = 7 (odd inputs only)
      * 
    * * * 
  * * * * * 
* * * * * * * 
  * * * * * 
    * * * 
      * 
 */

public class Pattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // int sp = n / 2;
        for (int row = 0; row < n; row++) {
            if (row <= n / 2) {
                int currStars = 2 * row + 1;
                for (int i = 0; i < (n - currStars) / 2; i++)
                    System.out.print("  ");
                for (int j = 0; j < currStars; j++) {
                    System.out.print("* ");
                }
            } else {
                int currStars = 2 * (n - row) - 1; // Deducing this value is important
                for (int i = 0; i < (n - currStars) / 2; i++)
                    System.out.print("  ");
                for (int j = 0; j < currStars; j++)
                    System.out.print("* ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
