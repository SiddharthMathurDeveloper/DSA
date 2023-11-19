class Solution {
    // Recursive function to find subset sums
    public void findSubsetSums(int i, ArrayList<Integer> arr, ArrayList<Integer> ans, int sum) {
        // Base case: if all elements are considered
        if (i == arr.size()) {
            ans.add(sum);
            return;
        }

        // Include the current element in the sum and recurse
        sum += arr.get(i);
        findSubsetSums(i + 1, arr, ans, sum);

        // Exclude the current element from the sum and recurse
        sum -= arr.get(i);
        findSubsetSums(i + 1, arr, ans, sum);
    }

    // Function to generate subset sums
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N) {
        ArrayList<Integer> ans = new ArrayList<Integer>();

        // Start the recursive process from the beginning of the array
        findSubsetSums(0, arr, ans, 0);

        return ans;
    }
}

