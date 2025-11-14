import java.util.ArrayDeque;
import java.util.Queue;

public class QueueToStack {

    public static class QueueToStackAdapter {
        Queue<Integer> mainQ;
        Queue<Integer> helper;

        public QueueToStackAdapter() {
            mainQ = new ArrayDeque<>();
            helper = new ArrayDeque<>();
        }

        // Return the size of the stack
        int size() {
            return mainQ.size();
        }

        // Add new element to the stack (costly push)
        void push(int val) {
            while(mainQ.size() > 0) {
                helper.add(mainQ.remove());
            }

            mainQ.add(val);

            while(helper.size() > 0) {
                mainQ.add(helper.remove());
            }
        }

        // Remove element from the stack
        int pop() {
            if(size() == 0) {
                System.out.println("Stack Underflow");
                return -1;
            } else {
                return mainQ.remove();
            }
        }

        // Return the top element of the stack
        int top() {
            if(size() == 0) {
                System.out.println("Stack Underflow");
                return -1;
            } else {
                return mainQ.peek();
            }
        }
    }

    public static void main(String[] args) {
        QueueToStackAdapter st = new QueueToStackAdapter();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st.top()); // 30
        System.out.println(st.pop()); // 30
        System.out.println(st.top()); // 20
        System.out.println(st.size()); // 2
    }
}
