public class AddTwoList {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        public int size() {
            return size;
        }

         public void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data);
                if (temp.next != null) System.out.print(" -> ");
                temp = temp.next;
            }
            System.out.println();
        }

        public void removeFirst() {
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }
        }

        public void removeLast() {
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                Node temp = head;
                for (int i = 0; i < size - 2; i++) {
                    temp = temp.next;
                }
                tail = temp;
                tail.next = null;
                size--;
            }
        }

        public int getFirst() {
            if (size == 0) {
                System.out.println("List Empty");
                return -1;
            }
            return head.data;
        }

        public int getLast() {
            if (size == 0) {
                System.out.println("List Empty");
                return -1;
            }
            return tail.data;
        }

         public void addFirst(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;

            if (size == 0) {
                tail = head;
            }
            size++;
        }

        public int addListHelper(Node one, int pv1, Node two, int pv2, LinkedList res) {
            if(one == null && two == null) {
                return 0; 
            }
            
            if(pv1 > pv2) {
                return addListHelper(one.next, pv1 - 1, two, pv2, res);
            } else if(pv1 < pv2) {
                return addListHelper(one, pv1, two.next, pv2 - 1, res);
            } else {
                int oc = addListHelper(one.next, pv1 - 1, two.next, pv2 - 1, res);
                int data = oc + one.data + two.data;
                int nd = data % 10;
                int nc = data/10;
                res.addFirst(nd); 
                return nc;
            }
        }
        
        public LinkedList addTwoList(LinkedList one, LinkedList two) {
            LinkedList res = new LinkedList();

            int oc = addListHelper(one.head, one.size, two.head, two.size, res);

            return res;
        }
    }
    public static void main(String[] args) {
        
    }
}
