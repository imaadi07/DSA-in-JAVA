import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        ArrayList<Integer> r = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();

        // finding 0's
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] == 0) {
                    r.add(i);
                    c.add(j);
                }
            }
        }

        // creating row as 0's
        for (int i = 0; i < r.size(); i++) {
            int index = r.get(i);
            for (int j = 0; j < n; j++) {
                matrix[index][j] = 0;
            }
        }

        // creating column 0's
        for (int i = 0; i < c.size(); i++) {
            int index = c.get(i);
            for (int j = 0; j < m; j++) {
                matrix[j][index] = 0;
            }
        }
    }
}
