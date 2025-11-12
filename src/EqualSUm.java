import java.util.Scanner;

public class EqualSUm {
    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};

        boolean result = equalSum(arr);
        System.out.println(result);
    }

    static boolean equalSum(int[] arr) {
        int totalSum = totalArrSum(arr);
        int prefixSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;
            if(suffixSum == prefixSum) {
                return true;
            }
        }
        return false;
    }

    static int totalArrSum(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        return totalSum;
    }
}
