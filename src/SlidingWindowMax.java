import java.util.*;

public class SlidingWindowMax {
    public static void main(String[] args) {
        int[] arr = {2,9,3,8,1,7,12,6,14,4,32,0,7,19,8,12,6};
        int[] result = maxSlidingWindow(arr, 4);
        System.out.println("Input: "+Arrays.toString(arr));
        System.out.println("Output: "+Arrays.toString(result));
    }

    public static int[] maxSlidingWindow(int[] arr, int k) {
        int[] max = new int[arr.length -k + 1];
        int i =0, j = k;


        while(j < arr.length && i < arr.length - k) {
            int maxi = Integer.MIN_VALUE;
            for (int l = i; l < j; l++) {
                if(arr[l] > maxi) {
                    maxi = arr[l];
                }
                max[i] = maxi;
            }
            i++;
            j++;
        }
        return max;
    }
}
