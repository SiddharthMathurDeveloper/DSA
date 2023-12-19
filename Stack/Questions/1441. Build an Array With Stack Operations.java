
/* Solution 1
TC -> O(N)
SC -> O(2N)
*/

class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int[] temp = new int[101]; // Assuming elements in target are between 1 and 100

        // Count the frequency of each element in target
        for (int element : target) {
            temp[element]++;
        }   

        int lastElement = target[target.length - 1];

        // Iterate from 1 to the last element in target
        for (int i = 1; i <= lastElement; i++) {
            ans.add("Push"); // Always push the current number

            // If the current number is not in the target array, add "Pop" to the result
            if (temp[i] != 1) {
                ans.add("Pop");
            }
        }

        return ans;
    }
}



/* Solution 2
TC -> O(N)
SC -> O(N)
*/

class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int i = 1, j = 0;
        Stack<Integer> stack = new Stack<>();

        // Iterate through numbers from 1 to n
        while (i <= n && j < target.length) {
            // Push the current number onto the stack
            stack.push(i);
            ans.add("Push");

            // Check if the top of the stack matches the current target element
            if (stack.peek() == target[j]) {
                j++; // Move to the next target element
            } else {
                // If not, pop the element from the stack and add "Pop" to the result
                stack.pop();
                ans.add("Pop");
            }

            i++; // Move to the next number
        }

        return ans;
    }
}

/* Solution 3
TC -> O(N)
SC -> O(1)
*/


class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int targetLength = target.length;

        int j = 0;
        int index = 1;

        // Iterate through the indices and build the array
        while (j < targetLength && index <= n) {
            ans.add("Push");

            // If the current target element is equal to the current index, move to the next target element
            if (target[j] == index) {
                j++;
            } else {
                // If not, add "Pop" to the result (skipping an element in the process)
                ans.add("Pop");
            }

            index++;
        }

        return ans;
    }
}







