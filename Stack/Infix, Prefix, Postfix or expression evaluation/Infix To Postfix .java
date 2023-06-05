
import java.util.Stack;

public class infixToPostfix {
    public static void main(String[] args) {
        System.out.println(infixToPostfix("a+b*(c^d-e)^(f+g*h)-i"));

    }
    public static String infixToPostfix(String infixExpression) {
        Stack<Character> mainStack = new Stack<Character>();

        String postfixExpression = new String();


        for (Character character:infixExpression.toCharArray()) {
            if (Character.isLetterOrDigit(character)) {
                postfixExpression+=character;
            }
            else if(character=='('){
                mainStack.push(character);
            }

            else if (character==')'){
                while (!mainStack.empty() && mainStack.peek()!='(') {
                    postfixExpression+=mainStack.pop();
                }
                mainStack.pop();
            }

            else {
                while (!mainStack.empty() &&  operatorPrecedence(mainStack.peek())>=operatorPrecedence(character)){
                        postfixExpression+=mainStack.pop();
                }


               mainStack.push(character);
            }

        }


        while (!mainStack.empty()){
            postfixExpression+=mainStack.pop();
        }



        return  postfixExpression;
    }

    private  static  int operatorPrecedence(char operator){


        switch (operator) {
            case '+', '-' -> {
                return 1;
            }
            case '*', '/' -> {
                return 2;
            }
            case '^' -> {
                return 3;
            }
        }
         return -1;
    }



}




