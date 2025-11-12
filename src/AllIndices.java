import java.util.Arrays;
import java.util.Scanner;

public class AllIndices {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Length of array: ");
        int n = scn.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter "+n+ " Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.print("Enter the number for search: ");
        int x = scn.nextInt();

        int[] ans = allIndices(arr, x ,0, 0);
        System.out.println("Answer: "+ Arrays.toString(ans));
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        if(idx == arr.length) {
            return new int[fsf];
        }

        if (arr[idx] == x) {
            int[] iarr = allIndices(arr, x, idx + 1, fsf + 1);
            iarr[fsf] = idx;
            return iarr;
        } else {
            int[] iarr = allIndices(arr,x, idx+1, fsf);
            return iarr;
        }
    }
}
