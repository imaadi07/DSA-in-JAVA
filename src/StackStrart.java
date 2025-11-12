import java.util.Stack;

public class StackStrart {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(30);
        st.push(40);
        System.out.println("Peek: "+st.peek());
        System.out.println(st + " -> " + st.peek() + " " + st.size());
        st.pop();
        System.out.println(st + " -> " + st.peek() + " " + st.size());
    }
}
