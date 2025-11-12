import java.math.BigInteger;

public class MultiplyString {
    public static void main(String[] args) {
        String num1 = "123456789";
        String num2 = "987654321";
        String result = multiply(num1, num2);
        System.out.println(result);
    }
    static String multiply(String num1, String num2) {
        BigInteger nums1 = new BigInteger(num1);
        BigInteger nums2 = new BigInteger(num2);
        BigInteger Product = nums1.multiply(nums2);
        return Product.toString();
    }
}
