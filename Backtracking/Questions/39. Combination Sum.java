class Solution {

    // Helper method to find combinations
    public void findCombination(int index, List<List<Integer>> ans, List<Integer> ds, int[] arr, int target) {
        // Base case: If we have reached the end of the array
        if (index == arr.length) {
            // Check if the target is achieved, then add the current combination to the result
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        // Check if the current candidate at index can be included in the combination
        if (target >= arr[index]) {
            ds.add(arr[index]); // Include the current candidate
            findCombination(index, ans, ds, arr, target - arr[index]); // Recursively search for combinations
            ds.remove(ds.size() - 1); // Backtrack: Remove the last added candidate for exploring other possibilities
        }

        // Skip to the next candidate without including the current one also don't add because we have skipped it
        findCombination(index + 1, ans, ds, arr, target);
    }

    // Main method to find all combinations that sum up to the target
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        // Start the recursive search for combinations from index 0
        findCombination(0, ans, ds, candidates, target);
        return ans; // Return the final result
    }
}
