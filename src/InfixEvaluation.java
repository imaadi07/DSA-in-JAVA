import java.util.*;

public class InfixEvaluation {
    public static void main(String[] args) {
        String exp = "2147483647";

        Stack<Integer> opnds = new Stack<>();
        Stack<Character> optors = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                optors.push(ch);
            } else if (Character.isDigit(ch)) {
                int num = 0;
                while (i < exp.length() && Character.isDigit(exp.charAt(i))) {
                    num = num * 10 + (exp.charAt(i) - '0');
                    i++;
                }
                i--;
                opnds.push(num);
            } else if (ch == ')') {
                while (optors.peek() != '(') {
                    char optor = optors.pop();
                    int v2 = opnds.pop();
                    int v1 = opnds.pop();

                    int opv = operation(v1, v2, optor);
                    opnds.push(opv);
                }
                optors.pop(); // pop '('
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!optors.isEmpty() && optors.peek() != '(' &&
                        precedence(ch) <= precedence(optors.peek())) {

                    char optor = optors.pop();
                    int v2 = opnds.pop();
                    int v1 = opnds.pop();

                    int opv = operation(v1, v2, optor);
                    opnds.push(opv);
                }
                optors.push(ch);
            }
        }

        while (!optors.isEmpty()) {
            char optor = optors.pop();
            int v2 = opnds.pop();
            int v1 = opnds.pop();

            int opv = operation(v1, v2, optor);
            opnds.push(opv);
        }

        System.out.println(opnds.peek());
    }

    public static int precedence(char optor) {
        if (optor == '+' || optor == '-') return 1;
        else return 2; 
    }

    public static int operation(int v1, int v2, char optor) {
        if (optor == '+') return v1 + v2;
        else if (optor == '-') return v1 - v2;
        else if (optor == '*') return v1 * v2;
        else return v1 / v2;
    }
}
