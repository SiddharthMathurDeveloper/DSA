
class Solution{
int[][] swapTriangle(int N, int matrix[][]) {
    int matrixRow = matrix.length; // Get the number of rows in the matrix
    int matrixCol = matrix[0].length; // Get the number of columns in the matrix

    // Iterate through the rows and columns of the matrix
    for (int i = 0; i < matrixRow; i++) {
        for (int j = 0; j < i; j++) {
            // Swap the elements at position (i, j) and (j, i) to interchange upper and lower triangle elements
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }

    // Return the modified matrix, which has the upper and lower triangles swapped
    return matrix;
}
}
