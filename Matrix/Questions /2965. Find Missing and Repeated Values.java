class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;

        // HashMap to store the frequency of each value in the grid
        HashMap<Integer, Integer> toFindFirstTwiceElement = new HashMap<>();

        // Array to store the result [Repeated, Missing]
        int[] ans = {0, 0};

        // Traverse each cell in the grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int currentCellValue = grid[i][j];
                // Update the frequency of the current cell value
                toFindFirstTwiceElement.put(currentCellValue, toFindFirstTwiceElement.getOrDefault(currentCellValue, 0) + 1);

                // Check if the current cell value is encountered for the second time
                if (toFindFirstTwiceElement.get(currentCellValue) == 2) {
                    ans[0] = currentCellValue; // Set the repeated value
                    continue;
                }
            }
        }

        // Iterate from 1 to n*n to find the missing value
        for (int i = 1; i <= n * n; i++) {
            if (!toFindFirstTwiceElement.containsKey(i)) {
                ans[1] = i; // Set the missing value
                break;
            }
        }

        return ans;
    }
}
