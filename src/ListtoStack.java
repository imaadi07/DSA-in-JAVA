public class ListtoStack {

    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        int size;

        int size() {
            return size;
        }

        public void addtoHead(int val) {
            Node temp = new Node();
            temp.data = val;
    
            if(size == 0) {
                head = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        public int removeFirst() {
            if(size == 0) {
                System.out.println("Stack Underflow");
                return -1;
            } else if(size == 1) {
                int val = head.data;
                head = null;
                size = 0;
                return val;
            } else {
                int val = head.data;
                head = head.next;
                size--;
                return val;
            }
        }

        public int getFirst() {
            if(size == 0) {
                System.out.println("Stack Underflow");
                return -1;
            } else {
                return head.data;
            }
        }
    }

    public static class StackAdapter {
        LinkedList list;

        public StackAdapter() {
            list = new LinkedList();
        }

        int size() {
            return list.size();
        }

        int pop() {
            return list.removeFirst();
        }

        void push(int val) {
            list.addtoHead(val);
        }

        int top() {
            return list.getFirst();
        }
    }
    public static void main(String[] args) {
         StackAdapter stack = new StackAdapter();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Top Element: " + stack.top());   
        System.out.println("Stack Size: " + stack.size());   
        System.out.println("Popped: " + stack.pop());        
        System.out.println("Top Now: " + stack.top());       
        System.out.println("Size Now: " + stack.size()); 
    }
}
