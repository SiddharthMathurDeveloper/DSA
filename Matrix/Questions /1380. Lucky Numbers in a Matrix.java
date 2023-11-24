class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        // Get the number of rows and columns in the matrix
        int n = matrix.length;
        int m = matrix[0].length;

        // Create an ArrayList to store the lucky numbers
        ArrayList<Integer> luckyNumbers = new ArrayList<Integer>();

        // Iterate through each row of the matrix
        for (int i = 0; i < n; i++) {
            // Initialize variables to find the minimum element in the current row
            int num = Integer.MAX_VALUE;  // Initialize with a large value
            int index = -1;

            // Find the minimum element and its index in the current row
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] < num) {
                    num = matrix[i][j];
                    index = j;
                }
            }

            // Check if the minimum element in the row is also the maximum in its column
            boolean flag = true;
            for (int row = 0; row < n; row++) {
                if (matrix[row][index] > num) {
                    flag = false;
                }
            }

            // If the minimum element is also the maximum in its column, add it to the lucky numbers list
            if (flag) {
                luckyNumbers.add(num);
            }
        }

        // Return the list of lucky numbers
        return luckyNumbers;
    }
}
