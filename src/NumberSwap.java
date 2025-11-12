import java.util.Arrays;

public class NumberSwap {

    static void Swap(int a, int b) {
        System.out.println("Orignal values before swap");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Values after swap");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }

    static void Sum_Difference(int a, int b) {
        System.out.println("Value Before swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        a = a+b;
        b = a- b;
        a = a-b;
        System.out.println("Value after swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int j=0;

        for(int i = n-1; i>=0; i--) {
            ans[j++] = arr[i];
        }

        return ans;
    }

    static int[] reverseArrayInplace(int [] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end) {
            swapInArray(arr, start, end);
            start++;
            end--;
        }
        return arr;
    }

    static void swapInArray(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        int a = 9;
        int b = 5;
        int[] arr = {1,2,3,4,5};

//        Swap(a, b);
//        Sum_Difference(a,b);
        int[] result = reverseArrayInplace(arr);
        System.out.println(Arrays.toString(result));
    }
}
