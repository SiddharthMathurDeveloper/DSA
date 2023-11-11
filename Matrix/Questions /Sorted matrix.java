// Using Priority Queue
class Solution {
    // Method to sort a given square matrix
    int[][] sortedMatrix(int N, int Mat[][]) {
        // Creating a PriorityQueue to store numbers in sorted order
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        // Adding all elements of the matrix to the priority queue to sort them
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                numbers.add(Mat[i][j]);
            }
        }

        // Rebuilding the matrix with sorted elements by removing them from the priority queue
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Mat[i][j] = numbers.remove();
            }
        }

        return Mat; // Returning the sorted matrix
    }
}



// Using Array


class Solution {
    // Method to sort a given square matrix
    ArrayList<Integer> ar = new ArrayList<>();

    int[][] sortedMatrix(int N, int Mat[][]) {
        // Storing all elements of the matrix in an ArrayList
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                ar.add(Mat[i][j]);
            }
        }

        // Sorting the ArrayList to arrange the elements in ascending order
        Collections.sort(ar);

        int h = 0;
        // Reconstructing the matrix with the sorted elements from the ArrayList
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Mat[i][j] = ar.get(h++);
            }
        }

        return Mat; // Returning the sorted matrix
    }
}














