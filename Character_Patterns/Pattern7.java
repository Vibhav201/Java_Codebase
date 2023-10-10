package Character_Patterns;

import java.util.Scanner;

/*  
    n = 7
* * * *     * 
      *     * 
      *     * 
* * * * * * * 
*     *       
*     *       
*     * * * * 

*/
public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    if (j <= n / 2 || j == n - 1)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                else if (i < n / 2) {
                    if (j == n / 2 || j == n - 1)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                else if (i == n / 2) {
                    System.out.print("* ");
                }
                else if (i < n - 1) {
                    if (j == 0 || j == n / 2)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                else {
                    if (j == 0 || j >= n / 2)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
