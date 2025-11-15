import java.util.ArrayDeque;
import java.util.Queue;

public class QueueToStack2 {

    public static class QueueToStackAdapter {
        Queue<Integer> mainQ;
        Queue<Integer> helperQ;

        public QueueToStackAdapter() {
            mainQ = new ArrayDeque<>();
            helperQ = new ArrayDeque<>();
        }

        // Return the size of the stack
        public int size() {
            return mainQ.size();
        }

        // Add new element in the stack
        public void push(int val) {
            mainQ.add(val);
        }

        // Remove first element from the stack
        public int pop() {
            if(size() == 0) {
                System.out.println("Stack Underflow");
                return -1;
            } else {
                while(mainQ.size() > 1) {
                    helperQ.add(mainQ.remove());
                }
                int val = mainQ.remove();
                while(helperQ.size() > 0) {
                    mainQ.add(helperQ.remove());
                }
                return val;
            }
        }

        // Return top of the stack 
        public int top() {
            if(size() == 0) {
                System.out.println("Stack Underflow");
                return -1;
            } else {
                while(mainQ.size() > 1) {
                    helperQ.add(mainQ.remove());
                }
                int val = mainQ.remove();
                helperQ.add(val);
                while(helperQ.size() > 0) {
                    mainQ.add(helperQ.remove());
                } 
                return val;
            }
        }
    }
    public static void main(String[] args) {
        QueueToStackAdapter q = new QueueToStackAdapter();

        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);

        System.out.println(q.top());
        System.out.println(q.pop());
        System.out.println(q.top());
        System.out.println(q.size());
    }
}
