import java.util.ArrayList;

public class ReverseAString {
    public static void main(String[] args) {
        String s = "My name is Aditya";
        System.out.println("Orignal String: " + s);
        System.out.print("After reverse: ");
        reverseString(s);
    }

    public static void reverseString(String s) {
        ArrayList<String> arr = new ArrayList<>();

        String s1 = "";
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch != ' ') {
                s1 += ch;
            }

            if(ch == ' ' || i == s.length() - 1) {
                if(!s1.isEmpty()) {
                    arr.add(s1);
                    s1 = "";
                }
            }
        }
        String result = "";
        for(int i=arr.size() - 1; i>=0; i--) {
            result += arr.get(i) + " ";
        }
        System.out.println(result);
    }
}
