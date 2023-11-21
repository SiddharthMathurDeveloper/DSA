
class Solution {
    // Function to count equal pairs in a 2D grid
    public int equalPairs(int[][] grid) {
        int value;
        int counter = 0;

        // HashMap to store the hash values for each row
        HashMap<Integer, Integer> lines = new HashMap<>();

        // Calculate and store hash values for each row
        for (int i = 0; i < grid.length; i++) {
            value = hashLine(i, grid);
            lines.put(value, lines.getOrDefault(value, 0) + 1);
        }

        // Iterate through columns and count pairs using the precomputed hash values
        for (int j = 0; j < grid.length; j++) {
            value = hashColumn(j, grid);
            if (lines.containsKey(value))
                counter += lines.get(value);
        }

        return counter;
    }

    // Function to calculate hash value for a row
    private int hashLine(int i, int[][] grid) {
        int hash = 0;
        for (int j = 0; j < grid.length; j++)
            hash = grid[i][j] + (13 * hash);
        return hash;
    }

    // Function to calculate hash value for a column
    private int hashColumn(int j, int[][] grid) {
        int hash = 0;
        for (int i = 0; i < grid.length; i++)
            hash = grid[i][j] + (13 * hash);
        return hash;
    }
}
