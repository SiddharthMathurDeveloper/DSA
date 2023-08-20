


## Binary Search - Itervative

```java
public int search(int[] nums, int target) {
        int start = 0; // Initialize the start index of the binary search range
        int end = nums.length - 1; // Initialize the end index of the binary search range

        // Perform binary search until the start index is less than or equal to the end index
        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculate the middle index

            if (nums[mid] == target) {
                return mid; // If the middle element is the target, return its index
            } else if (nums[mid] > target) {
                end = mid - 1; // If the middle element is greater than the target, adjust the end index
            } else {
                start = mid + 1; // If the middle element is smaller than the target, adjust the start index
            }
        }

        return -1; // If the target is not found in the array, return -1
    }
```

## Binary Search - Recursion

```java

// Recursive binary search function
    public int binarySearchRecursive(int[] nums, int target, int start, int end) {
        // Calculate the middle index
        int mid = start + (end - start) / 2;

        // Base case: if start index becomes greater than end index, return -1 (target not found)
        if (start > end) {
            return -1;
        }

        // If the middle element is the target, return its index
        if (nums[mid] == target) {
            return mid;
        }

        // If the middle element is greater than the target, search the left half
        if (nums[mid] > target) {
            return binarySearchRecursive(nums, target, start, mid - 1);
        }

        // Otherwise, search the right half
        return binarySearchRecursive(nums, target, mid + 1, end);
    }

    // Wrapper function for recursive binary search
    public int search(int[] nums, int target) {
        int start = 0; // Initialize the start index
        int end = nums.length - 1; // Initialize the end index
        return binarySearchRecursive(nums, target, start, end); // Call the recursive binary search function
    }
```
