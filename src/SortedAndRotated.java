import java.util.Arrays;

public class SortedAndRotated {
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 5, 1, 2};
        System.out.println(isSorted(arr1));

        int[] arr2 = {2, 1, 3, 4, 5};
        System.out.println(isSorted(arr2));
    }

    static boolean isSorted(int[] arr) {
        int n = arr.length;
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        // Try rotating the array at every position
        for (int i = 0; i < n; i++) {
            int[] rotated = arr.clone();
            rotateInline(rotated, i);

            if (Arrays.equals(rotated, sorted)) {
                return true;
            }
        }
        return false;
    }

    static void rotateInline(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
