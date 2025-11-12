import java.util.Arrays;

public class ArrayRref {

    static void changeArray(int [] arr) {
        for( int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    static void printArray(int [] arr) {
        System.out.println(Arrays.toString(arr));
    }

    static void changeVal(int a) {
        a = 23;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3};
        int a = 5;
        changeVal(a);
        System.out.println(a);
        changeArray(arr);
        printArray(arr);
    }
}
