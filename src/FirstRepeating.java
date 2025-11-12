public class FirstRepeating {
    public static void main(String[] args) {
        int [] arr = {1,5,4,6,3,4};
        int result = firstRepeating(arr);
        System.out.println(result);
    }

    static int firstRepeating(int [] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
