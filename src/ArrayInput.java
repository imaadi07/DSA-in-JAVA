import java.util.Scanner;
import java.util.Arrays;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array length: ");
        int n = sc.nextInt();
        int [] nums = new int[n];
        System.out.print("Enter the Array elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Your Array is: ");
        System.out.println(Arrays.toString(nums));
    }
}
