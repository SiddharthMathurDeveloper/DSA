class Solution {
    public int largestOverlap(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        
        // Two lists to save pixel coordinates for A and B
        List<int[]> la = new ArrayList<>(), lb = new ArrayList<>(); 

        // Iterate through each pixel in A and B
        for (int r = 0; r < rows; r++)
            for (int c = 0; c < cols; c++){
                // If the pixel in A is 1, save its coordinates
                if (A[r][c] == 1) la.add(new int[]{r, c});
                
                // If the pixel in B is 1, save its coordinates
                if (B[r][c] == 1) lb.add(new int[]{r, c});
            }

        // Map to map the vector (from a pixel in A to a pixel in B) to its count
        Map<String, Integer> map = new HashMap<>(); 

        // Iterate through each pair of pixel coordinates (one from A and one from B)
        for (int[] pa : la)
            for (int[] pb : lb) {
                // Get the vector from a pixel in A to a pixel in B
                String s = (pa[0] - pb[0]) + " " + (pa[1] - pb[1]); 
                
                // Count the number of same vectors
                map.put(s, map.getOrDefault(s, 0) + 1);
            }

        int max = 0;

        // Iterate through the counts in the map and find the maximum
        for (int count : map.values())
            max = Math.max(max, count);

        return max;
    }
}
