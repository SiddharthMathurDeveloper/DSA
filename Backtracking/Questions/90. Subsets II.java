class Solution {
  public void subsetsWithDupHelper(int index, int[] arr, List<Integer> ds, List<List<Integer>> ans) {
    ans.add(new ArrayList<>(ds));

    for (int i = index; i < arr.length; i++) {
        // Skip duplicate elements to avoid duplicates in subsets
        if (i != index && arr[i] == arr[i - 1]) continue;

        ds.add(arr[i]);
        subsetsWithDupHelper(i + 1, arr, ds, ans);
        ds.remove(ds.size() - 1);
      }
  }

  public List<List<Integer>> subsetsWithDup(int[] nums) {
      List<List<Integer>> ans = new ArrayList<>();
      List<Integer> ds = new ArrayList<>();

      // Sort the input array to handle duplicates
      Arrays.sort(nums);

      subsetsWithDupHelper(0, nums, ds, ans);
      return ans;
  }
}
