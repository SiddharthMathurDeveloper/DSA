
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


 

## Approach (Brute Force) [ Sorting ]:

- 
  
- 
  
-
  
- 



## Code: 

```java
class Compute {
    
    // This method computes and returns the largest element in the input array 'arr'.
    public int largest(int arr[], int n) {
        Arrays.sort(arr); // Sort the input array in ascending order using the Arrays.sort() method.
        
        return arr[n-1]; // Return the last element of the sorted array, which is the largest element.
    }
}
```







## Complexity:

```
Time complexity: O( N*log(N) )  
Space complexity: O(1)
```

## Things I Learned:

- Nothing much
  


## Companies:

```
unknown
```





