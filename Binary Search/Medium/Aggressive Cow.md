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

1. Sort the stalls in ascending order. This step ensures that we can apply binary search effectively.

2. Initialize two variables, `start` and `end`, which represent the possible range of minimum distances. `start` is initially set to 1 (minimum possible distance), and `end` is set to the maximum possible distance, which is the difference between the last stall's position and the first stall's position.

3. Perform a binary search within the range `[start, end]` to find the maximum minimum distance that allows us to place 'k' cows.

4. In each iteration of the binary search:

    a. Calculate the middle distance, `mid`, as `(start + end) / 2`.

    b. Check if it's possible to place 'k' cows with at least a distance of `mid` between them using the `isPossibleToPlace` function.

    c. The `isPossibleToPlace` function checks if 'k' cows can be placed with at least a distance of `mid` between them in the stalls. It iterates through the stalls and keeps track of the number of placed cows and the position of the last placed cow. If 'k' cows are successfully placed, it returns true; otherwise, it returns false.

    d. Based on the result of `isPossibleToPlace`, update the `ans` variable. If it's possible to place 'k' cows with a distance of `mid`, set `ans` to `mid` and move to the right half of the range by updating `start = mid + 1`. If it's not possible, move to the left half by updating `end = mid - 1`.

5. Repeat steps 4-6 until `start` becomes greater than `end`.

6. Finally, return the value of `ans`, which represents the maximum minimum distance between cows that allows placing 'k' cows.

## Example:

Let's say we have 'n' stalls and 'k' cows, and the positions of the stalls are given as follows:

Stalls: 1 2 4 8 9
Cows: k = 3

We want to find the maximum minimum distance between cows such that we can place 3 cows with at least that distance between them.

**Initial Range:**

    start = 1 (minimum possible distance)
    end = 9 - 1 = 8 (maximum possible distance)

**Iteration 1 (Binary Search):**

    Calculate mid = (1 + 8) / 2 = 4.
    Check if it's possible to place 3 cows with a minimum distance of 4 between them:
    Starting at position 1, place a cow at position 5 (distance = 4).
    Starting at position 5, place a cow at position 9 (distance = 4).
    It's possible to place 3 cows, so update ans = 4 and move to the right half:
    start = 4 + 1 = 5
    end remains 8.

**Iteration 2 (Binary Search):**

    Calculate mid = (5 + 8) / 2 = 6.
    Check if it's possible to place 3 cows with a minimum distance of 6 between them:
    Starting at position 1, place a cow at position 7 (distance = 6).
    Starting at position 7, place a cow at position 9 (distance = 2).
    It's possible to place 3 cows, so update ans = 6 and move to the right half:
    start = 6 + 1 = 7
    end remains 8.

**Iteration 3 (Binary Search):**

    Calculate mid = (7 + 8) / 2 = 7.
    Check if it's possible to place 3 cows with a minimum distance of 7 between them:
    Starting at position 1, place a cow at position 8 (distance = 7).
    Starting at position 8, place a cow at position 9 (distance = 1).
    It's possible to place 3 cows, so update ans = 7 and move to the right half:
    start becomes 8, which is greater than end.

The binary search ends, and the maximum minimum distance that allows placing 3 cows is ans = 7. So, the function returns 7 as the result.



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





