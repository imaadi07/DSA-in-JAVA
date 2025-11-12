import java.util.Scanner;

public class PrintIncDec {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n  = scn.nextInt();

        System.out.println("Result: ");
        printDecreasinginc(n);
    }

    static void printDecreasinginc(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        printDecreasinginc(n - 1);
        System.out.println(n);
    }
}
