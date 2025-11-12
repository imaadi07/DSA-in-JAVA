import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scn.nextInt();
        System.out.println("Factorials is: ");
        int result = factorials(n);
        System.out.println(result);
    }

    public static int factorials(int n) {
        if(n == 1) {
            return 1;
        }
        return n * factorials(n - 1);
    }
}
