import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = scn.nextInt();
        System.out.println("Enter the power: ");
        int n = scn.nextInt();
        System.out.println("Result: ");
        int power = power(x, n);
        System.out.println(power);
    }

    public static int power(int x, int n) {
        if(n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }
}
