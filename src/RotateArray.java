import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
//        int[] result = rotate(arr, 3);
//        System.out.println(Arrays.toString(result));
        rotateInline(arr, 1);
        System.out.println(Arrays.toString(arr));
    }

    static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int [] ans = new int[n];
        int j = 0;
        for(int i=n-k; i<n; i++) {
            ans[j++] = arr[i];
        }
        for(int i=0; i<n-k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    static void rotateInline(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr,0 ,n-1);
    }

    static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
