import java.util.Arrays;

public class TransposeOfAMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 6, 11, 16, 21},
                {2, 7, 12, 17, 22},
                {3, 8, 13, 18, 23},
                {4, 9, 14, 19, 24},
                {5, 10, 15, 20, 25}
        };

        System.out.println("Original Matrix: ");
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Transposed Matrix: ");
        System.out.println(Arrays.deepToString(transposeEff(arr)));
    }

    //O(n2) coz new matrix
    public static int[][] transpose(int[][] A) {
        int[][] tArr = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                tArr[j][i] = A[i][j];
            }
        }
        return tArr;
    }

    public static int[][] transposeEff(int[][] A) {
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        return A;
    }
}
