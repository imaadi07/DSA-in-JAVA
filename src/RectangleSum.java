import java.util.Scanner;

public class RectangleSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array dimension(row * clo): ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int total = r*c;

        int[][] matrix = new int[r][c];

        System.out.println("Enter "+total+" elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter rectangle boundries: (l1, r1, l2 r2)");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

//        int result = reactangeSumOptimized(matrix, l1, r1, l2, r2);
//        System.out.println("Rectangle sum: " + result);
        System.out.println("Rectangle sum: " + findSumThree(matrix, l1, r1, l2, r2));
    }

    static int rectangleSum(int[][] matrix, int l1, int r1, int l2, int r2) {
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    static int reactangeSumOptimized(int[][] matrix, int l1, int r1, int l2, int r2) {
        int prefix = 0;
        findPrefixSumMatrix(matrix);

        for (int i = l1; i <= l2; i++) {
           if(r1 >= 1) {
               prefix += matrix[i][r2] - matrix[i][r1 - 1];
           } else {
               prefix += matrix[i][r2];
           }
        }
        return prefix;
    }

    static void findPrefixSumMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = 0;
        if(r > 0) {
            c = matrix[0].length;
        } else {
            return;
        }
        // Traverse horizontlly to calculate prefix sum
        for (int i = 0; i < r; i++) { // fixing row
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j-1];
            }
        }

        // traverse horizontally to calculate prefix sum
        for (int j = 0; j < c; j++) { // fixing column
            for (int i = 1; i < r; i++) {
                matrix[i][j] += matrix[i-1][j];
            }
        }
    }

    static int findSumThree(int[][] matrix, int l1, int r1, int l2, int r2) {
        int ans = 0, sum = 0, up = 0, left = 0, leftUp = 0;
        findPrefixSumMatrix(matrix);

        sum = matrix[l2][r2];
        if(r1 >= 1)
            left = matrix[l2][r1 - 1];
        if(l1 >= 1)
            up = matrix[l1 - 1][r2];
        if(l1 >= 1 && r1 >= 1)
            leftUp = matrix[l1 - 1][r1 - 1];

        ans = sum - up - left + leftUp;

        return ans;
    }
}
