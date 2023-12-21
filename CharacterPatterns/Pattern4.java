package CharacterPatterns;

import java.util.Scanner;

/*  n = 7
      1 
    2 3 2 
  3 4 5 4 3 
4 5 6 7 6 5 4 
  3 4 5 4 3 
    2 3 2 
      1 
 */

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sp = n / 2;
        int num = 1;
        for (int row = 0; row < n; row++) {
            for (int i = 0; i < sp; i++)
                System.out.print("  ");

            int start = Math.min(row, (n - row - 1));

            for (int i = start; i < num; i++)
                System.out.print((i + 1) + " ");
            for (int i = num - 1; i > start; i--)
                System.out.print(i + " ");

            System.out.println();
            if (row < n / 2) {
                sp--;
                num += 2;
            }
            else {
                sp++;
                num -= 2;
            }
        }
        sc.close();
    }
}
