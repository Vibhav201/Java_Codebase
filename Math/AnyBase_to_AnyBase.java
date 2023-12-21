package Math;

import java.util.Scanner;
// Problem: Convert a number in base b1 to its equivalent in base b2.

/* Approach: We know how to convert any base to decimal and 
    also to convert decimal to any other base. So, just convert the number
    to decimal and then this intermediate decimal value to base b2.
*/

public class AnyBase_to_AnyBase {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();

        int dec = toDecimal(num, b1);
        int result = decimalToAnyBase(dec, b2);

        System.out.println(result);
        sc.close();
    }

    public static int toDecimal(int n, int b)
    {
        int result = 0, placeValue = 1;
        while (n != 0) {
            int dig = n % 10;
            n /= 10;
            result = result + dig * placeValue;
            placeValue *= b;
        }
        return result;
    }

    public static int decimalToAnyBase(int n, int b)
    {
        int result = 0, placeValue = 1;
        while (n != 0) {
            int dig = n % b;
            n /= b;
            result = result + dig * placeValue;
            placeValue *= 10;
        }
        return result;
    }
}
