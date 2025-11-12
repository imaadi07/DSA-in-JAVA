import java.util.*;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr = {2,5,9,3,1,12,6,8,7};
        int[] result = span(arr);
        System.out.println("Input: "+Arrays.toString(arr));
        System.out.println("Output: "+Arrays.toString(result));
    }

    public static int[] span(int[] arr) {
        int[] span = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        st.push(0);
        span[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                st.pop();
            }

            if (st.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - st.peek();
            }

            st.push(i);
        }
        return span;
    }

}
