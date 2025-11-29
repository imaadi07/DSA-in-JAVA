import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class GenericTree2 {
    
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
        System.out.println("The Generic Tree is: ");
        display(root);
        System.out.println("Mirror of the Generic tree: ");
        Mirror(root);
        System.out.println("Removing leaves from the tree: ");
        removeLeaves(root);
        display(root);
        System.out.println("Linearize a generic tree: ");
        linearize(root);
        display(root);
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

    public static void Mirror(Node node) {
        for(Node child:node.children) {
            Mirror(child);
        }
        Collections.reverse(node.children);
    }

    public static void removeLeaves(Node node) {
        for(int i=node.children.size() - 1; i>=0; i--) {
            Node child = node.children.get(i);
            if(child.children.size() == 0) {
                node.children.remove(child);
            }
        }

        for(Node child:node.children) {
            removeLeaves(child);
        }
    }

    public static void linearize(Node node) {
        for(Node child:node.children) {
            linearize(child);
        }

        while(node.children.size() > 1) {
            Node lc = node.children.remove(node.children.size() - 1);
            Node sl = node.children.get(node.children.size() - 1);
            Node slt = getTail(sl);
            slt.children.add(lc);
        }
    }

    public static Node getTail(Node node) {
        if(node.children.size() == 0) {
            return node;
        }

        Node lastChild = node.children.get(node.children.size() - 1);
        return getTail(lastChild);
    }
}
