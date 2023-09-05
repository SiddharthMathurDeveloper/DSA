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

1. **Sort the Array**: First, sort the array of ball positions, `position`, in ascending order. Sorting makes it easier to work with the positions of the balls.

2. **Define Search Range**: Define a search range for the minimum distance between balls. The minimum possible distance is 0 (if two balls are at the same position), and the maximum possible distance is the difference between the first and last positions in the sorted array.

3. **Binary Search**: Use binary search to find the maximum distance (`ans`) that allows placing 'm' balls while maintaining the minimum distance.

4. **Binary Search Iteration**:
   - In each iteration of the binary search, calculate the mid-point of the current search range.
   - Check if it's possible to place 'm' balls with a minimum distance of the mid-point distance between them using a helper function, `isPossibleToPlace`.

5. **Check Possibility with Helper Function**:
   - In the `isPossibleToPlace` function, starting from the first ball position, try to place 'm' balls while maintaining the minimum distance.
   - If it's possible, update `ans` with the mid-point distance and move the search range to the right. This means we can potentially place balls farther apart.
   - If it's not possible, move the search range to the left, reducing the minimum distance between balls.

6. **Continue Binary Search**: Continue the binary search until the search range is reduced to a single value.

7. **Return Maximum Distance**: Return the maximum distance (`ans`) found during the binary search.

## Example 

1. **Input**:
   - A list of book page numbers, `A = [12, 34, 67, 90]`.
   - The total number of books, `N = 4`.
   - The number of students, `M = 2`.

2. **Initial Search Range**:
   - Initially, the search range is `[90, 203]`, which represents the maximum and minimum pages.

3. **Binary Search Iterations**:
   - In each iteration of binary search, we calculate the mid-point of the current search range and simulate the allocation of books with a maximum of that mid-point pages.

4. **Iteration 1**:
   - Mid-point: 146
   - Simulation: Student 1 gets books [12, 34, 67], and Student 2 gets book [90]. We need 2 students.
   - Since 2 students are less than or equal to M, we update `ans` to 146 and move the search range to `[90, 145]`.

5. **Iteration 2**:
   - Mid-point: 117
   - Simulation: Student 1 gets books [12, 34, 67], and Student 2 gets book [90]. We need 2 students.
   - Since 2 students are less than or equal to M, we update `ans` to 117 and move the search range to `[90, 116]`.

6. **Iteration 3**:
   - Mid-point: 103
   - Simulation: Student 1 gets books [12, 34, 67], and Student 2 gets book [90]. We need 2 students.
   - Since 2 students are less than or equal to M, we update `ans` to 103 and move the search range to `[90, 102]`.

7. **Iteration 4**:
   - Mid-point: 90
   - Simulation: Student 1 gets books [12, 34, 67, 90]. We need 1 student.
   - Since 1 student is less than or equal to M, we update `ans` to 90. We don't need to move the search range anymore.

8. **Conclusion**:
   - The minimum maximum pages allocated to a student, `ans`, is 90. This means you can allocate the books in such a way that no student gets more than 90 pages.

This binary search approach efficiently finds the minimum maximum pages while allocating books to students.



## Code: 

```java
// Function to find the minimum number of pages.
public static int findPages(int[] A, int N, int M) {
    // Initialize the search range for the maximum pages allocated to a student.
    int start = Arrays.stream(A).max().orElse(0);
    int end = Arrays.stream(A).sum();
    
    // If the number of students M is greater than the total number of books N,
    // it's not possible to allocate each student at least one book.
    if (M > N) {
        return -1;
    }
    
    int ans = -1;
    while (start <= end) {
        int mid = start + (end - start) / 2;
        
        // Calculate the total number of students needed for the current range.
        int totalStudent = totalPagesToStudentAllocation(A, mid);
        
        if (totalStudent > M) {
            // Allocated pages are insufficient for M students, so increase the maximum pages.
            start = mid + 1;
        } else {
            // Allocated pages are sufficient for M students, update the ans and decrease the maximum pages.
            ans = mid;
            end = mid - 1;
        }
    }
    return ans;
}

// Helper function to simulate allocation and calculate the total students needed for a given range.
private static int totalPagesToStudentAllocation(int[] pages, int range) {
    int studentNeed = 1; // Initialize the number of students needed to 1.
    long pageStudent = 0; // Initialize the current student's allocated pages to 0.
    
    for (int i = 0; i < pages.length; i++) {
        if (pages[i] + pageStudent > range) {
            // If adding the pages of the current book exceeds the allocated range,
            // allocate the current book to a new student, and reset the allocated pages.
            pageStudent = pages[i];
            studentNeed++;
        } else {
            // Allocate the pages of the current book to the current student.
            pageStudent += pages[i];
        }
    }
    
    return studentNeed; // Return the total number of students needed.
}
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





