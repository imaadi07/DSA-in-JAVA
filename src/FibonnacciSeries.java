import java.util.Scanner;

public class FibonnacciSeries   {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range of fibonacci series: ");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;
        int next = 0;

        System.out.println(first);
        System.out.println(second);

        for (int i = 2; i < n; i++) {
            next = first + second;
            System.out.println(next);
            first = second;
            second = next;
            next = 0;
        }
    }
}
