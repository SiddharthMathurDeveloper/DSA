class Solution {

  private void findCombinationSum2(int index, int[] arr, List<Integer> ds, List<List<Integer>> ans, int target) {
    if (target == 0) {
        ans.add(new ArrayList<>(ds)); // Add the current combination to the result
        return;
    }

    for (int i = index; i < arr.length; i++) {
        if (arr[i] > target) {
            break; // Stop if the current element is greater than the remaining target
        }

        if (i > index && arr[i] == arr[i - 1]) {
            continue; // Skip duplicate elements to avoid duplicate combinations
        }

        ds.add(arr[i]); // Include the current element in the combination
        findCombinationSum2(i + 1, arr, ds, ans, target - arr[i]); // Recursively search for combinations
        ds.remove(ds.size() - 1); // Backtrack: remove the last element to explore other possibilities
    }
}

public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    List<List<Integer>> ans = new ArrayList<>();

    List<Integer> ds = new ArrayList<>();

    Arrays.sort(candidates); // Sort the candidates to handle duplicates

    findCombinationSum2(0, candidates, ds, ans, target);

    return ans; // Return the list of combinations
}
  
}
