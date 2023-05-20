[Apporoach (Count Method)]
------------------------------------------------------------------------------------------
 
 fun minAddToMakeValid(s: String): Int {

        var countOpen:Int = 0;
        var countClose:Int = 0;

        s.forEach{parentheses ->
            if(parentheses == '('){
                    countOpen++;
            }
           else if(countOpen>0){
                    countOpen--;
            }
                else{               // for '))))' these case not '()' case
                    countClose++;
                }
            }

            return countOpen+countClose;

  }  

 
 
 
 [Apporoach (Stack Method)]
-----------------------------------------------------------------
 
 
 
  fun minAddToMakeValid(s: String): Int {
        val mainStack :Stack<Char> = Stack<Char>();

        s.forEach {parentheses ->
            if(!mainStack.empty()  && (mainStack.peek()=='(' && parentheses==')')){  // stack should not be empty
                mainStack.pop();

            }
            else {
                mainStack.push(parentheses);
            }
        }


        return mainStack.size;
        
    }
