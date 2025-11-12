public class DisArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int n = arr.length - 1;
        System.out.println("Dispaly Array My Way: ");
        displayArray(arr, n);
        System.out.println("Display Array New Way: ");
        printArray(arr, 0);
        System.out.println("Reverse Array: ");
        reverseArray(arr, 0);
    }

    public static void displayArray(int[] arr, int n) {
        if(n==0) {
            System.out.println(arr[n]);
            return;
        }
        displayArray(arr, n-1);
        System.out.println(arr[n]);
    }

    public static void printArray(int[] arr, int idx) {
        if(idx == arr.length) {
            return;
        }
        System.out.println(arr[idx]);
        printArray(arr, idx+1);
    }

    public static void reverseArray(int[] arr, int idx) {
        if(idx == arr.length) {
            return;
        }
        reverseArray(arr, idx + 1);
        System.out.println(arr[idx]);
    }
}
