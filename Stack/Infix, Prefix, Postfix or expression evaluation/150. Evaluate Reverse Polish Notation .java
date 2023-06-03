package DSA.Stack.expressions;

import java.util.Stack;



public class ReversePolishNotation {

    public static void main(String[] args) {
        String[] tokens = {"2","1","+","3","*"};

        Solution solution = new Solution();

        
        System.out.println(solution.evalRPN((  tokens   )));


    }

}

class Solution {


    public int evalRPN(String[] tokens) {

        Stack<Integer> mainStack = new Stack<Integer>();

        int sumOfReversePolishNotation = 0;

        for (String token : tokens) {

            if (isOperator(token)) {
              int  operand2 =  mainStack.pop();
              int  operand1 =  mainStack.pop();

              int expressionsValue = getResultAccordingToOperator(operand1, operand2, token);

              mainStack.push(expressionsValue);

            } else {
                mainStack.push(Integer.parseInt(token));
            }

        }

        while(!mainStack.empty()){
                sumOfReversePolishNotation+=mainStack.pop();
        }
        return sumOfReversePolishNotation;
    }







    private boolean isOperator(String operator) {
        switch (operator) {
            case "+", "-", "*", "/":
                return true;
        }
        return false;
    }




    private int getResultAccordingToOperator(int operand1, int operand2, String operator) {

        int sum = 0;

        switch (operator) {
            case "+":
                    sum = operand1 + operand2;
                break;
            case "-":
                    sum = operand1 - operand2;
                break;
            case "*":
                    sum = operand1 * operand2;
                break;
            case "/":
                    sum = operand1 / operand2;
                break;

        }
        return sum;
    }

}
