package Math;

import java.util.Scanner;
// Problem: Perform addition of two numbers that have a base `b`.

/*
Approach: 
    Just note that carries will occur when the sum of digits in a 
    column exceeds the base.
 */
public class AnyBaseAddition {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int b = sc.nextInt();

        int carry = 0, result = 0, mul = 1;
        while (n1 > 0 || n2 > 0 || carry > 0) {
            int dig1 = n1 % 10;
            int dig2 = n2 % 10;
            n1 /= 10;
            n2 /= 10;
            int digSum = dig1 + dig2 + carry;
            carry = 0;
            if (digSum >= b) {
                digSum -= b;
                carry = 1;
            }
            result += digSum * mul;
            mul *= 10;
        }
        System.out.println(result);
        sc.close();
    }
}