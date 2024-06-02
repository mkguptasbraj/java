public class arraymultiplt {
    public static void main(String[] args) {
        
            int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        // Add the matrices
        int[][] resultMatrix = addMatrices(matrix1, matrix2);

        // Display the result
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);

        System.out.println("Matrix 2:");
        displayMatrix(matrix2);

        System.out.println("Resultant Matrix after addition:");
        displayMatrix(resultMatrix);
    }

    // Function to add two matrices
    static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = 3;
        int columns = 3;
        int[][] resultMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return resultMatrix;
    }

    // Function to display a matrix
    static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
            
         }
    }

