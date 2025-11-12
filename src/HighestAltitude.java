public class HighestAltitude {
    public static void main(String[] args) {
        int [] gain = {28,0,-8,-99,11,62,-35,68,2,12,-71,13,66,-28};
        int result = highestAltitude(gain);
        System.out.println(result);
    }

    static int highestAltitude(int [] gain) {
        int high = 0;
        int current = 0;
        for(int g : gain) {
            current += g;
            if(current > high) {
                high = current;
            }
        }
        return high;
    }
}
