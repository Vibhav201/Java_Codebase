package CharacterPatterns;

import java.util.Scanner;

/*  n = 7
      * 
    *   * 
  *       * 
*           * 
  *       * 
    *   * 
      * 
 */

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int oSp = n / 2; // Outer Spaces
        int iSp = -1; // Inner Space
        for (int row = 0; row < n; row++) {
            for (int i = 0; i < oSp; i++)
                System.out.print("  ");

            System.out.print("* ");

            for (int i = 0; i < iSp; i++)
                System.out.print("  ");

            if (row > 0 && row < n - 1)
                System.out.print("* ");
            System.out.println();

            if (row < n / 2) {
                oSp--;
                iSp += 2;
            }
            else {
                oSp++;
                iSp -= 2;
            }
        }
        sc.close();
    }
}
