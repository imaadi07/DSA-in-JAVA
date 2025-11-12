import java.sql.SQLOutput;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] b = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        MatrixSum(a, 3, 3, b, 3, 3);
        matrixMul(a, 3, 3, b, 3, 3);
    }

    static void MatrixSum(int[][] a, int r1,int c1, int[][] b, int r2, int c2) {
        if(r1 != r2 && c1 != c2) {
            return;
        }

        int[][] sum = new int[r1][c1];

        System.out.println("Matric Sum: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        printMatrix(sum);
    }

    static void matrixMul(int[][] a, int r1,int c1, int[][] b, int r2, int c2) {
        if(c2 != r1) {
            System.out.println("Wrong array dimension!!");
            return;
        }

        int[][] mul = new int[r1][c2];

        System.out.println("Matix Multiplicaion: ");
        for (int i = 0; i < r1; i++) { //row number
            for (int j = 0; j < c2; j++) { // Column number
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        printMatrix(mul);
    }

    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j= 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
