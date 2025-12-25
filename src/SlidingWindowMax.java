import java.util.*;

public class SlidingWindowMax {
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int[] result = maxSlidingWindow(arr, 4);
        System.out.println("Input: "+Arrays.toString(arr));
        System.out.println("Output: "+Arrays.toString(result));
    }

    public static int[] maxSlidingWindow(int[] arr, int k) {
        if(k <= 0 || k > arr.length || arr == null) {
            return new int[0];
        }

        if(k == 1) {
            return arr;
        }

        int[] max = new int[arr.length -k + 1];
        int i =0, j = k - 1;

        while(j < arr.length) {
            int maxi = Integer.MIN_VALUE;
            for(int l=i;l<=j; l++) {
                if(arr[l] > maxi) {
                    maxi = arr[l];
                }
            }
            max[i] = maxi;
            i++;
            j++;
        }
        return max;
    }
}
