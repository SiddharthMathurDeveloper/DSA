
class Solution {
public int[][] construct2DArray(int[] original, int m, int n) {
    int originalLength = original.length;

    // Check if the number of elements in the 1D array matches the expected size of the 2D array
    if (originalLength != m * n) {
        return new int[0][0]; // If the sizes do not match, return an empty 2D array
    }

    int[][] reconstruct2DArray = new int[m][n]; // Create a 2D array to store the converted elements
    int row = 0;
    int column = 0;

    // Traverse the 1D array and populate the 2D array with its elements
    for (int i = 0; i < originalLength; i++) {
        reconstruct2DArray[row][column] = original[i]; // Place the current element in the 2D array
        column++;

        // If the column reaches its limit, move to the next row and reset the column
        if (column == n) {
            row++;
            column = 0;
        }
    }

    return reconstruct2DArray; // Return the constructed 2D array
}
}
