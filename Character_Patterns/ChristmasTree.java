package Character_Patterns;

import java.util.Scanner;

/* 
 0123456789012345678
0         *
1        ***
2       *****
3      *******
4     *********
5    ***********
6   *************
7  ***************
8 *****************
9*******************
10       ***
11       ***
*/
public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int row = 0; row < n; row++) {
            // Print Spaces
            for (int i = 0; i < (n - 1 - row); i++) {
                System.out.print(" ");
            }
            // Print Stars
            for (int i = 0; i < 2 * row + 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        printStump(n);

        scn.close();
    }

    public static void printStump(int n) {
        for (int i = 0; i < n - 2; i++) {
            System.out.print(" ");
        }
        System.out.print("***\n");
        for (int i = 0; i < n - 2; i++) {
            System.out.print(" ");
        }
        System.out.print("***");
    }

}
