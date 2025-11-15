import java.util.*;

public class StackToQueue1 {

    public static class StackToQueueAdapter {
        Stack<Integer> mainS;
        Stack<Integer> helperS;

        public StackToQueueAdapter() {
            mainS = new Stack<>();
            helperS = new Stack<>();
        }

        // Return the size of the queue
        public int size() {
            return mainS.size();
        }

        // Add a new element at the last of queue
        public void add(int val) {
            if(mainS.isEmpty()) {
                mainS.push(val);
            } else {
                while(mainS.size() > 0) {
                    helperS.push(mainS.pop());
                }
                mainS.push(val);
                while(helperS.size() > 0) {
                    mainS.push(helperS.pop());
                }
            }
        }

        // Remove first element from the queue
        public int remove() {
            if(mainS.isEmpty()) {
                System.out.println("Queue Underflow");
                return -1;
            } else {
                return mainS.pop();
            }
        }

        // Return the front element of the queue
        public int peek() {
            if(mainS.isEmpty()) {
                System.out.println("Queue Underflow");
                return -1;
            } else {
                return mainS.peek();
            }
        }
    }
    public static void main(String[] args) {
        StackToQueueAdapter q = new StackToQueueAdapter();
        
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q.remove()); 
        System.out.println("Top of the stack: "+q.peek());   
        System.out.println(q.remove()); 
        System.out.println(q.remove());
    }
}
