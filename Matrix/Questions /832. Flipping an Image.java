class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

        int[][] copyImage = copyMatrix(image);


        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){

                int temp =  copyImage[i][n - j - 1];

                copyImage[i][n - j - 1] = copyImage[i][j];

                copyImage[i][j] = temp;
            }
        }


        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                copyImage[i][j] = copyImage[i][j]==1 ? 0 : 1;
            }
        }

        return copyImage;
    }
}




    public static int[][] copyMatrix(int[][] original) {
        int rows = original.length;
        int cols = original[0].length;
        int[][] copy = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            copy[i] = Arrays.copyOf(original[i], cols);
        }

        return copy;
    }
}
