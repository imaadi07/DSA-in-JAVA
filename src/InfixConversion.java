import java.util.*;

public class InfixConversion {
    public static void main(String[] args) {
        String exp = "a*(b-c)/d+e";

        Stack<String> postfix = new Stack<>();
        Stack<String> prefix = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for (int i=0; i<exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                operator.push(ch); 
            } else if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z')  || (ch >= 'A' && ch <= 'Z')) {
                postfix.push(ch + "");
                prefix.push(ch + "");
            } else if (ch == ')') {
                while(!operator.isEmpty() && operator.peek() != '(') {
                    char op = operator.pop();

                    String postv2 = postfix.pop();
                    String postv1 = postfix.pop(); 
                    String postv = postv1 + postv2 + op;
                    postfix.push(postv);

                    String prev2 = prefix.pop();
                    String prev1 = prefix.pop(); 
                    String prev =  op + prev1 + prev2;
                    prefix.push(prev);
                } 
                operator.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch =='/') {
                while(!operator.isEmpty() && operator.peek() != '(' && precedence(ch) <= precedence(operator.peek())) {
                    char op = operator.pop();

                    String postv2 = postfix.pop();
                    String postv1 = postfix.pop(); 
                    String postv = postv1 + postv2 + op;
                    postfix.push(postv);

                    String prev2 = prefix.pop();
                    String prev1 = prefix.pop(); 
                    String prev = op + prev1 + prev2;
                    prefix.push(prev);
                }
                operator.push(ch);
            } 
        }
        while(!operator.isEmpty() && operator.peek() != '(') {
            char op = operator.pop();

            String postv2 = postfix.pop();
            String postv1 = postfix.pop(); 
            String postv = postv1 + postv2 + op;
            postfix.push(postv);

            String prev2 = prefix.pop();
            String prev1 = prefix.pop(); 
            String prev = op + prev1 + prev2;
            prefix.push(prev);
        }
        System.out.println(postfix.pop());
        System.out.println(prefix.pop());
    }

    public static int precedence(char operator) {
        if(operator == '+' || operator == '-') {
            return 1;
        } else {
            return 2;
        }
    }
}