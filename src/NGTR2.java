import java.util.Arrays;
import java.util.Stack;

public class NGTR2 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 6, 9, 7, 8};
        int[] result = solve(arr);
        System.out.println("Input:  " + Arrays.toString(arr));
        System.out.println("Output: " + Arrays.toString(result));
    }

    public static int[] solve(int[] a) {
        int[] nge = new int[a.length]; // array to store next greater element
        Stack<Integer> st = new Stack<>(); // stack will hold indices

        // Push the first index
        st.push(0);

        // Traverse remaining elements
        for (int i = 1; i < a.length; i++) {
            // While stack not empty and current element is greater
            // than the element at index stored on top of stack
            while (!st.isEmpty() && a[i] > a[st.peek()]) {
                int pos = st.pop();      // index of smaller element
                nge[pos] = a[i];         // assign next greater element
            }
            st.push(i); // push current index
        }

        // For remaining elements (no next greater found)
        while (!st.isEmpty()) {
            int pos = st.pop();
            nge[pos] = -1;
        }

        return nge;
    }
}
