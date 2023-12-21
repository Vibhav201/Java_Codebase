package Math;

import java.util.Scanner;

// Problem: Perform subtraction of two numbers that have base b (n1 > n2).

/*
Approach: 
    The oncept of `borrow` is crucial here. If we are subtracting a larger 
    digit from a smaller digit in the current column, borrow value '1' from 
    the next column. This `1` borrowed from the next column becomes equal
    to the base value and gets added to our digit.
    
    Ex. 234 - 177 = 35 (in base 8)
        2 3 4        2 2 12        1 10 12
      - 1 7 7  --> - 1 7  7  --> - 1  7  7
                          5        0  3  5
 */
public class AnyBaseSubtraction {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int b = sc.nextInt();

        int borrow = 0, result = 0, mul = 1;

        while (n1 != 0) {
            int dig1 = n1 % 10;
            int dig2 = n2 % 10;
            n1 /= 10;
            n2 /= 10;

            if (borrow == 1) {
                dig1--;
                borrow = 0;
            }
            if (dig1 < dig2) {
                dig1 += b;
                borrow = 1;
            }

            int diff = dig1 - dig2;
            result += diff * mul;
            mul *= 10;
        }
        System.out.println(result);
        sc.close();
    }
}
