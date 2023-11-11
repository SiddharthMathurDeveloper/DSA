// Using Two HashSet
class Solution {
    // Method to check the validity of a square matrix
    public boolean checkValid(int[][] matrix) {
        HashSet<Integer> row; // Set to store elements in a row
        HashSet<Integer> column; // Set to store elements in a column

        int n = matrix.length; // Fetch the size of the matrix

        // Iterate through the matrix rows and columns
        for (int i = 0; i < n; i++) {
            row = new HashSet<>(); // Initialize a new set for each row
            column = new HashSet<>(); // Initialize a new set for each column

            // Store elements from the current row and column in their respective sets
            for (int j = 0; j < n; j++) {
                row.add(matrix[i][j]); // Add elements from the row to the row set
                column.add(matrix[j][i]); // Add elements from the column to the column set
            }

            // Check if the number of unique elements in a row or column is not equal to the matrix size
            if (row.size() != n || column.size() != n) {
                return false; // If a row or column contains duplicates, the matrix is invalid
            }
        }

        // If all rows and columns contain only unique elements, the matrix is considered valid
        return true;
    }
}




// XOR Way
class Solution {
    // Method to check the validity of a square matrix
    public boolean checkValid(int[][] matrix) {
        int sum = 0;

        // Calculate the XOR of numbers from 1 to the matrix length
        for (int i = 1; i <= matrix.length; i++)
            sum ^= i;

        int RowXor = 0, ColXor = 0;

        // Iterate through the matrix rows and columns
        for (int i = 0; i < matrix.length; i++) {
            RowXor = sum; // Set the initial XOR value for the row
            ColXor = sum; // Set the initial XOR value for the column

            // Check each element in the current row and column
            for (int j = 0; j < matrix.length; j++) {
                RowXor ^= matrix[i][j]; // Update the XOR for the row
                ColXor ^= matrix[j][i]; // Update the XOR for the column

                // Check if adjacent elements in the same row are equal
                if (j + 1 < matrix[0].length) {
                    if (matrix[i][j] == matrix[i][j + 1])
                        return false;
                }
            }

            // Check if the XOR for the row or column is not zero, indicating invalidity
            if ((RowXor > 0) || (ColXor > 0))
                return false;
        }

        // If the matrix passes all checks, it's considered valid
        return true;
    }
}
