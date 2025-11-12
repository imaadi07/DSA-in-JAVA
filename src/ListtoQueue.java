public class ListtoQueue {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        // return queue size
        public int sizes() {
            return size;
        }

        // add elements to the tail or back of queue
        public void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if(size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        // remove elements from the front or front of the queue
        public int removeFirst() {
            if(size == 0) {
                System.out.println("Queue Underflow");
                return -1;
            } else if (size == 1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            } else {
                int val = head.data;
                head = head.next;
                size--;
                if(size == 0) {
                    tail = null;
                }
                return val;
            }
        }

        // return the front of the queue or head of the linkedlist
        public int frontData() {
            if(size == 0) {
                System.out.println("Queue Underflow");
                return -1;
            } else {
                return head.data;
            }
        }
    }
    
    public static class Queue {
        LinkedList list;

        public Queue() {
            list = new LinkedList();
        }

        public void enqueue(int val) {
            list.addLast(val);
        }

        public int dequeue() {
            return list.removeFirst();
        }

        public int size() {
            return list.sizes();
        }

        public int front() {
            return list.frontData();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.front()); // prints 10
        System.out.println(q.dequeue()); // removes 10
        System.out.println(q.front()); // prints 20
        System.out.println(q.size()); // prints 2
    }
}
