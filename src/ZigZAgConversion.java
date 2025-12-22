public class ZigZAgConversion {
    public static void main(String[] args) {
        String s = "AB";

        System.out.println(convert(s, 1));
    }

    public static String convert(String s, int numRow) {
        if(numRow == 1 || s.length() <= numRow) {
            return s;
        }

        StringBuilder[] row = new StringBuilder[numRow];
        for (int i = 0; i < numRow; i++) {
            row[i] = new StringBuilder();
        }
        
        int currRow = 0;
        boolean goingDown = false;

        for(char c:s.toCharArray()) {
            row[currRow].append(c);

            if(currRow == 0 || currRow == numRow - 1) {
                goingDown = !goingDown;
            }

            currRow += goingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for(StringBuilder r:row) {
            result.append(r);
        }

        return result.toString();
    }
}
