
class Solution {
    // Function to get the boundary elements of a given matrix
    public int[] BoundaryElements(int[][] matrix) {
        // Get the number of rows in the matrix
        int n = matrix.length;
        
        // Calculate the total number of boundary elements in the matrix
        int totalElements = ((n - 2) * 2) + (2 * n);
        
        // Create an array to store the boundary elements
        int[] boundaryElements = new int[totalElements];
        
        // If the matrix has only one element, return it as the boundary
        if (n == 1) {
            return new int[]{matrix[0][0]};
        }

        // Index to keep track of the current position in the boundaryElements array
        int index = 0;

        // Iterate through the matrix to extract boundary elements
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                // If it's the first or last row, add all elements to the boundary
                for (int j = 0; j < n; j++) {
                    boundaryElements[index++] = matrix[i][j];
                }
            } else {
                // If it's not the first or last row, add the first and last element of each row
                boundaryElements[index++] = matrix[i][0];
                boundaryElements[index++] = matrix[i][n - 1];
            }
        }
        
        // Return the array containing boundary elements
        return boundaryElements;
    }
}
