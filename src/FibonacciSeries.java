import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scn.nextInt();
        System.out.println("Fibonacci Series: ");
        int result = Fibonacci(n);
        System.out.println(result);
    }

    static  int Fibonacci(int n) {
        // base case
        if( n == 0 || n == 1) {
            return n;
        }

        // sub-problem
        int prev = Fibonacci(n - 1);
        int prevprev = Fibonacci(n - 2);

        return prev + prevprev;
    }
}
