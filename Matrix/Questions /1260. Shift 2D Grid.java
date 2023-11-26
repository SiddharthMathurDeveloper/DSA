class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        final int M = grid.length, N = grid[0].length;

        // Create a list to store the shifted grid
        List<List<Integer>> result = new ArrayList<>();

        // Initialize the result list with zeros
        for (int i = 0; i < M; i++) {
            result.add(new ArrayList<>());
            for (int j = 0; j < N; j++) {
                result.get(i).add(0);
            }
        }

        // Iterate through the original grid
        for (int r = 0; r < M; r++) {
            for (int c = 0; c < N; c++) {
                // Calculate the new position after shifting
                int newVal = ((r * N + c) + k) % (M * N);
                int newR = newVal / N;
                int newC = newVal % N;

                // Update the result list with the shifted value
                result.get(newR).set(newC, grid[r][c]);
            }
        }

        // Return the shifted grid
        return result;
    }
}
