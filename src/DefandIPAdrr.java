public class DefandIPAdrr {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defandIPaddr(address));
    }

    static String defandIPaddr(String address) {
        String defang = address.replace(".", "[.]");
        return defang;
    }
}
