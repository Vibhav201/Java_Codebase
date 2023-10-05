import java.util.Scanner;

class Tester {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());

        while (t != 0) {
            System.out.println("Hello");
            t--;
        }

        scn.close();
    }
}