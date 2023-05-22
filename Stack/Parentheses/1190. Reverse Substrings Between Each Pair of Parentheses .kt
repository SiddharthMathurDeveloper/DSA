
[Apporoach (Stack Method)]
----------------------------------------------------------------- 

fun reverseParentheses(s: String): String {
    val mainStack:Stack<Char>  = Stack<Char>();

    var resultParenthese:String="";

    s.forEach { character->

        if(character!=')'){
            mainStack.push(character);
        }
        else if(character==')'){

           while (mainStack.peek()!='('){
               resultParenthese+=mainStack.peek();
               mainStack.pop()
           }
            mainStack.pop();
            resultParenthese.forEach {
                mainStack.push(it)
            }
            resultParenthese="";

        }
        else{
            resultParenthese+=character;
        }

    }

    while (!mainStack.empty()){
        resultParenthese+=mainStack.peek();
        mainStack.pop();
    }

   return resultParenthese.reversed();
}
