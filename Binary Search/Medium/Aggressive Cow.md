<h1 align="center"><a href="https://practice.geeksforgeeks.org/problems/aggressive-cows/0" target="_blank">Aggressive Cow</a></h1>

## Problem statement:
You are given an `array` consisting of `n integers` which denote the position of a stall. You are also given an `integer k` which denotes the number of aggressive cows. 
You are given the task of `assigning stalls to k cows` such that the `minimum distance between any two of them is the maximum possible`.
The first line of input contains two space-separated integers `n` and `k`.
The second line contains n space-separated integers denoting the position of the stalls.


## Example 1:

```
Input:
n=5 
k=3
stalls = [1 2 4 8 9]

Output: 3

Explanation:
The first cow can be placed at stalls[0], 
the second cow can be placed at stalls[2] and 
the third cow can be placed at stalls[3]. 
The minimum distance between cows, in this case, is 3, 
which also is the largest among all possible ways.

```

## Example 2:

```
Input:
n=5 
k=3
stalls = [10 1 2 7 5]

Output: 4

Explanation:
The first cow can be placed at stalls[0],
the second cow can be placed at stalls[1] and
the third cow can be placed at stalls[4].
The minimum distance between cows, in this case, is 4,
which also is the largest among all possible ways.

```


## Constraints:

```
2 <= n <= 10^5

2 <= k <= n

0 <= stalls[i] <= 10^9
```


 

## Approach:

- 
  
- 
  
-
  
- 



## Code: 

```java
public static int solve(int n, int k, int[] stalls) {
    // Call the maxStallAssignToKthCows function to find the maximum distance
    // to assign k cows to the given stalls.
    return maxStallAssignToKthCows(stalls, n, k);
}

// This function calculates the maximum distance to assign k cows to the stalls.
private static int maxStallAssignToKthCows(int[] stalls, int stallSize, int k) {
    // Sort the stalls in ascending order to simplify the calculations.
    Arrays.sort(stalls);

    // Initialize the search range.
    int start = 1;
    int end = stalls[stallSize - 1] - stalls[0];

    // Initialize the answer to store the maximum distance.
    int ans = 0;

    // Perform binary search to find the maximum distance.
    while (start <= end) {
        int mid = start + (end - start) / 2;

        // Check if it's possible to place k cows with a minimum distance of 'mid'.
        if (isPossibleToPlace(stalls, k, mid)) {
            ans = mid; // Update the answer with the current 'mid'.
            start = mid + 1; // Move the search range to the right.
        } else {
            end = mid - 1; // Move the search range to the left.
        }
    }

    // Return the maximum distance that allows placing k cows in stalls.
    return ans;
}

// This function checks if it's possible to place 'totalCows' cows in stalls
// with a minimum distance of 'distance' between each cow.
private static boolean isPossibleToPlace(int[] stalls, int totalCows, int distance) {
    int placedCows = 1; // Initialize the number of cows placed.
    int lastCowPosition = stalls[0]; // Initialize the position of the last placed cow.

    // Iterate through the stalls to check placement possibilities.
    for (int i = 1; i < stalls.length; i++) {
        if (stalls[i] - lastCowPosition >= distance) {
            placedCows++; // Place a cow if the distance condition is met.
            lastCowPosition = stalls[i]; // Update the position of the last placed cow.
        }

        if (totalCows == placedCows) {
            return true; // If all cows are placed, return true.
        }
    }

    return false; // Return false if it's not possible to place all cows.
}
```







## Complexity:

```
Time complexity: O(n*log(10^9))
Space complexity: O(1)
```

## Things I Learned:

- How to code the helper function which seems easy than expected ,
  Range from 1 to max-min(observation) which is important for best code
  


## Companies:

```
Unknown
```





