public class Leetcode {
    public static String postfixToInfix(String exp){
        Stack<String> mainStack = new Stack<String>();

        int expLength = exp.length();

        for (Character character : exp.toCharArray()) {
            if(Character.isLetterOrDigit(character)){
                   mainStack.push(character.toString());
            }
            else{
              String operand2 = mainStack.pop();  // stack way
              String operand1 = mainStack.pop();
              char operator = character;

              mainStack.push('(' + operand1 + operator + operand2 +')');
            }

            
        }

        String infixExpression = mainStack.pop();
        return infixExpression;

    }

    public static void main(String[] args) {
        String postfixExpression = "ab*cd/+";
      System.out.println(  postfixToInfix(postfixExpression));
        
    }
}
