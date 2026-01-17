import java.util.*;

public class GenericTree4 {
    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static Node Construct(int[] arr) {
        Node root = null;
        Stack<Node> st = new Stack<>();

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];

                if(st.size() > 0) {
                    st.peek().children.add(t);
                } else {
                    root = t;
                }
                st.push(t);
            }
        }
        return root;
    }

    public static void display(Node node) {
        String str = node.data + " -> ";
        for(Node child:node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str); 

        for(Node child:node.children) {
            display(child);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        
        Node root = Construct(arr);

        predeccessor = null;
        successor = null;
        state = 0;

        System.out.println("The tree is: ");
        display(root);

        int data = 80;
        preAndSucc(root, data);
        System.out.println("Predeccessor: "+predeccessor.data);
        System.out.println("Data: "+data);
        System.out.println("Successor: "+successor.data);
        
        ceil = Integer.MAX_VALUE;
        floor = Integer.MIN_VALUE;

        ceilAndFloor(root, 110);
        System.out.println("Ceil: " + ceil);
        System.out.println("Data: " + 110);
        System.out.println("Floor: "+floor);
    }

    static Node predeccessor;
    static Node successor;
    static int state;

    public static void preAndSucc(Node node, int data) {
        if(state == 0) {
            if(node.data == data) {
                state = 1;
            } else {
                predeccessor = node;
            }
        } else if(state == 1) {
            successor = node;
            state = 2;
        }

        for(Node child:node.children) {
            preAndSucc(child, data);
        }
    }

    static int ceil;
    static int floor;
    public static void ceilAndFloor(Node node, int data) {
        if(node.data > data) {
            if(node.data < ceil) {
                ceil = node.data;
            }
        }

        if(node.data < data) {
            if(node.data > floor) {
                floor = node.data;
            }
        }

        for(Node child:node.children) {
            ceilAndFloor(child, data);
        }
    }

}
