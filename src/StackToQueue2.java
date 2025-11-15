import java.util.*;

public class StackToQueue2 {
    public static class StackToQueueAdapter {
        Stack<Integer> mainS;
        Stack<Integer> helperS;

        // Constructor to initialize the Queue
        public StackToQueueAdapter() {
            mainS = new Stack<>();
            helperS = new Stack<>();
        }

        // Return the size of the queue
        public int size() {
            return mainS.size();
        }

        // Add new element int the queue
        public void add(int val) {
            mainS.push(val);
        }

        // remove element from the front of the queue
        public int remove() {
            if(mainS.isEmpty()) {
                System.out.println("Queue Underflow");
                return -1;
            } else {
                while(mainS.size() > 1) {
                    helperS.push(mainS.pop());
                }
                int val = mainS.pop();
                while(helperS.size() > 0) {
                    mainS.push(helperS.pop());
                }
                return val;
            }
        }

        // return the element in the front of the queue
        public int top() {
            if(mainS.isEmpty()) {
                System.out.println("Queue Underflow");
                return -1;
            } else {
                while(mainS.size() > 1) {
                    helperS.push(mainS.pop());
                }
                int val = mainS.peek();
                helperS.push(val);
                while(helperS.size() > 0) {
                    mainS.push(helperS.pop());
                }
                return val;
            }
        }
    }
    public static void main(String[] args) {
        StackToQueueAdapter q = new StackToQueueAdapter();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q.remove());             
        System.out.println("Top of the queue: " + q.top()); 
        System.out.println(q.remove());             
        System.out.println(q.remove());             

        // Underflow checks
        System.out.println(q.remove());             
        System.out.println(q.top());   
    }
}
