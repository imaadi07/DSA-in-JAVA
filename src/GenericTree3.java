import java.util.ArrayList;
import java.util.Stack;

public class GenericTree3 {
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
        System.out.println("Distance between nodes 110 and 120: " + distanceBetweenNodes(root, 110, 120));
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

    public static ArrayList<Integer> nodeToRoot(Node node, int data) {
        if(data == node.data) {
            ArrayList<Integer> res = new ArrayList<>();
            res.add(node.data);
            return res;
        }

        for(Node child:node.children) {
            ArrayList<Integer> ptc = nodeToRoot(child, data);
            if(ptc.size() > 0) {
                ptc.add(node.data);
                return ptc;
            }
        }

        return new ArrayList<>();
    }

    public static int distanceBetweenNodes(Node node, int data1, int data2) {
        ArrayList<Integer> path1 = nodeToRoot(node, data1);
        ArrayList<Integer> path2 = nodeToRoot(node, data2);

        int i = path1.size() - 1;
        int j = path2.size() - 1;

        while( i >= 0 && j >= 0 && path1.get(i) == path2.get(j)) {
            i--;
            j--;
        }

        i++;
        j++;

        return i + j;   
    }

    public static boolean isTreeSimilarShape(Node n1, Node n2) {
        if(n1.children.size() != n2.children.size()) {
            return false;
        }

        while(n1.children.size() > 0) {
            Node c1 = n1.children.remove(0);
            Node c2 = n2.children.remove(0);

            if(!isTreeSimilarShape(c1, c2)) {
                return false;
            }
        }
        return true;
    }
}
