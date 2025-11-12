import java.util.*;

public class LargestAreaHistogram {
    public static void main(String[] args) {
        int[] arr = {1, 1};
        System.out.println("Input: "+Arrays.toString(arr));
        int result = area(arr);
        System.out.println("Output: "+result);
    }

    public static int area(int[] arr) {
        int[] rb = new int[arr.length]; // nse index on the right
        Stack<Integer> st = new Stack<>();

        st.push(arr.length - 1);
        rb[arr.length - 1] = arr.length;

        for (int i = arr.length - 2; i >= 0 ; i--) {
            while(!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }

            if(st.isEmpty()) {
                rb[i] = arr.length;
            } else {
                rb[i] = st.peek();
            }
            st.push(i);
        }

        int[] lb = new int[arr.length]; // nse on the left
        st = new Stack<>();
        st.push(0);
        lb[0] = -1;

        for (int i = 1; i < arr.length; i++) {
            while(!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }

            if(st.isEmpty()) {
                lb[i] = -1;
            } else {
                lb[i] = st.peek();
            }
            st.push(i);
        }
        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            int width = rb[i] - lb[i] - 1;
            int area = width * arr[i];
            if(area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }
}
