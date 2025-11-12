public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
        int result = lengthOfLastWord(s);
        System.out.println(result);
    }

    public static int lengthOfLastWord(String s) {
        String[] parts = s.split(" ");
        return parts[parts.length -1].length();
    }
}
