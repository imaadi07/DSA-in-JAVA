public class SecondMax {
    public static void main(String[] args) {
        int [] arr = {1,8,6,3,9};
        int result = secondMax(arr);
        System.out.println(result);
    }

    static int findMax(int [] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int secondMax(int [] arr) {
        int max = findMax(arr);
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        return findMax(arr);
    }
}
