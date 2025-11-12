import java.util.*;

public class MinStack2 {

    public static class MyStack {
        Stack<Integer> data;
        int min;

        public MyStack() {
            data = new Stack<>();
        }

        int size() {
            return data.size();
        }

        void push(int val) {
            if (data.isEmpty()) {
                data.push(val);
                min = val;
            } else if (val >= min) {
                data.push(val);
            } else {
                // encode using previous min
                data.push(2 * val - min);
                min = val; // update min
            }
        }

        int pop() {
            if (size() == 0) {
                System.out.println("Stack Underflow");
                return -1;
            } else {
                int top = data.pop();
                if (top >= min) {
                    return top;
                } else {
                    // top was encoded, decode old min
                    int originalMin = min;
                    min = 2 * min - top;
                    return originalMin;
                }
            }
        }

        int top() {
            if (data.isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            } else if (data.peek() >= min) {
                return data.peek();
            } else {
                return min;
            }
        }

        int min() {
            if (size() == 0) {
                System.out.println("Stack Underflow");
                return -1;
            } else {
                return min;
            }
        }
    }

    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(50);
        st.push(40);
        st.push(60);
        st.push(10);

        System.out.println("Min: " + st.min());  // should print 10
        System.out.println("Top: " + st.top());  // should print 10

        System.out.println("Pop: " + st.pop());  // remove 10
        System.out.println("Min: " + st.min());  // should restore 40
    }
}
