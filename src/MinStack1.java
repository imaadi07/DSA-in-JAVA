import java.util.*;

public class MinStack1 {

    public static class MinStack {
        Stack<Integer> alldata;
        Stack<Integer> mindata;

        public MinStack() {
            alldata = new Stack<>();
            mindata = new Stack<>();
        }

        int size() {
            return alldata.size();
        }

        void push(int val) {
            alldata.push(val);

            if(mindata.isEmpty() || val <= mindata.peek()) {
                mindata.push(val);
            }
        }

        int pop() {
             if(size() == 0) {
                System.out.println("Stack Underflow");
                return -1;
            } else {
                int val = alldata.pop();

                if(val == mindata.peek()) {
                    mindata.pop();
                }
                return val;
            }
        }

        int top() {
             if(size() == 0) {
                System.out.println("Stack Underflow");
                return -1;
            } else {
                return alldata.peek();
            }
        }

        int min() {
            if(size() == 0) {
                System.out.println("Stack Underflow");
                return -1;
            } else {
                return mindata.peek();
            }
        }

        void display() {
            System.out.println(alldata);
        }

        void minDis() {
            System.out.println(mindata);
        }
    }
    public static void main(String[] args) {
        MinStack st = new MinStack();
        st.push(10);
        st.push(20);
        st.push(5);
        st.push(60);
        st.push(40);
        st.push(90);
        st.push(1);
        st.display();
        st.minDis();
    }
}
