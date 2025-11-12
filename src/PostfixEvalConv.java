import java.util.*;

public class PostfixEvalConv {
    public static void main(String[] args) {
        String s = "-+2/*6483";

        Stack<String> infix = new Stack<>();
        Stack<String> postfix = new Stack<>();
        Stack<Integer> val = new Stack<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                int v1 = val.pop();
                int v2 = val.pop();
                int value = operation(v1, v2, ch);
                val.push(value);

                String p1 = postfix.pop();
                String p2 = postfix.pop();
                String post = p1 + p2 + ch;
                postfix.push(post);

                String i1 = infix.pop();
                String i2 = infix.pop();
                String in = "( " + i1 + " " + ch + " " + i2 + " )";
                infix.push(in);
            } else {
                val.push(ch - '0');
                infix.push(ch + "");
                postfix.push(ch +"");
            }
        }
        System.out.println("Value: "+val.pop());
        System.out.println("Infix: " + infix.peek());
        System.out.println("Postfix: " + postfix.peek());

    }

    public static int operation(int v1, int v2, char oprator) {
        if(oprator == '+') {
            return v1 + v2;
        } else if (oprator == '-') {
            return v1 - v2;
        } else if (oprator == '*') {
            return v1 * v2;
        } else {
            return v1 / v2;
        }
    }
}