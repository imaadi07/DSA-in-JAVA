import java.util.*;

public class BalancedBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the bracket sequence: ");
        String s = sc.next();
        System.out.println("Is Balanced: " + balanceBracket(s));
    }

    static boolean balanceBracket(String s) {
        Stack<Character> st = new Stack<>(); // ✅ Corrected here

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            // Closing brackets
            else if (ch == ')') {
                if (!handleClosing(st, '(')) return false;
            }
            else if (ch == '}') {
                if (!handleClosing(st, '{')) return false;
            }
            else if (ch == ']') {
                if (!handleClosing(st, '[')) return false;
            }
        }
        return st.isEmpty();
    }

    static boolean handleClosing(Stack<Character> st, char correspondingOpen) {
        if (st.isEmpty()) return false;
        if (st.peek() != correspondingOpen) return false;
        st.pop();
        return true;
    }
}
