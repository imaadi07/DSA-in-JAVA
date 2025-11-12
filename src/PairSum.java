public class PairSum {
    public static void main(String[] args) {
        int[] arr = {1,30,-5,70,-8,20,-40,60,-5};
        pairSum(arr);
    }

    public static void pairSum(int[] arr) {
        if(arr.length < 2) {
            System.out.println("Array has only one element");
            return;
        }

        int closestSum = Integer.MAX_VALUE;
        int firstPair = 0;
        int secondPair = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int currentSum = arr[i] + arr[j];
                int absoluteDiff = Math.abs(currentSum);

                if(absoluteDiff < Math.abs(closestSum)) {
                    closestSum = currentSum;
                    firstPair = arr[i];
                    secondPair = arr[j];
                }
            }
        }
        System.out.println("Pair: " + firstPair + " " + secondPair);
        System.out.println("Closest Sum: " + closestSum);
    }
}
