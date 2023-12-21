package CharacterPatterns;

import java.util.Scanner;

/*
    n = 7
* * * * * * * 
  *       * 
    *   * 
      * 
    * * * 
  * * * * * 
* * * * * * * 

*/
public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int oSp = 0;
        int st = n;
        for (int row = 0; row < n; row++) {
            for (int i = 0; i < oSp; i++)
                System.out.print("  ");

            for (int i = 0; i < st; i++) {
                // Condition for inner spaces
                if (row > 0 && row < n / 2 && i > 0 && i < st - 1)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();

            if (row < n / 2) {
                st -= 2;
                oSp++;
            }
            else {
                st += 2;
                oSp--;
            }
        }
        sc.close();
    }
}
