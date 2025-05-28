public class MatrixZigZag {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        zigZag(arr);

    }

    public static void zigZag(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {  //[i] or cases where i=j (4*3)
                    System.out.println(matrix[i][j]);
                }
            } else
                for (int j = matrix[i].length -1; j >= 0; j--) {
                    System.out.println(matrix[i][j]);
                }
        }
    }
}
