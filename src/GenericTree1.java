import java.util.*;

public class GenericTree1 {
    
    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }


    public static void main(String[] args) {
        int[] arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        
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
        display(root);
        int size = size(root);
        System.out.println("Size of the tree is: "+size);
        System.out.println("Max in this tree is: "+maxOfTree(root));
        System.out.println("Height of this generic tree is: "+height(root));
        Traversal(root);
    }

    // d(10) -> 10 will print itself and it's family.
    // d(20), d(30), d(40) -> will print themselves and their family.
    // d(10) = s(10) + d(20) + d(30) + d(40)
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

    public static int size(Node node) {
        int s = 0;

        for (Node child:node.children) {
            int cs = size(child);
            s = s + cs;
        }
        s = s + 1;
        return s;
    }

    public static int maxOfTree(Node node) {
        int max = Integer.MIN_VALUE;
        for(Node child : node.children) {
            int cm = maxOfTree(child);
            max = Math.max(cm, max);
        }
        max = Math.max(node.data, max);

        return max;
    }

    public static int height(Node node) {
        int ht = -1;
        for(Node child:node.children) {
            int ch = height(child);
            ht = Math.max(ch, ht);
        }
        ht +=1;

        return ht;
    }

    public static void Traversal(Node node) {
        System.out.println("Node Pre-Order: "+node.data);
        for(Node child:node.children) {
            System.out.println("Edge Pre-Order: "+node.data+" -- "+child.data);
            Traversal(child);
            System.out.println("Edge Post-Order: "+node.data+" -- "+child.data);
        }
        System.out.println("Node Post-Order: "+node.data);
    }
}
