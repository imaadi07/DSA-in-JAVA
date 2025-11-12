public class LinkedList1 {

    // Node class: represents one element in the list
    public static class Node {
        int data;
        Node next;
    }

    // LinkedList class 
    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        // Return current size of the list
        int size() {
            return size;
        }

        // Add a node at the end
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

        // Display all elements
        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data);
                if (temp.next != null) System.out.print(" -> ");
                temp = temp.next;
            }
            System.out.println();
        }

        // Remove first node
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

        // Remove last node
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

        // Remove node at a specific index
        public void removeAtIndex(int idx) {
            if (idx < 0 || idx >= size) {
                System.out.println("Invalid Argument");
            } else if (idx == 0) {
                removeFirst();
            } else if (idx == size - 1) {
                removeLast();
            } else {
                Node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                size--;
            }
        }

        // Get first element
        public int getFirst() {
            if (size == 0) {
                System.out.println("List Empty");
                return -1;
            }
            return head.data;
        }

        // Get last element
        public int getLast() {
            if (size == 0) {
                System.out.println("List Empty");
                return -1;
            }
            return tail.data;
        }

        // Get element at specific index
        public int getAtIndex(int idx) {
            if (size == 0) {
                System.out.println("List Empty");
                return -1;
            } else if (idx < 0 || idx >= size) {
                System.out.println("Invalid Argument");
                return -1;
            } else {
                Node temp = head;
                for (int i = 0; i < idx; i++) {
                    temp = temp.next;
                }
                return temp.data;
            }
        }

        // Add at first
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

        // Add at specific index
        public void addAtIndex(int idx, int val) {
            if (idx < 0 || idx > size) {
                System.out.println("Invalid Argument");
            } else if (idx == 0) {
                addFirst(val);
            } else if (idx == size) {
                addLast(val);
            } else {
                Node node = new Node();
                node.data = val;

                Node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }

                node.next = temp.next;
                temp.next = node;
                size++;
            }
        }

        // Helper function to get node at index
        private Node getNodeAt(int idx) {
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp;
        }

        // Reverse data iteratively
        public void reverseID() {
            int li = 0;
            int ri = size - 1;

            while (li < ri) {
                Node left = getNodeAt(li);
                Node right = getNodeAt(ri);

                int temp = left.data;
                left.data = right.data;
                right.data = temp;

                li++;
                ri--;
            }
        }

        // Corrected helper to get node
        private Node getNode(int idx) {
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp;
        }

        // Reverse data iteratively (duplicate, but valid)
        public void reverseDI() {
            int li = 0;
            int ri = size - 1;
            while (li < ri) {
                Node right = getNode(ri);
                Node left = getNode(li);

                int temp = left.data;
                left.data = right.data;
                right.data = temp;

                li++;
                ri--;
            }
        }

        // Kth element from the end
        public int kthFromLast(int k) {
            Node slow = head;
            Node fast = head;

            for (int i = 0; i < k; i++) {
                fast = fast.next;
            }

            while (fast != tail) {
                fast = fast.next;
                slow = slow.next;
            }
            return slow.data;
        }

        // Find middle element
        public int midOfList() {
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow.data;
        }

        // Merge two sorted lists (made static for convenience)
        public static LinkedList mergeTwoSortedList(LinkedList l1, LinkedList l2) {
            Node one = l1.head;
            Node two = l2.head;

            LinkedList merged = new LinkedList();

            while (one != null && two != null) {
                if (one.data < two.data) {
                    merged.addLast(one.data);
                    one = one.next;
                } else {
                    merged.addLast(two.data);
                    two = two.next;
                }
            }

            while (one != null) {
                merged.addLast(one.data);
                one = one.next;
            }

            while (two != null) {
                merged.addLast(two.data);
                two = two.next;
            }

            return merged;
        }

        // Mid node for merge sort
        public Node midNode(Node head, Node tail) {
            Node f = head;
            Node s = head;

            while (f != tail && f.next != tail) {
                f = f.next.next;
                s = s.next;
            }
            return s;
        }

        // Merge sort on linked list
        public LinkedList mergeSort(Node head, Node tail) {
            if (head == tail) {
                LinkedList br = new LinkedList();
                br.addLast(head.data);
                return br;
            }

            Node mid = midNode(head, tail);
            LinkedList fsh = mergeSort(head, mid);
            LinkedList ssh = mergeSort(mid.next, tail);
            LinkedList cl = mergeTwoSortedList(fsh, ssh);
            return cl;
        }

        // remove duplicates from the linkedlist
        public void removeDuplicates() {
            LinkedList res = new LinkedList();

            while(this.size() > 0) {
                int val = this.getFirst();
                this.removeFirst();

                if(res.size == 0 || res.tail.data != val) {
                    res.addLast(val);
                }
            }
            this.head = res.head;
            this.tail = res.tail;
            this.size = res.size;
        }

        public void oddEven() {
            LinkedList odd = new LinkedList();
            LinkedList even = new LinkedList();


            while(this.size > 0) {
                int val = this.getFirst();
                this.removeFirst();

                if(val % 2 == 0) {
                    even.addLast(val);
                } else {
                    odd.addLast(val); 
                }
            }

            if(odd.size > 0 && even.size > 0) {
                odd.tail.next = even.head;
                this.head = odd.head;
                this.tail = even.tail;
                this.size = odd.size + even.size;
            } else if (odd.size > 0) {
                this.head = odd.head;
                this.tail = odd.tail;
                this.size = odd.size;
            } else {
                this.head = even.head;
                this.tail = even.tail;
                this.size = even.size;
            }
        } 

        // Perform K reverse in a linkedlist
        public void kReverse(int k) {
            LinkedList prev = null;
            while(this.size > 0) {
                LinkedList current = new LinkedList();
                
                if(this.size >= k) {
                    for(int i=0; i<k; i++) {
                        int val = this.getFirst();
                        this.removeFirst();
                        current.addFirst(val);
                    }
                } else {
                    int s = this.size();
                    for(int i=0; i<s; i++) {
                        int val = this.getFirst();
                        this.removeFirst();
                        current.addFirst(val);
                    }
                }
                if(prev == null) {
                    prev = current;
                } else {
                    prev.tail.next = current.head;
                    prev.tail = current.tail;
                    prev.size += current.size;
                }
            }
            this.head = prev.head;
            this.tail = prev.tail;
            this.size = prev.size;
        }

    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();

        l1.addFirst(10);
        l1.addLast(10);
        l1.addLast(20);
        l1.addLast(20);
        l1.addLast(30);
        l1.addLast(30);
        l1.addLast(40);
        l1.addLast(40);
        l1.addFirst(21);
        // l1.addAtIndex(2, 25);

        System.out.println("Original:");
        l1.display();

        l1.reverseID();
        System.out.println("Reversed:");
        l1.display();

        System.out.println("Duplicate removed: ");
        l1.removeDuplicates();
        l1.display();

        System.out.println("Odd Even list: ");
        l1.oddEven();
        l1.display();

        System.out.println("Kth element from the last (k=3): " + l1.kthFromLast(3));
        System.out.println("Mid of the List: " + l1.midOfList());
    }
}
