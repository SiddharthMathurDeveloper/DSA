```java


  class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;

        int sumOfBothDiagonal = 0;
        for(int i=0;i<n;i++){
            sumOfBothDiagonal+=mat[i][i]; // primary diagonal 
            sumOfBothDiagonal+=mat[i][n-i-1]; // Secondary diagonal
        }

        if(n%2!=0){
          int midElement = mat[n/2][n/2];

          sumOfBothDiagonal-=midElement; // subract the middle 

        }

        return sumOfBothDiagonal;
    }
}


```
