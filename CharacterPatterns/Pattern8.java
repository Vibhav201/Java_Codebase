package CharacterPatterns;

import java.util.Scanner;

/*  n = 4
4 4 4 4 4 4 4 
4 3 3 3 3 3 4 
4 3 2 2 2 3 4 
4 3 2 1 2 3 4 
4 3 2 2 2 3 4 
4 3 3 3 3 3 4 
4 4 4 4 4 4 4 
 */
public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int size = 2 * n - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int value = Math.min(Math.min(i, j), Math.min((size - 1 - i), (size - 1 - j)));
                System.out.print((n - value) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
