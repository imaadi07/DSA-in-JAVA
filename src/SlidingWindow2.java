import java.util.Arrays;
import java.util.Stack;

public class SlidingWindow2 {
    public static void main(String[] args) {
        int[] arr = {4,   5,   2,   10,   8, 22, 56, 8, 96, 4, 1, 23};
        System.out.println(Arrays.toString(arr));
        slidingWindow(arr, 4);
    }

    public static void slidingWindow(int[] arr, int k) {
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[arr.length];

        st.push(arr.length - 1);
        nge[arr.length - 1] = arr.length;

        for (int i = arr.length - 2; i >= 0 ; i--) {
            while(!st.isEmpty() && arr[i] > arr[st.peek()]) {
                st.pop();
            }
            if(st.isEmpty()) {
                nge[i] = arr.length;
            } else {
                nge[i] = st.peek();
            }
            st.push(i);
        }

        int j = 0;
        for (int i = 0; i <= arr.length - k; i++) {
            if (j < i) j = i;

            while (nge[j] < i + k) {
                j = nge[j];
                if (j >= arr.length) break;
            }
            System.out.print(arr[j]+", ");
        }
    }

}
