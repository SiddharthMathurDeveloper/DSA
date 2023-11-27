class Solution {
    public int calPoints(String[] operations) {
        // Create a stack to keep track of valid points
        Stack<Integer> stack = new Stack<>();
        int ans = 0;

        // Iterate through the array of operations
        for (String operation : operations) {
            switch (operation) {
                case "+" -> {
                    // For "+", calculate the sum of the last two valid points and add to the stack and ans
                    int topValue = stack.peek();
                    stack.pop();
                    int previousValue = stack.peek();
                    stack.push(topValue);
                    int sumOfBothValue = previousValue + topValue;
                    stack.push(sumOfBothValue);
                    ans += sumOfBothValue;
                    break;
                }
                case "D" -> {
                    // For "D", double the last valid point and add to the stack and ans
                    int topValue = stack.peek();
                    int multipliedValue = topValue * 2;
                    stack.push(multipliedValue);
                    ans += multipliedValue;
                    break;
                }
                case "C" -> {
                    // For "C", remove the last valid point from the stack and subtract from ans
                    ans -= stack.peek();
                    stack.pop();
                    break;
                }
                default -> {
                    // For numeric values, convert the string to an integer, add to the stack and ans
                    int stringToInt = Integer.parseInt(operation);
                    stack.push(stringToInt);
                    ans += stringToInt;
                }
            }
        }

        return ans;
    }
}
