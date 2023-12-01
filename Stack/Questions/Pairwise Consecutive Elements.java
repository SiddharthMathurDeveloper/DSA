class GFG {
    public static boolean pairWiseConsecutive(Stack<Integer> st) {
        // Ensure the stack size is even
        if (st.size() % 2 != 0) {
            st.pop();  // If the size is odd, pop one element to make it even
        }

        // Check pairwise consecutive elements
        while (!st.isEmpty()) {
            int top = st.pop();
            int belowTop = st.pop();

            // Check if the absolute difference is 1
            if (Math.abs(top - belowTop) != 1) {
                return false;
            }
        }

        return true;
    }
}
