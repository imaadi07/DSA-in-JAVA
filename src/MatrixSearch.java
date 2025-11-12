import java.util.Arrays;

public class MatrixSearch {
    public static void main(String[] args) {
        int [][] matrix = {{1,3,5,7},{10,11,16,20}};
        int target = 3;
        boolean result = searchMatrix(matrix, target);
        System.out.println(result);
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        int[] flatArray = Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .toArray();
        Arrays.sort(flatArray);
        if(flatArray.length == 0) return false;
        for(int i=0; i<flatArray.length; i++) {
                if(flatArray[i] == target) {
                    return true;
                }
        }
        return false;
    }
}
