import java.util.ArrayList;

public class Arraylists {
    public static void main(String[] args) {
        String s = "bccbcdcabadabddbccaddcbabbaaacdba";
        String t = "bccbbdc";
//        System.out.println(numDistince(s, t));
    }

    static ArrayList<String> getss(String str) {
        if(str.isEmpty()) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = getss(ros);

        ArrayList<String> mres = new ArrayList<>();
        for(String strs:rres) {
            mres.add("" + strs);
        }
        for(String strs:rres) {
            mres.add(ch + strs);
        }
        return mres;}


}
