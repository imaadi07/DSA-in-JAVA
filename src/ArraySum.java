class Arrayas {
    int sumArray() {
        int [] arr = {1, 2, 3};
        int sum = 0;

        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
}

public class ArraySum {
    public static void main(String[] args) {
        Arrayas obj = new Arrayas();
        int answer = obj.sumArray();
        System.out.println(answer);
    }
}
