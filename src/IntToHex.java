public class IntToHex {
    public static void main(String[] args) {
        int num = 45;
        String result = intToHex(num);
        System.out.println(result);
    }

    static String intToHex(int num) {
        return Integer.toHexString(num);
    }
}

