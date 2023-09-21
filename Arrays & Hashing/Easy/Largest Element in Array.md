
<h1 align="center"><a href="https://practice.geeksforgeeks.org/problems/largest-element-in-array4009/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab" target="_blank">Largest Element in Array</a></h1>

## Problem statement:
Given an array A[] of size n. The task is to find the largest element in it.

## Example 1:

```
Input:
n = 5
A[] = {1, 8, 7, 56, 90}

Output: 90

Explanation:
The largest element of given array is 90.
```

## Example 2:

```
Input:
n = 7
A[] = {1, 2, 0, 3, 2, 4, 5}

Output: 5

Explanation:
The largest element of given array is 5.
```


## Constraints:

```
1 <= n<= 10^3

0 <= A[i] <= 10^3

Array may contain duplicate elements. 
```

<br/>
 

## Approach (Brute Force) [ Sorting ]:

1. Define a function that takes two parameters: `arr` (an input array) and `n` (the length of the array).

2. Use the `Arrays.sort()` method to sort the input array `arr` in ascending order.

3. After sorting, the smallest element is at index 0, and the largest element is at index `n-1` in the sorted array.

4. Return `arr[n-1]`, which represents the largest element in the original unsorted array.



## Example :

Input Array: [9, 3, 7, 1, 8, 5]

- Initialize `largestNumber` to `Integer.MIN_VALUE`, which is the lowest possible integer value.

- Start iterating through the input array [9, 3, 7, 1, 8, 5].

  - For i = 0, the current element is 9, which is greater than the current `largestNumber` (initially `Integer.MIN_VALUE`). Update `largestNumber` to 9.

  - For i = 1, the current element is 3, which is not greater than `largestNumber`. No update to `largestNumber`.

  - For i = 2, the current element is 7, which is greater than the current `largestNumber` (which is now 9). Update `largestNumber` to 7.

  - For i = 3, the current element is 1, which is not greater than `largestNumber`. No update to `largestNumber`.

  - For i = 4, the current element is 8, which is greater than the current `largestNumber` (which is now 7). Update `largestNumber` to 8.

  - For i = 5, the current element is 5, which is not greater than `largestNumber`. No update to `largestNumber`.

- The iteration is complete, and the final `largestNumber` is 9.

- Return 9 as the largest element.

So, the output of the code for the input [9, 3, 7, 1, 8, 5] is 9, which is the largest element in the array.



## Code: 

```java
class Compute {
    
    // This method computes and returns the largest element in the input array 'arr'.
    public int largest(int arr[], int n) {
        int largestNumber = Integer.MIN_VALUE; // Initialize a variable 'largestNumber' with the lowest possible integer value.

        // Iterate through the input array 'arr'.
        for (int i = 0; i < n; i++) {
            // Check if the current element 'arr[i]' is greater than the current 'largestNumber'.
            if (arr[i] > largestNumber) {
                largestNumber = arr[i]; // If so, update 'largestNumber' with the value of 'arr[i]'.
            }
        }

        return largestNumber; // Return the 'largestNumber', which is the largest element in the array.
    }
}

```



## Complexity:

```
Time complexity: O( N*log(N) )  
Space complexity: O(1)
```


<br/>

 

## Approach (Optimal) [ Single Loop ]:

1. Initialize a variable `largestNumber` with `Integer.MIN_VALUE`, which is the lowest possible integer value.

2. Iterate through the input array `arr` using a for loop.

3. For each element `arr[i]` in the array:
   - Check if `arr[i]` is greater than the current `largestNumber`.
   - If `arr[i]` is greater, update `largestNumber` with the value of `arr[i]`.

4. After iterating through the entire array, `largestNumber` will contain the largest element in the array.



## Example :

Input Array: [9, 3, 7, 1, 8, 5]

The input array has a length of 6.

- Sort the input array in ascending order: [1, 3, 5, 7, 8, 9]

- The largest element is the last element of the sorted array, which is 9.

- Return 9 as the largest element.

So, the output of the code for the input array [9, 3, 7, 1, 8, 5] is 9, which is the largest element in the original unsorted array.



## Code: 

```java
class Compute {
    
    // This method computes and returns the largest element in the input array 'arr'.
    public int largest(int arr[], int n) {
        int largestNumber = Integer.MIN_VALUE; // Initialize a variable 'largestNumber' with the lowest possible integer value.

        // Iterate through the input array 'arr'.
        for (int i = 0; i < n; i++) {
            // Check if the current element 'arr[i]' is greater than the current 'largestNumber'.
            if (arr[i] > largestNumber) {
                largestNumber = arr[i]; // If so, update 'largestNumber' with the value of 'arr[i]'.
            }
        }

        return largestNumber; // Return the 'largestNumber', which is the largest element in the array.
    }
}
```



## Complexity:

```
Time complexity: O( N )  
Space complexity: O(1)
```





## Things I Learned:

- Nothing much
  


## Companies:

```
unknown
```





