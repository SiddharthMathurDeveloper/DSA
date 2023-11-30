
// Functional Way

class Solution {
    // Helper function to generate subsets using recursion
    private void subsetsHelper(int i, int[] arr, List<Integer> ds, List<List<Integer>> ans) {
        // Base case: If the index reaches the end of the array, add the current subset to the result
        if (i == arr.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        // Include the current element in the subset
        ds.add(arr[i]);
        subsetsHelper(i + 1, arr, ds, ans);

        // Exclude the current element from the subset
        ds.remove(ds.size() - 1);
        subsetsHelper(i + 1, arr, ds, ans);
    }

    // Main function to generate subsets
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        // Call the helper function to generate subsets starting from index 0
        subsetsHelper(0, nums, ds, ans);

        // Return the final list of subsets
        return ans;
    }
}


// Looping Way

class Solution {
    // Helper function to generate subsets using a loop
    private void subsetsHelper(int index, int[] arr, List<Integer> ds, List<List<Integer>> ans) {
        // Add the current subset to the result
        ans.add(new ArrayList<>(ds));
        
        // Iterate through the array starting from the given index
        for (int i = index; i < arr.length; i++) {
            // Include the current element in the subset
            ds.add(arr[i]);
            
            // Recursively call the function with the updated index
            subsetsHelper(i + 1, arr, ds, ans);
            
            // Exclude the current element from the subset (backtrack)
            ds.remove(ds.size() - 1);
        }
    }

    // Main function to generate subsets
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        // Call the helper function to generate subsets starting from index 0
        subsetsHelper(0, nums, ds, ans);

        // Return the final list of subsets
        return ans;
    }
}









