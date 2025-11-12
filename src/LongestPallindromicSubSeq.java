import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LongestPallindromicSubSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        String result = isPallindromicSubSeq(str);
        System.out.println("The Answer is: "+result);
    }

    public static String isPallindromicSubSeq(String s) {
        ArrayList<String> str = getSS(s);
        String longest = "";

        for (String sub : str) {
            String rev = new StringBuilder(sub).reverse().toString();
            if (sub.equals(rev) && sub.length() > longest.length()) {
                longest = sub;
            }
        }

        return longest;
    }

    public static ArrayList<String> getSS(String s) {
        if(s.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = s.charAt(0);
        String ros = s.substring(1);

        ArrayList<String> rres = getSS(ros);

        ArrayList<String> mres = new ArrayList<>();

        for(String str:rres) {
            mres.add(""+str);
        }

        for (String str:rres) {
            mres.add(ch+str);
        }
        return mres;
    }
}
