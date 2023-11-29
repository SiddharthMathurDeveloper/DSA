class Solution {

    // Helper function to generate combinations using backtracking
    private void combineHelper(int index, int n, int k, List<Integer> ds, List<List<Integer>> ans) {
        // If the current combination size equals 'k', add it to the result
        if (ds.size() == k) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        // Iterate through the numbers starting from 'index' to 'n'
        for (int i = index; i <= n; i++) {
            // Include the current number in the combination
            ds.add(i);

            // Recursively generate combinations for the remaining elements
            combineHelper(i + 1, n, k, ds, ans);

            // Backtrack: Remove the last element to explore other possibilities
            ds.remove(ds.size() - 1);
        }
    }

    // Main function to generate all combinations of 'k' elements from the numbers 1 to 'n'
    public List<List<Integer>> combine(int n, int k) {
        // Initialize the result list
        List<List<Integer>> ans = new ArrayList<>();
        // Temporary list to store each combination during the process
        List<Integer> ds = new ArrayList<>();

        // Start the combination generation process with initial parameters
        combineHelper(1, n, k, ds, ans);

        // Return the final list of combinations
        return ans;
    }
}
