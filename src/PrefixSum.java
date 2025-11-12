import java.util.Arrays;
import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of array: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n+1];
//        System.out.println("Enter " + n + " elements: ");
//        for (int i = 1; i <= n; i++) {
//            arr[i] = sc.nextInt();
//        }
        int[] arr = {1,2,3,4,5};
//        int[] arr1 = {1,2,3,4,5};
        int[] prefix = prefixSum(arr);
//        int[] suffix = suffixSum(arr1);
        System.out.println(Arrays.toString(prefix));
//        System.out.println(Arrays.toString(suffix));

//        System.out.println("Enter number of queries: ");
//        int q = sc.nextInt();
//        while(q-- > 0) {
//            System.out.println("Enter range");
//            int l = sc.nextInt();
//            int r = sc.nextInt();
//            int ans = prefix[r] - prefix[l-1];
//            System.out.println("Sum: "+ans);
//        }
    }

    static int[] prefixSum(int [] arr) {
        for(int i = 1; i < arr.length; i++) {
            arr[i] += arr[i-1];
        }
        return arr;
    }

//    static int[] suffixSum(int[] arr) {
//        for(int i = arr.length-2; i >= 0; i--) {
//            arr[i] += arr[i+1];
//        }
//        return arr;
//    }
}
