class Solution {
    public int matrixSum(int[][] grid) {
        int gridRow = grid.length;
        int gridCol = grid[0].length;

        for(int [] arr: grid){
            Arrays.sort(arr);
        }



        int sumOfMaxAmongRows=0;

        for(int col=0;col<gridCol; col++){
            int maxInColumn = Integer.MIN_VALUE;
            for(int row=0 ; row<gridRow ; row++){
                maxInColumn = Math.max( maxInColumn,grid[row][col] );
            }

            sumOfMaxAmongRows+=maxInColumn;
        }

        return sumOfMaxAmongRows;
    }
}
