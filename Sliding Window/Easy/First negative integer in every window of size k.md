<h1 align="center"><a href="First negative integer in every window of size k" target="_blank">First negative integer in every window of size k</a></h1>

## Problem statement:
Given an array `A[]` of size `N` and a positive integer `K`, find the first negative integer for each and every window(contiguous subarray) of size `K`.


## Example 1:

```
Input : 
N = 5
A[] = {-8, 2, 3, -6, 10}
K = 2

Output : 
-8 0 -6 -6

Explanation :
First negative integer for each window of size k
{-8, 2} = -8
{2, 3} = 0 (does not contain a negative integer)
{3, -6} = -6
{-6, 10} = -6

```

## Example 2:

```
Input : 
N = 8
A[] = {12, -1, -7, 8, -15, 30, 16, 28}
K = 3

Output :
-1 -1 -7 -15 -15 0
```


## Constraints:

```
1 <= N <= 10^5
-10^5 <= A[i] <= 10^5
1 <= K <= N
```


 

## Approach - 1:



**Input:**
- `nums`: An array of integers.
- `subarraySize`: The size of the subarrays to consider.

**Output:**
- An array `result` containing the first negative integer of each subarray of size `k`. If no negative integer is present in a subarray, 0 will be placed at that position in the `result` array.

**Steps:**

1. Initialize variables:
   - `left`: The left pointer of the sliding window, set to 0.
   - `right`: The right pointer of the sliding window, set to 0.
   - `negativeNums`: A list to store negative integers encountered within the current window.
   - `result`: An empty list to store the final output - the first negative integer for each window.

2. Traverse the `nums` array using the right pointer in a while loop:
 while right < nums.length:


3. If the element at the right pointer (`nums[right]`) is negative, add it to the `negativeNums` list:

if nums[right] < 0:
negativeNums.add((long) nums[right]);


4. Check if the window size (`right - left + 1`) is equal to `subarraySize`. When the window size reaches `subarraySize`, it means we have a valid window to process:





## Code: 

```java
public long[] findFirstNegativeInSubarrays(long[] nums, int length, int subarraySize) {
    // Initialize two pointers for the sliding window
    int left = 0;
    int right = 0;

    // List to store negative integers within the window
    List<Long> negativeNums = new ArrayList<>();

    // List to store the final result
    List<Long> result = new ArrayList<>();

    // Loop through the array
    while (right < length) {
        // If the element at the right pointer is negative, add it to the 'negativeNums' list
        if (nums[right] < 0) {
            negativeNums.add(nums[right]);
        }

        // Check if the window size is equal to 'subarraySize'
        if (right - left + 1 == subarraySize) {
            // If there are negative integers within the window, add the first one to 'result'
            if (!negativeNums.isEmpty() && nums[left] == negativeNums.get(0)) {
                result.add(negativeNums.get(0));
                negativeNums.remove(0); // Remove the first negative integer from the list
            } else {
                result.add(0L); // If there are no negative integers in the window, add 0 to 'result'
            }
            left++; // Move the left pointer one step forward to slide the window
        }
        right++; // Move the right pointer one step forward
    }

    // Convert the 'result' list to an array and return it
    long[] outputArray = new long[result.size()];
    for (int i = 0; i < result.size(); i++) {
        outputArray[i] = result.get(i);
    }

    return outputArray;
}
```







## Complexity:

```
Time complexity: O(2N)  [Two loops]
Space complexity: O(1)
```

## Things I Learned:

- Tackling -ve values ,  n-k + 1 formula to know total subarray that will exist , Queue being used for push,pop
  

## Companies:

```
Don't Know
```





