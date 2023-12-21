package Math;

import java.util.Scanner;
// Problem: Convert the given decimal number to the its corresponding value in 
//          in given base b
/* Approach: 
    We just simulate the algorithm where we divide the decimal number
    with the base b (target base) and form the number using the remainders.
*/

public class Decimal_to_AnyBase {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int base = sc.nextInt();

        int result = 0, placeValue = 1, n = num;
        while (n != 0) {
            int rem = n % base;
            n /= base;
            result = result + rem * placeValue;
            placeValue *= 10;
        }
        System.out.println(num + " in base " + base + " is " + result);
        sc.close();
    }
}
