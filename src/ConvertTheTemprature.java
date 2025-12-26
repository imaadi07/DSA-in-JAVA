import java.util.Arrays;

public class ConvertTheTemprature {
    public static void main(String[] args) {
        double temp = 36.50;
        double[] ans = calculate(temp);
        System.out.println(Arrays.toString(ans));
    }

    public static double[] calculate(double celsius) {
        double[] ans = new double[2];
        ans[0] = celsius + 273.15;
        ans[1] = celsius * 1.80 + 32.00;
        return ans;
    }
}
