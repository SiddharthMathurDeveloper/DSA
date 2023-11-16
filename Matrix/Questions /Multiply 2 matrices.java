class Solution{
  public void Multiply(int[][] matrixA, int[][] matrixB) {
    int rowsA = matrixA.length; // Get the number of rows in matrixA
    int colsA = matrixA[0].length; // Get the number of columns in matrixA
    int colsB = matrixB[0].length; // Get the number of columns in matrixB

    int[][] result = new int[rowsA][colsB]; // Initialize the result matrix

    // Perform matrix multiplication
    for (int i = 0; i < rowsA; i++) {
        for (int j = 0; j < colsB; j++) {
            for (int k = 0; k < colsA; k++) {
                result[i][j] += matrixA[i][k] * matrixB[k][j]; // Accumulate the product of corresponding elements
            }
        }
    }

    // Update matrixA with the result of matrix multiplication
    for (int i = 0; i < rowsA; i++) {
        for (int j = 0; j < colsB; j++) {
            matrixA[i][j] = result[i][j];
        }
    }

    return;
}

}
