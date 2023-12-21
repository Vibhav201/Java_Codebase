package CharacterPatterns;

import java.util.Scanner;
/*
    n = 4
1           1 
1 2       2 1 
1 2 3   3 2 1 
1 2 3 4 3 2 1 

*/

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sp = 2 * n - 3;
        for (int row = 0; row < n; row++) {
            for (int i = 0; i <= row; i++)
                System.out.print((i + 1) + " ");
            for (int i = 0; i < sp; i++)
                System.out.print("  ");

            int start = row + 1;
            if (row == n - 1)
                start = row; // Change 'start' for last row

            for (int i = start; i > 0; i--)
                System.out.print(i + " ");

            System.out.println();
            sp -= 2;
        }
        sc.close();
    }
}
