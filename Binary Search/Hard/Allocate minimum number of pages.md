<h1 align="center"><a href="https://practice.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/0" target="_blank">Allocate minimum number of pages</a></h1>

## Problem statement:
You have `N` books, each with `Ai` number of pages. `M` students need to be allocated contiguous `books`, 
with each student getting at least one book. 
Out of all the permutations, the goal is to find the permutation where the student with the most books allocated to him gets the minimum number of pages, 
out of all possible permutations.

Note: Return -1 if a valid assignment is not possible, and allotment should be in contiguous order (see the explanation for better understanding).


## Example 1:

```
Input:
N = 4
A[] = {12,34,67,90}
M = 2

Output:113

Explanation:Allocation can be done in 
following ways:
{12} and {34, 67, 90} Maximum Pages = 191
{12, 34} and {67, 90} Maximum Pages = 157
{12, 34, 67} and {90} Maximum Pages =113.
Therefore, the minimum of these cases is 113,
which is selected as the output.
```

## Example 2:

```

Input:
N = 3
A[] = {15,17,20}
M = 2

Output:32

Explanation: Allocation is done as
{15,17} and {20}
```



## Constraints:

```
Constraints:
1 <= N <= 10^5
1 <= A [ i ] <= 10^6
1 <= M <= 10^5

```


 

## Approach:

- 
  
- 
  
-
  
- 



## Code: 

```java

```







## Complexity:

```
Time complexity: O(NlogN)
Space complexity: O(1)
```

## Things I Learned:

- How to code the helper function , Getting optimal start and end values , not using possble methods
  


## Companies:

```
unknown
```





