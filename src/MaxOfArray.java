public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr = {22,2,33,7,19};
        int max = maxOfArr(arr, 0);
        System.out.println("Max Of Array is: "+max);
    }

    public static int maxOfArr(int[] arr, int idx) {
        if(idx == arr.length - 1) {
            return arr[idx];
        }
        int misa = maxOfArr(arr, idx + 1);
        if (misa > arr[idx]) {
            return misa;
        } else {
            return arr[idx];
        }
    }
}
