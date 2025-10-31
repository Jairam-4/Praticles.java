public class CalculateMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = { {1, 2, 3}, {4, 5, 6} };
        int[][] matrix2 = { {7, 8}, {9, 10}, {11, 12} };
        int[][] product = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                product[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Product of 2x3 and 3x2 matrices:");
        for (int[] row : product) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
