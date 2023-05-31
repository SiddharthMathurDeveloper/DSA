class Expression{

    private int Prec(char ch)
    {
        switch (ch) {
        case '+':
        case '-':
            return 1;
  
        case '*':
        case '/':
            return 2;
  
        case '^':
            return 3;
        }
        return -1;
    }



    private String revStr1(String s){
        int len = s.length();
        String newString = "";

        for(int i= len-1 ;i>=0;i--){
            if(s.charAt(i)=='('){
                newString+=')';
            }
            else if(s.charAt(i)==')'){
                newString+='(';
            }
            else{
            newString+=s.charAt(i);
            }
        }
        return newString;



    }

    private String revStr2(String s){
        int len = s.length();
        String newString = "";

        for(int i= len-1 ;i>=0;i--){
            if(s.charAt(i)==')'){
                newString+='(';
            }
            else if(s.charAt(i)=='('){
                newString+=')';
            }
            else{
            newString+=s.charAt(i);
        }
        }
        return newString;



    }

    


  public  String infixToPrefix(String exp)   {
    String newString = revStr1(exp);
    String postfixExpression = new String("");
    

    Stack<Character> mainStack = new Stack<Character>();

    for (Character character : newString.toCharArray()) {

        if (Character.isLetterOrDigit(character)) {
            postfixExpression+=character;
        } 
        else if(character=='('){
                mainStack.push(character);
        }
        else if(character==')'){
            while(!mainStack.isEmpty() && mainStack.peek() != '('){
                postfixExpression+=mainStack.peek();
                mainStack.pop();
            }

            if(!mainStack.isEmpty() && mainStack.peek() != '(' ){
                return "Invaild";
            }

            mainStack.pop();
        }

        else{
            while(!mainStack.isEmpty() && Prec(character)<Prec(mainStack.peek())){
                postfixExpression+=mainStack.peek();
                mainStack.pop();

            }
            mainStack.push(character);
        }
        
    }

    while (!mainStack.isEmpty()) {
        if (mainStack.peek() == '(') {
            return "This expression is invalid";
        }
        postfixExpression+=mainStack.peek();
        mainStack.pop();
        
    }
    postfixExpression = revStr2(postfixExpression);


    return postfixExpression;
        
    }
}
